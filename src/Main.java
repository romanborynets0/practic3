public class Main {

    public static void main(String[] args) {
        Wheel[] wheels = new Wheel[4];
        wheels[0] = new Wheel("Front Left", 17);
        wheels[1] = new Wheel("Front Right", 17);
        wheels[2] = new Wheel("Back Left", 17);
        wheels[3] = new Wheel("Back Right", 17);

        Car Audi = new Car("Audio", "W-211", 2004, 240,false ,new CarAudio("Sony"),wheels);
        Car BMW =new Car("BMW", "Fusion", 2015, 260,true,new CarAudio("Sony"),wheels);
        Truck Mersedes = new Truck("Mersedes", "XF 95", 1998, 130,false,new CarAudio("Dell"),wheels);
        Bus BMW_bus = new Bus("BMW", "A092", 2011, 90,false,new CarAudio("HP"),wheels);


        Audi.carAudio.addTrack("Track 1");
        Audi.carAudio.addTrack("Track 2");
        Audi.carAudio.addTrack("Track 3");
        Audi.carAudio.addTrack("Track 4");
        Audi.carAudio.deleteTrack("Track 1");
        Audi.carAudio.ListTracks();
        Audi.carAudio.findTrack("Track 4");
        Audi.aboutThisCar();
        Audi.start();
        Audi.stop();
        Audi.move(10);

        Mersedes.carryCargo("Kiev","Milk");
        BMW_bus.carryPersons("School",16);
    }
}