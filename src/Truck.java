public class Truck extends Car {

    public Truck(String carManufacturer, String carModel, int yearProduction, int maxSpeed, boolean isLeasing,CarAudio carAudio, Wheel[] wheels) {
        super(carManufacturer, carModel, yearProduction, maxSpeed, isLeasing,carAudio, wheels);
    }

    public void carryCargo(String destination, String nameCargo) {

        System.out.println("Вантажівка перевозить " + nameCargo + " до " + destination);
    }
}

