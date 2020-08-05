package Office_Hours.Practice_07_15_2020;

public class Frequency_OfWords2 {

    public static void main(String[] args) {
        String str = "JavajavaJavajavaJAVA".toLowerCase();
        //Scanner scan = new Scanner(System.in);
        //String str = "";
        //str = str.toLowerCase(); // str = "javajavajavajavajava"
                                   // str = "javajavajavajava"
                                   // str = "javajavajava"
                                   // str = "javajava"
                                   // str = "java"
                                   // str = ""


        int count = 0;// 1 + 1 + 1 + 1 + 1
        while(str.contains("java")){ // true true true true true false
            count++;
            str = str.replaceFirst("java","");//removes one java from the string
        }
        System.out.println(count);




    }
}
