public class Vehicle {
    String type = "4W";
    int maxS = 100;

    public Vehicle() {
    }

    Vehicle(String type, int maxS){
        this.type = type;
        this.maxS = maxS;


    }
}
class Car extends Vehicle{
    String trans;

    public Car(String trans) {
        this.trans = trans;
    }

    public Car(String type, int maxS, String trans) {
        super(type, maxS);
        this.trans = trans;
    }

}class Main{
    public static void main(String[] args) {
        Car c1 = new Car("Auto");
        Car c2 = new Car("4W",150,"Manuel");
        System.out.println(c1.type + " " + c1.maxS + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxS + " " + c2.trans);
    }
}
