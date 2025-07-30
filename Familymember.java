public class Familymember {
    String firstName;
    String fullName;
    static String Surname="";
    Familymember(String name){
        firstName=name;
        Surname=firstName+" "+Surname;
        fullName=Surname;
    }
    public static void main(String[] args) {
        Familymember son=new Familymember("Iyer");
        System.out.println(son.fullName);
        Familymember father=new Familymember("venu");
        System.out.println(father.fullName);
        Familymember grandFather=new Familymember("aryan");
        System.out.println(grandFather.fullName);
        System.out.println(father.fullName);
        System.out.println(Familymember.Surname);
    }
}
 
