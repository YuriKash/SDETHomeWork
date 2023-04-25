package class12;

public class CarTester {
    public static void main(String[] args) {


    Car car=new Car();

    car.make="Toyota";
    car.model="Camry";
    car.color="White";
    car.year=2023;
    car.isAutoTrans=true;
    car.carDrives();
    car.carRuns();
    car.playingMusic();

    Car car1=new Car();
    car1.year=2022;
    car1.color="Black";
    car1.make="Tesla";
    car1.carRuns();




    }

}
