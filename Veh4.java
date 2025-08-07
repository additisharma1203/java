class Vehicle{
    String brand;
    int speed;
    int end;
    int start;

    Vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    void Start(int s){
        start=s;
        System.out.println("ride starts from: "+s);
    }
    void Stop(int e){
        end=e;
        System.out.println("ride ends from: "+e);
    }
    void displayInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
    }
}
class Car extends Vehicle{
    int numpeople;

    Car(String brand,int speed,int numpeople){
        super(brand,speed);
        this.numpeople=numpeople;
    }

    @Override void displayInfo(){
        super.displayInfo();
        System.out.println("Total fare: "+(end-start)*numpeople*10);
    }
    
}
class Truck extends Vehicle{
    int capacity;
    int numpeople;
    int maxcap=1000;
    Truck(String brand,int speed,int numpeople){
        super(brand,speed);
        this.numpeople=numpeople;
    }
    boolean isIdeal=false;
    void load(int capacity){
        if(capacity>maxcap){
            isIdeal=true;
            System.out.println("Truck is overloaded");
        }
        else{
            System.out.println("Truck is ideal");
        }
    }
    @Override void displayInfo(){
        super.displayInfo();
        if(isIdeal){
            System.out.println("Total fare: "+(end-start)*numpeople*10);
        }
    }
}

public class Veh4{
    public static void main(String[] args) {
        // Car c=new Car("ABC",300,2);
        // c.Start(0);
        // c.Stop(500);
        // c.displayInfo();

        Truck t=new Truck("truck",400,2);
        t.Start(0);
        t.Stop(500);
        t.displayInfo();
        t.load(4000);

    }
}