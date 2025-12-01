package creational.singleton.withoutsingleton;

public class AppSettings {
    private String dataBaseUrl;
    private String appKey;

    public AppSettings(){
        //some how we got databaseUrl
        this.dataBaseUrl="databaseUrl";
        this.appKey="appKey";
    }

    public String getDataBaseUrl() {
        return dataBaseUrl;
    }

}
