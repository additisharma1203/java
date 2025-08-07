abstract class Animal{
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    abstract void makeSound();
}
class Dog  extends Animal{
    @Override void makeSound(){
        System.out.println("Dog barks!");
    }
}
class Cat extends Animal{
    @Override void makeSound(){
        System.out.println("Cat mewos!");
    }
}
public class TestAnimal {
   public static void main(String[] args) {
      Dog d=new Dog();
      Cat c=new Cat();
      d.makeSound();
      c.makeSound();
   }
}
