package day44_Constructor;
/*
declear:

		Access-Modifier  className(){
				statements;
		}
 */
public class ConstructorIntro {

    public ConstructorIntro(String arr){
        System.out.println("Hello"+arr);
        System.out.println("How are you "+arr);
    }

    public static void main(String[] args) {

        //ConstructorIntro obj = new ConstructorIntro(10);

        //ConstructorIntro obj2 = new ConstructorIntro();

        ConstructorIntro obj3 = new ConstructorIntro(" Sam");
        ConstructorIntro obj4 = new ConstructorIntro(" Son");
        ConstructorIntro obj5 = new ConstructorIntro(" Sap");


    }
}
