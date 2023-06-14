package Server;

import Shared.Games;
import Shared.SteamService;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.Scanner;

public class ServerMain {
    public static void main(String[] args) throws IOException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "tahanha03";

        Connection connection = null;

        connection = DriverManager.getConnection(url, user, pass);

        String filePath1 = "src\\main\\java\\Server\\Resources\\292030.txt";

        File file1 = new File(filePath1);

        Scanner sc = new Scanner(file1);

        String id = sc.nextLine();
        String title = sc.nextLine();
        String developer = sc.nextLine();
        String genre = sc.nextLine();
        float price = sc.nextFloat();
        int release_year = sc.nextInt();
        sc.nextLine();
        boolean controller_support = sc.nextBoolean();
        int reviews = sc.nextInt();
        int size = sc.nextInt();

        Games game1 = new Games(id, title, developer, genre, price, release_year, controller_support, reviews, size, null);

        try {
            String sql = "INSERT INTO games (id, title, developer, genre, price, release_year, controller_support, reviews, size, file_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, game1.getId());
            preparedStatement.setString(2, game1.getTitle());
            preparedStatement.setString(3, game1.getDeveloper());
            preparedStatement.setString(4, game1.getGenre());
            preparedStatement.setFloat(5, game1.getPrice());
            preparedStatement.setInt(6, game1.getRelease_year());
            preparedStatement.setBoolean(7, game1.doesController_support());
            preparedStatement.setInt(8, game1.getReviews());
            preparedStatement.setInt(9, game1.getSize());
            preparedStatement.setString(10, game1.getFilePath());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String filePath2 = "src\\main\\java\\Server\\Resources\\323190.txt";

        File file2 = new File(filePath2);

        sc = new Scanner(file2);

        id = sc.nextLine();
        title = sc.nextLine();
        developer = sc.nextLine();
        genre = sc.nextLine();
        price = sc.nextFloat();
        release_year = sc.nextInt();
        sc.nextLine();
        controller_support = sc.nextBoolean();
        reviews = sc.nextInt();
        size = sc.nextInt();

        Games game2 = new Games(id, title, developer, genre, price, release_year, controller_support, reviews, size, null);

        try {
            String sql = "INSERT INTO games (id, title, developer, genre, price, release_year, controller_support, reviews, size, file_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, game2.getId());
            preparedStatement.setString(2, game2.getTitle());
            preparedStatement.setString(3, game2.getDeveloper());
            preparedStatement.setString(4, game2.getGenre());
            preparedStatement.setFloat(5, game2.getPrice());
            preparedStatement.setInt(6, game2.getRelease_year());
            preparedStatement.setBoolean(7, game2.doesController_support());
            preparedStatement.setInt(8, game2.getReviews());
            preparedStatement.setInt(9, game2.getSize());
            preparedStatement.setString(10, game2.getFilePath());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String filePath3 = "src\\main\\java\\Server\\Resources\\359550.txt";

        File file3 = new File(filePath3);

        sc = new Scanner(file3);

        id = sc.nextLine();
        title = sc.nextLine();
        developer = sc.nextLine();
        genre = sc.nextLine();
        price = sc.nextFloat();
        release_year = sc.nextInt();
        sc.nextLine();
        controller_support = sc.nextBoolean();
        reviews = sc.nextInt();
        size = sc.nextInt();

        Games game3 = new Games(id, title, developer, genre, price, release_year, controller_support, reviews, size, null);

        try {
            String sql = "INSERT INTO games (id, title, developer, genre, price, release_year, controller_support, reviews, size, file_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, game3.getId());
            preparedStatement.setString(2, game3.getTitle());
            preparedStatement.setString(3, game3.getDeveloper());
            preparedStatement.setString(4, game3.getGenre());
            preparedStatement.setFloat(5, game3.getPrice());
            preparedStatement.setInt(6, game3.getRelease_year());
            preparedStatement.setBoolean(7, game3.doesController_support());
            preparedStatement.setInt(8, game3.getReviews());
            preparedStatement.setInt(9, game3.getSize());
            preparedStatement.setString(10, game3.getFilePath());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String filePath4 = "src\\main\\java\\Server\\Resources\\489830.txt";

        File file4 = new File(filePath4);

        sc = new Scanner(file4);

        id = sc.nextLine();
        title = sc.nextLine();
        developer = sc.nextLine();
        genre = sc.nextLine();
        price = sc.nextFloat();
        release_year = sc.nextInt();
        sc.nextLine();
        controller_support = sc.nextBoolean();
        reviews = sc.nextInt();
        size = sc.nextInt();

        Games game4 = new Games(id, title, developer, genre, price, release_year, controller_support, reviews, size, null);

        try {
            String sql = "INSERT INTO games (id, title, developer, genre, price, release_year, controller_support, reviews, size, file_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, game4.getId());
            preparedStatement.setString(2, game4.getTitle());
            preparedStatement.setString(3, game4.getDeveloper());
            preparedStatement.setString(4, game4.getGenre());
            preparedStatement.setFloat(5, game4.getPrice());
            preparedStatement.setInt(6, game4.getRelease_year());
            preparedStatement.setBoolean(7, game4.doesController_support());
            preparedStatement.setInt(8, game4.getReviews());
            preparedStatement.setInt(9, game4.getSize());
            preparedStatement.setString(10, game4.getFilePath());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String filePath5 = "src\\main\\java\\Server\\Resources\\1085660.txt";

        File file5 = new File(filePath5);

        sc = new Scanner(file5);

        id = sc.nextLine();
        title = sc.nextLine();
        developer = sc.nextLine();
        genre = sc.nextLine();
        price = sc.nextFloat();
        release_year = sc.nextInt();
        sc.nextLine();
        controller_support = sc.nextBoolean();
        reviews = sc.nextInt();
        size = sc.nextInt();

        Games game5 = new Games(id, title, developer, genre, price, release_year, controller_support, reviews, size, null);

        try {
            String sql = "INSERT INTO games (id, title, developer, genre, price, release_year, controller_support, reviews, size, file_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, game5.getId());
            preparedStatement.setString(2, game5.getTitle());
            preparedStatement.setString(3, game5.getDeveloper());
            preparedStatement.setString(4, game5.getGenre());
            preparedStatement.setFloat(5, game5.getPrice());
            preparedStatement.setInt(6, game5.getRelease_year());
            preparedStatement.setBoolean(7, game5.doesController_support());
            preparedStatement.setInt(8, game5.getReviews());
            preparedStatement.setInt(9, game5.getSize());
            preparedStatement.setString(10, game5.getFilePath());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String filePath6 = "src\\main\\java\\Server\\Resources\\1151640.txt";

        File file6 = new File(filePath6);

        sc = new Scanner(file6);

        id = sc.nextLine();
        title = sc.nextLine();
        developer = sc.nextLine();
        genre = sc.nextLine();
        price = sc.nextFloat();
        release_year = sc.nextInt();
        sc.nextLine();
        controller_support = sc.nextBoolean();
        reviews = sc.nextInt();
        size = sc.nextInt();

        Games game6 = new Games(id, title, developer, genre, price, release_year, controller_support, reviews, size, null);

        try {
            String sql = "INSERT INTO games (id, title, developer, genre, price, release_year, controller_support, reviews, size, file_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, game6.getId());
            preparedStatement.setString(2, game6.getTitle());
            preparedStatement.setString(3, game6.getDeveloper());
            preparedStatement.setString(4, game6.getGenre());
            preparedStatement.setFloat(5, game6.getPrice());
            preparedStatement.setInt(6, game6.getRelease_year());
            preparedStatement.setBoolean(7, game6.doesController_support());
            preparedStatement.setInt(8, game6.getReviews());
            preparedStatement.setInt(9, game6.getSize());
            preparedStatement.setString(10, game6.getFilePath());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String filePath7 = "src\\main\\java\\Server\\Resources\\1174180.txt";

        File file7 = new File(filePath7);

        sc = new Scanner(file7);

        id = sc.nextLine();
        title = sc.nextLine();
        developer = sc.nextLine();
        genre = sc.nextLine();
        price = sc.nextFloat();
        release_year = sc.nextInt();
        sc.nextLine();
        controller_support = sc.nextBoolean();
        reviews = sc.nextInt();
        size = sc.nextInt();

        Games game7 = new Games(id, title, developer, genre, price, release_year, controller_support, reviews, size, null);

        try {
            String sql = "INSERT INTO games (id, title, developer, genre, price, release_year, controller_support, reviews, size, file_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, game7.getId());
            preparedStatement.setString(2, game7.getTitle());
            preparedStatement.setString(3, game7.getDeveloper());
            preparedStatement.setString(4, game7.getGenre());
            preparedStatement.setFloat(5, game7.getPrice());
            preparedStatement.setInt(6, game7.getRelease_year());
            preparedStatement.setBoolean(7, game7.doesController_support());
            preparedStatement.setInt(8, game7.getReviews());
            preparedStatement.setInt(9, game7.getSize());
            preparedStatement.setString(10, game7.getFilePath());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String filePath8 = "src\\main\\java\\Server\\Resources\\1196590.txt";

        File file8 = new File(filePath8);

        sc = new Scanner(file8);

        id = sc.nextLine();
        title = sc.nextLine();
        developer = sc.nextLine();
        genre = sc.nextLine();
        price = sc.nextFloat();
        release_year = sc.nextInt();
        sc.nextLine();
        controller_support = sc.nextBoolean();
        reviews = sc.nextInt();
        size = sc.nextInt();

        Games game8 = new Games(id, title, developer, genre, price, release_year, controller_support, reviews, size, null);

        try {
            String sql = "INSERT INTO games (id, title, developer, genre, price, release_year, controller_support, reviews, size, file_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, game8.getId());
            preparedStatement.setString(2, game8.getTitle());
            preparedStatement.setString(3, game8.getDeveloper());
            preparedStatement.setString(4, game8.getGenre());
            preparedStatement.setFloat(5, game8.getPrice());
            preparedStatement.setInt(6, game8.getRelease_year());
            preparedStatement.setBoolean(7, game8.doesController_support());
            preparedStatement.setInt(8, game8.getReviews());
            preparedStatement.setInt(9, game8.getSize());
            preparedStatement.setString(10, game8.getFilePath());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String filePath9 = "src\\main\\java\\Server\\Resources\\1245620.txt";

        File file9 = new File(filePath9);

        sc = new Scanner(file9);

        id = sc.nextLine();
        title = sc.nextLine();
        developer = sc.nextLine();
        genre = sc.nextLine();
        price = sc.nextFloat();
        release_year = sc.nextInt();
        sc.nextLine();
        controller_support = sc.nextBoolean();
        reviews = sc.nextInt();
        size = sc.nextInt();

        Games game9 = new Games(id, title, developer, genre, price, release_year, controller_support, reviews, size, null);

        try {
            String sql = "INSERT INTO games (id, title, developer, genre, price, release_year, controller_support, reviews, size, file_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, game9.getId());
            preparedStatement.setString(2, game9.getTitle());
            preparedStatement.setString(3, game9.getDeveloper());
            preparedStatement.setString(4, game9.getGenre());
            preparedStatement.setFloat(5, game9.getPrice());
            preparedStatement.setInt(6, game9.getRelease_year());
            preparedStatement.setBoolean(7, game9.doesController_support());
            preparedStatement.setInt(8, game9.getReviews());
            preparedStatement.setInt(9, game9.getSize());
            preparedStatement.setString(10, game9.getFilePath());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String filePath10 = "src\\main\\java\\Server\\Resources\\2050650.txt";

        File file10 = new File(filePath10);

        sc = new Scanner(file10);

        id = sc.nextLine();
        title = sc.nextLine();
        developer = sc.nextLine();
        genre = sc.nextLine();
        price = sc.nextFloat();
        release_year = sc.nextInt();
        sc.nextLine();
        controller_support = sc.nextBoolean();
        reviews = sc.nextInt();
        size = sc.nextInt();

        Games game10 = new Games(id, title, developer, genre, price, release_year, controller_support, reviews, size, null);

        try {
            String sql = "INSERT INTO games (id, title, developer, genre, price, release_year, controller_support, reviews, size, file_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, game10.getId());
            preparedStatement.setString(2, game10.getTitle());
            preparedStatement.setString(3, game10.getDeveloper());
            preparedStatement.setString(4, game10.getGenre());
            preparedStatement.setFloat(5, game10.getPrice());
            preparedStatement.setInt(6, game10.getRelease_year());
            preparedStatement.setBoolean(7, game10.doesController_support());
            preparedStatement.setInt(8, game10.getReviews());
            preparedStatement.setInt(9, game10.getSize());
            preparedStatement.setString(10, game10.getFilePath());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ServerSocket serverSocket = new ServerSocket(8888);
        //Steam steam = new Steam(20);
        System.out.println("Waiting for clients...");


        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");///
            SteamService steamService = new SteamService(socket, connection);
            Thread thread = new Thread(steamService);
            thread.start();
        }


    }
}

