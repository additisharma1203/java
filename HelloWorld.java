// Every function is within class  OBJECT ORIENTED
// main should be in public class
// class Student {  
//     int age;
//     int rollno;
// } 
// public class HelloWorld { // same name=>to reduce time
//     public static void main(String[] args){ // main function should always be public and static(called/works without object)
//         System.out.println("Hello World ;;;" ); // ln =>line by line  || System=>Class
//         System.out.println("Aditi Sharma");
//         System.out.println("2311981032");
//         //Student s;
//         // s.age=20;
//         // s.rollno=1032;
//     }
// }
// Scanner class =>take input  from console(users) via keyword,file (inside util packages)
// javac .\HelloWorld.java  // java have packages
// java HelloWorld

// SECURE, PURE OBJECT ORIENTED , HIGH LEVEL , No garbage value , automatically free memory(remove object not int use)
// Memory allocation automatic , Multithreading


            /////////////// 30-6-25 ///////////////////////////
 ///  import java.util.Scanner
 /// System.in =>input from keyboard
 /// nextline =>takes complete string including space (terminate on ENTER \n)  (enter)
 /// next => value before space  ( " ",enter)
 
// if we use NEXTLINE after INT then only int is printed  , nextline will get(\n)

 import java.util.Scanner;
// public class HelloWorld{
//     public static void main(String[] args)
//     {
//         String name;
// //         int rollno;
//         String fname;
//         String lname;
//         Scanner sc=new Scanner(System.in);
//         name=sc.next();
//         rollno=sc.nextInt();
//         fname=sc.next();
//         lname=sc.next();
//         System.out.println("Name: " + name);
//         System.out.println("Roll Number: " + rollno);
//         System.out.println("Fname: " + fname+"\n"+"Lname: "+lname);
//         sc.close();  // always close 
// }
// }

// public class HelloWorld{
//     public static void main(String[] xyz)
//     {
//         // System.out.println(xyz[0]);
//          System.out.println(xyz[1]);
//         // double  n;
//         String lname;
//         Scanner sc=new Scanner(System.in);
//         // n=sc.nextDouble();
//         lname=sc.next();
//         System.out.println("hello "+lname);
//         sc.close();  // always close 
// }
// }

//  After every int,byte,float,double,short,long always use a sc.next();

////////// bitwise(hw)

public class HelloWorld{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((a>b && a>c)?a:(b>c && b>a)?b:c);
        System.out.println(a+b); // arithematic
        System.out.println(a<b); // relational
        System.out.println((a==b && a<=b)?(a>b):(a<b));  // ternery
        System.out.println((a>b) && (a==b) && (a<b));  // logical
        System.out.println((++a)+a++);  //UNARY
        sc.close();
    }
}



