package day57_Polymorphism.PhoneTask;

public class Huawei extends Phone implements  AndroidApp, AppleApp, Downloadable{
    public Huawei(String brand, String model, String size, double price) {
        super("Huawei", model, size, price);
        if(price > 200) {
            throw new RuntimeException("No way Huawei is worth more than 200");
        }
    }

    public Huawei(String robbery, String s, int price) {
        super(robbery, s, price);
    }

    @Override
    public void download() {
        System.out.println("Huawei is downloading apps from "+AndroidApp.AppStoreName+" and "+AppleApp.AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Huawei is texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Huawei is calling "+phoneNumber);
    }

    public void stealInfo(){
        System.out.println("Huawei is stealing your info");
    }
}
