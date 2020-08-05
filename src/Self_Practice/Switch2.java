package Self_Practice;

public class Switch2 {
    public static void main(String[] args) {
        int num =4;
        String result = "";

        switch(num){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wendsday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sundauy";
                break;
            default:
                result = "Invalid";
        }
        System.out.println(result);
    }
}
