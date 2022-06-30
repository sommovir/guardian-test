package org.example;

public class Settings {
    private static Settings _instance = null;
    private String API_KEY = "$ENV";

    private Settings() {
    }

    public static Settings getInstance() {
        if(_instance == null){
            _instance = new Settings();
        }
        return _instance;
    }




}
