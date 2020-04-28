package day58_warmUp;



import java.io.FileInputStream;
import java.util.Properties;


public class Warm_Up {

    public static void main(String[] args) {
        Wait(3);
        System.out.println("Batch15");

        Properties property=new Properties();
        String path="\"C:\\Users\\ahali\\Desktop\\Data.properties\"";
        try{
        FileInputStream file=new FileInputStream(path);
        property.load(file);
        }catch (Exception e){
              }
        String Name=property.getProperty("Name");
        System.out.println(Name);
        System.out.println(getData("Name","\"C:\\Users\\ahali\\Desktop\\Data.properties\""));
    }

    public static void Wait(double second) {
        try {
            Thread.sleep((long) (second * 1000));//1 second ==1000 milliseconds
        }
        catch (Exception e) {
             }
    }

public static String getData(String Key,String Path){
        String data="";
    Properties property=new Properties();
    try{
        FileInputStream file=new FileInputStream(Path);
        property.load(file);
    }catch (Exception e){
    }
data=property.getProperty(Key);


        return  data;
}

}
