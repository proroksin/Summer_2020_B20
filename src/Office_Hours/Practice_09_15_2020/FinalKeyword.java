package Office_Hours.Practice_09_15_2020;

import day33_LocalDateTime.SortDescending;

public class FinalKeyword {

    private final int c = 200;//cannot be modified, because FINAL

    public int getC() {//read only
        return c;
    }

    public void setC(int c){//modify only
        //this.c = c;
    }

    // final static int z = 300;
    final private String userName = "cybertek";
    final private String password = "Cybertek123";

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


    public static void main(String[] args) {
        final int a = 100;
        //a = 200;
    }

}

class TestBase{
    //@BeforeMethods
    public final void setUp(){
        System.out.println("Set Up the driver");
        System.out.println("Open the browser");
        System.out.println("URL");
        System.out.println("Maximize window");
        System.out.println("Implicit wait");
    }
    public void tearDown() {
        System.out.println("if failed take screenshot");
        System.out.println("Close Browser");
    }
}


class TestCase extends TestBase {

    //@Test
    //public void setUp(){ // final method cannot be override

    }


}