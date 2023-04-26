import java.util.Arrays;

public class Car {
    String carManufacturer;
    String carModel;
    int yearProduction;
    int maxSpeed;
    boolean isLeasing;
    CarAudio carAudio;
    Wheel[] wheels;

    public Car(String carManufacturer, String carModel, int yearProduction, int maxSpeed,boolean isLeasing, CarAudio carAudio,Wheel[] wheels ) {
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.yearProduction = yearProduction;
        this.maxSpeed = maxSpeed;
        this.isLeasing = isLeasing;
        this.carAudio = carAudio;
        this.wheels = wheels;
    }

    public void move (int distance) {

        System.out.println(carManufacturer+" "+carModel+" move "+distance+" km");
    }
    public void start() {
        System.out.println("engine is started");
    }
    public void stop() {
        System.out.println("engine turn off");
    }
    public void aboutThisCar(){
        System.out.println("Виробник - "+carManufacturer);
        System.out.println("Модель автомобіля - "+ carModel);
        System.out.println("Рік випуску - "+yearProduction);
        System.out.println("Максимальна швидкість - "+maxSpeed);
        System.out.println("Чи була у Лізингу - "+isLeasing);
        System.out.println("Музика у авто - "+carAudio);
        System.out.println("Колес:"+ Arrays.toString(wheels));
    }
}

