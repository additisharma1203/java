class Vehicle {
    public int speed;
    public void fuel(){
        System.out.println("fuel of vehicle");
    }
}
class Car extends Vehicle{
    void airConditioning(){
        System.out.println("CAR AC");
    }
}
class Bike extends Vehicle{
    // super.VARNAME
    Bike(){
        super();
    }
    void kickStart(){
        System.out.println("bike kick start");
    }
    @Override public void fuel(){
         super.fuel();  // to call PARENT'S CLASS CONSTRUCTOR 
        System.out.println("Bike fuel");
    }
}

public class Test2{
    public static void main(String[] args){
        Vehicle v=new Vehicle();
        Car c=new Car();
        Bike b=new Bike();
        c.fuel();
        c.airConditioning();
        b.kickStart();
        b.fuel();
    }
}
