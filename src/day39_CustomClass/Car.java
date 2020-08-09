package day39_CustomClass;

public class Car {
    /*
    Attributes:
            model,color,make,color,mileage,vin
     */

    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void setInfo(String carBrand, String carModel, int carYear, String carColor,
                        double carMileage, double carPrice) {
        ;
        // sets the info of the car objects

        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;

        /*
        car1:
        toyota
        car2:
        bmw
        car3:
        Tesla
                */

        //2012 Toyota Corolla, Red, 10000, $45000

    }
    public void getCarInfo () {
        System.out.println(year + " " + brand + " " + model + ", " + color + ", " + mileage + ", $" + price);
    }

    public void start(){
        System.out.println(brand+" "+model+" is started");
    }

}