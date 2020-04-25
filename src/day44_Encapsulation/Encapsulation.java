package day44_Encapsulation;

public class Encapsulation {
    /**  Encapsulation is the concept that hiding the instance variable!!
     * 1.hide the data by giving private access modifier
     *       (private:only visible(accessible) within the class
     * 2.grant other classes get access to the
     * private instance variable through public getter/setter
     *
     *    getter(reader):instance method, returns the private instance variable!!
     *           return-type of the getter MUST match with the
     *           data-type of the instance variable
     *    setter(modify): instance method, return type is void,passes a parameter
     *           The parameter data type MUST match ...same
     */
}
 class Credentials {
    /**
     * userName
     * password
     */
    private String username="halis";
    private String password="ozha";
    //=========================================
    //getter(Reader)
    public String getUserName() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    //setter(Modify)
    public void setUserName(String username) {
        this.username=username;
    }
    public void setPassword(String password) {
        this.password=password;
    }



}
/*
 short cut getterand setter:
 1.declare private dates
 2.right click-->source-->Generate getter and setters
 3.select the instance variable
 *
 */