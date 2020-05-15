package day41_Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();// No ARG CONSTUCTOR BEING CALLED!!
        Singleton s2=Singleton.getInstance();// We already have this object
        Singleton s3=Singleton.getInstance();// We already have this object
        Singleton s4=Singleton.getInstance();// We already have this object
    }

}




