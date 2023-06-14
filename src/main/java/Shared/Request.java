package Shared;

import org.json.*;


public class Request {
    private JSONObject jsonObject;

    public String com() {
        return jsonObject.toString();
    }

    public Request(String request) {
        this.jsonObject = new JSONObject();
        jsonObject.put("Request", request);
    }

    public void infoAboutAGame(String title) {
        jsonObject.put("infoAboutAGame", title);
    }

    public void downloadAGame(String title, String username) {
        jsonObject.put("downloadAGame", title);
        jsonObject.put("username", username);
    }

}
