package Office_Hours.Practice_07_15_2020;

public class Frequency_Of_Words {

    public static void main(String[] args) {

        String str = "dogdogdog dog cat cat cat cat Dog";
        str = str.toLowerCase();



        int countOfDog = 0;
        while(str.contains("dog")){
            str= str.replaceFirst("dog","");
            countOfDog++;
        }

        int countOfCat = 0;
        while(str.contains("cat")){
            str= str.replaceFirst("cat","");
            countOfCat++;
        }
        System.out.println("Cat:" +countOfCat);
        System.out.println("Dog:" +countOfDog);

        System.out.println(countOfCat==countOfDog);

    }
}
