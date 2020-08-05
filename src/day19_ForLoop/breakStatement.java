package day19_ForLoop;

public class breakStatement {

    public static void main(String[] args) {

        for(int i = 0; i < 5;i++){
            System.out.println("hello");
            break;
        }

        System.out.println("========================");

        for(char ch = 'A'; ch<= 'H'; ch++){// CH: A B
            System.out.print(ch+" ");// A

            if(ch == 'C'){
                break;
            }
        }
        System.out.println("");
        System.out.println("===================");

        for(int i = 10; i <=50; i+=10){//i:10, 20, 30, 40, 50

            if(i ==30){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("============================");

        for(int x =1000; x>= 100; x -= 100){//: 1000,900,800,700,600,50,400,300,200,00
            if(x ==500){
                break; // exits the Loop
            }
            System.out.print(x+" ");// 1000
        }




    }
}
