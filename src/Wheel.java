
public class Wheel {
    String wheelName;
    int radius;


    public Wheel( String wheelName,int radius) {
        this.wheelName = wheelName;
        this.radius = radius;

    }



    public String getWheelName() {
        return wheelName;
    }
    public int getRadius() {
        return radius;
    }




    public String toString() {
        return  "Назва колеса " + wheelName+" Радіус " + radius;
    }
  }
