package creational.singleton.withsingleton;


public class Client {
    public static void main(String[] args) {
        AppSettings app1 = AppSettings.getInstance();
        AppSettings app2 = AppSettings.getInstance();

        if (app1 == app2) {
            System.out.println("the both app are : true");
        } else {
            System.out.println("the both app are : false");
        }

        System.out.println("the base Url---------------> " + app1.getDataBaseUrl());
    }
}
