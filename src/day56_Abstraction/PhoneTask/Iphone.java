package day56_Abstraction.PhoneTask;

public final class Iphone extends Phone{

    public Iphone(String brand, String model, double price, String size) {
        super("Iphone", model, price, size);
        if(price <=0||price>1500){
            throw new RuntimeException("Invalid price :"+price);
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }


    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone s texting "+phoneNumber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    public void faceTime(long phoneNumber){// only unique for iphone
        System.out.println("Iphone is facetime");
    }

    public void faceTiming(long phoneNumber){ // only unique for ipnone
        System.out.println("Iphone is facetiming with "+phoneNumber);
    }

    public void faceTime(long num1, long num2){
        faceTiming(num1);
        faceTiming(num2);
    }
    }
