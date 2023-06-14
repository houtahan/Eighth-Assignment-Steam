package Shared;

import org.json.*;
;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Response {
    private JSONObject jsonObject;

    public Response(String response) {
        jsonObject = new JSONObject();
        jsonObject.put("Response", response);
    }

    public String com() {
        return jsonObject.toString();
    }
    public void aListOfAvailableGames(ResultSet resultSet) {
        JSONArray titles = new JSONArray();
        try {
            while (resultSet.next()) {
                String title = resultSet.getString(2);
                titles.put(title);
            }
            jsonObject.put("availableGames", titles);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void infoAboutAGame(ResultSet resultSet) {
        JSONObject gameInfo = new JSONObject();
        try {
            while (resultSet.next()) {
                String id = resultSet.getString(1);
                String title = resultSet.getString(2);
                String developer = resultSet.getString(3);
                String genre = resultSet.getString(4);
                double price = resultSet.getDouble(5);
                int releaseYear = resultSet.getInt(6);
                boolean controllerSupport = resultSet.getBoolean(7);
                int reviews = resultSet.getInt(8);
                int size = resultSet.getInt(9);
                String filePath = resultSet.getString(10);
                gameInfo.put("id", id);
                gameInfo.put("title", title);
                gameInfo.put("developer", developer);
                gameInfo.put("genre", genre);
                gameInfo.put("price", price);
                gameInfo.put("release year", releaseYear);
                gameInfo.put("controller support", controllerSupport);
                gameInfo.put("reviews", reviews);
                gameInfo.put("size", size);
                gameInfo.put("file path", filePath);
                jsonObject.put("infoAboutAGame", gameInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void downloadAGame(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String filePath = resultSet.getString(10);
            jsonObject.put("downloadAGame", filePath);
        }
    }


}
