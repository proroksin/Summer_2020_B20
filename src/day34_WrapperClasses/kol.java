package day34_WrapperClasses;
import java.util.ArrayList;
public class kol {
    public static void main(String[] args) {
        ArrayList<Integer>oddList = new ArrayList<>(); // 1,3,5,7...99
        ArrayList<Integer>evenList = new ArrayList<>(); // 2,4,6,8...100


        for(int each : oddList) {
            if(each % 2 == 0) {
                oddList.add(each);
            } else {
                evenList.add(each);
            }
        }
        for(int each : evenList) {
            if(each % 2 == 0) {
                oddList.add(each);
            } else {
                evenList.add(each);
            }
        }
        System.out.println(oddList);
        System.out.println(evenList);

        System.out.println("==============================");

        ArrayList<String>groceryList = new ArrayList<>();
        groceryList.add("Milk");
        groceryList.add("Apple");
        groceryList.add("Eggs");
        groceryList.add("Mango");
        groceryList.add("Ice cream");

        for(int i = groceryList.size()-1; i >=0; i--){
             System.out.print( groceryList.get(i) +"   ");
        }

    }
}
