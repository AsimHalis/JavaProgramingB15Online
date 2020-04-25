package day55_56UpCasting;



class webdriver {

    public void get() {

        System.out.println("webdriver");
    }
}


class chromedriver extends webdriver{


    @Override
    public void get(){
        System.out.println("chrome driver ==>buradaki methodlari uygular");
    }
}

public class OOPSummary {
    public static void main(String[] args) {

        webdriver driver=new chromedriver();
        driver.get();

    }
}
