package Client;
import org.json.JSONArray;
import org.json.JSONObject;

import Shared.Request;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int choice;
        String username, password, dataOfBirth, command;
        final int port = 8888;
        try {
            Socket socket = new Socket("localhost", port);
            System.out.println("Connected to server!");

            InputStream instream = socket.getInputStream();
            OutputStream outstream = socket.getOutputStream();
            Scanner in = new Scanner(instream);
            PrintWriter out = new PrintWriter(outstream);

            System.out.println("Welcome to Steam!");
            Thread.sleep(2000);
            System.out.println("How would you like to continue?");
            System.out.println("1. Login as User");
            System.out.println("2. Sign up as User");
            System.out.println("3. Exit store");

            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter your username : ");
                username = sc.next();
                System.out.println("Enter your password : ");
                password = sc.next();
                System.out.println("Enter date of birth : ");
                dataOfBirth = sc.next();
                command = "LOGIN" + " " + username + " " + password + " " + dataOfBirth;
                System.out.println(command);
                out.print(command + "\n");
                out.flush();
            }
            if (choice == 2) {
                System.out.println("Enter your username : ");
                username = sc.next();
                System.out.println("Enter your password : ");
                password = sc.next();
                System.out.println("Enter date of birth : ");
                dataOfBirth = sc.next();
                command = "SIGNUP" + " " + username + " " + password + " " + dataOfBirth;
                System.out.println(command);
                out.print(command + "\n");
                out.flush();
            }
            if (choice == 3) {
                System.exit(0);
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void userMenu(String username, DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        Scanner sc = new Scanner(System.in);
        Request request;
        while (true) {
            System.out.println("Choose an option");
            System.out.println("1. Available games");
            System.out.println("2. Info about a specific game");
            System.out.println("3. Download a game");
            System.out.println("4. Close Steam");
            int choice = sc.nextInt();
            if (choice == 1) {
                request = new Request("availableGames");
                String jsonTextOutput = request.com();
                dataOutputStream.writeUTF(jsonTextOutput);
                dataOutputStream.flush();
                String jsonTextInput = dataInputStream.readUTF();
                JSONObject jsObj = new JSONObject(jsonTextInput);
                JSONArray titles = jsObj.getJSONArray("availableGames");
                System.out.println(titles);
            }
            if (choice == 2) {
                request = new Request("infoAboutAGame");
                System.out.println("Enter the title of game : ");
                String title = sc.nextLine();
                request.infoAboutAGame(title);
                String jsonTextOutput = request.com();
                dataOutputStream.writeUTF(jsonTextOutput);
                dataOutputStream.flush();
                String jsonTextInput = dataInputStream.readUTF();
                JSONObject jsObj = new JSONObject(jsonTextInput);
                JSONObject specificGame = jsObj.getJSONObject("infoAboutAGame");
                System.out.println(specificGame);
            }
            if (choice == 3) {
                request = new Request("downloadAGame");
                System.out.println("Enter the title of game : ");
                String title = sc.nextLine();
                request.downloadAGame(title, username);
                String jsonTextOutput = request.com();
                dataOutputStream.writeUTF(jsonTextOutput);
                dataOutputStream.flush();
                String jsonTextInput = dataInputStream.readUTF();
                JSONObject jsObj = new JSONObject(jsonTextInput);
                String filePath = jsObj.getString("downloadAGame");
                String fileName = "";
                for (int i = 73; i < filePath.length(); i++) {
                    fileName = fileName + filePath.charAt(i);
                }
                File file = new File("C:\\Users\\Folio\\OneDrive\\Documents\\GitHub\\Eight-Assignment-Steam\\src\\main\\java\\Client\\Downloads\\" + fileName);
                if (!file.exists()) {
                    FileInputStream fileInputStream;
                    FileOutputStream fileOutputStream;
                    try {
                        fileInputStream = new FileInputStream(filePath);
                        fileOutputStream = new FileOutputStream("C:\\Users\\Folio\\OneDrive\\Documents\\GitHub\\Eight-Assignment-Steam\\src\\main\\java\\Client\\Downloads\\" + fileName);
                        int ms;
                        while ((ms = fileInputStream.read()) != -1) {
                            fileOutputStream.write(ms);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    System.out.println("Game successfully downloaded!");
                }
                else if (!file.exists()){
                    System.out.println("You already have this game!");
                }

            }
            if (choice == 4) {
                System.exit(0);
            }

        }


    }
}
