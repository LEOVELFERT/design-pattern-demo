package creational.singleton.withsingleton;

public class AppSettings {
    //step 1: create static instance of this class
    private static AppSettings instance;

    private String dataBaseUrl;
    private String appKey;

    //step 2: make constructor as private so that objection is restricted
    private AppSettings() {
        //some how we got databaseUrl
        this.dataBaseUrl = "databaseUrl";
        this.appKey = "appKey";
    }

    public String getDataBaseUrl() {
        return dataBaseUrl;
    }

    //step 3: create static getInstance method and assign instance object only if instance object is null
    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

}