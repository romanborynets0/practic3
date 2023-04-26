public class Bus extends Car {

    public Bus(String carManufacturer, String carModel, int yearProduction, int maxSpeed,boolean isLeasing, CarAudio carAudio, Wheel[] wheels) {
        super(carManufacturer, carModel, yearProduction, maxSpeed, isLeasing, carAudio, wheels);
    }

    public void carryPersons(String destination, int countPerson) {
        System.out.println("Автобус перевозить " + countPerson + " людей до " + destination);
    }
}
