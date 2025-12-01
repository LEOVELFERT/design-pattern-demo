package creational.singleton.withoutsingleton;

public class Client {
    public static void main(String[] args) {
        AppSettings app1=new AppSettings();
        AppSettings app2=new AppSettings();

        if(app1==app2){
            System.out.println("the both app are : true");
        }else{
            System.out.println("the both app are : false");
        }

        System.out.println("the base Url---------------> "+app1.getDataBaseUrl());
    }
}
