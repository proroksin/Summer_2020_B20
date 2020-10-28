package day62_Maps;

import java.awt.*;

public class Test {

    public static void main(String[] args) {

        //String favoriteColor = "Pink

        Color favoriteColor = Color.White;

        System.out.println(favoriteColor);

        //String browserName = "opera";

        Browser browserName = Browser.chrome;

        switch(browserName){

            case chrome:
                System.out.println("Chrome browser is set");
                break;

            case firefox:
                System.out.println("Firefox browser is set");
                break;

            case safari:
                System.out.println("Safari browser is set");
                break;

            case edge:
                System.out.println("Edge browser is set");
                break;
        }
        System.out.println("=========================================");

        Day day = Day.Mon;
        Day day2 = Day.Tue;
        Day day3 = Day.Thu;

        Month month1 = Month.Jan;

        Level level1 = Level.low;
        Level level2 = Level.medium;
        Level level3 = Level.high;
        Level level4 = Level.ChuckNorris;
        //  Level level5 = Level.Khabib;

    }
}
