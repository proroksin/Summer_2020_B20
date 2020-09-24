package day57_Polymorphism;

public class Samsung extends Phone implements Downloadable,AndroidApp {

    public Samsung(String brand, String model, String size, double price) {
        super("Samsung", model, size, price);
        if(price > 1200){
            throw new RuntimeException("Samsung' price cannot be greater than 1200");
        }

    }

    public Samsung(String s20, String s, int i) {
        super(s20, s, i);
    }

    @Override
    public void download() {
        System.out.println("Samsung is downloading app from "+AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }

}
