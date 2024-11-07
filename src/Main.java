interface Device{

    void turnOff();

    void turnOn();

    default void charge(){
        System.out.println("laduje sie urzadzenie");
    }
    static void reset(){
        System.out.println("resetuje sie urzadzenie");
    }

}

class Smartphone implements Device{



    public void turnOff() {
        System.out.println("telefon się wyłączył");
    }


    public void turnOn() {
        System.out.println("telefon się włączył");
    }
}
class Laptop implements Device{
    public void turnOff() {
        System.out.println("laptop został wyłączony");

    }

    public void turnOn() {
        System.out.println("laptop został włączony");

    }
}









public class Main {
    public static void main(String[] args) {

        Device Smartphone = new Smartphone();
        Device Laptop = new Laptop();

        Smartphone.turnOff();
        Smartphone.turnOn();
        Smartphone.charge();
        Laptop.turnOff();
        Laptop.turnOn();
        Laptop.charge();
        Device.reset();
        }
    }
