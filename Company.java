// class Emp{
//     String name,dept;
//     int empId;
//     double salary;
//     static int employeeCount=0;
//     Emp(){
//         name="unknown";
//         dept="unknown";
//         empId=1000;
//         salary=0;
//         employeeCount++;
//     }
//     Emp(String n,int ids){
//         this();
//         this.name=n;
//         this.empId=ids;
//     }
//     Emp(String n,int ids,String dep){
//         this(n,ids);
//         this.dept=dep;
//     }
//     Emp(String n,int ids,String dep,double sal){
//         this(n,ids,dep);
//         this.salary=sal;
//     }
//     void updateSalary(double sal){
//         this.salary=sal;
//     }
//      void updateSalary(double sal,double bonus){
//         this.salary=sal+bonus;
//     }
//     @Override public String toString(){
//         return  "EMPID: "+empId+" , Name: "+name+" , Department "+dept+" ,Salary:"+salary;
//     }
// }
// public class Company {
//     public static void main(String[] args) {
//         Emp e1=new Emp();
//         Emp e2=new Emp("abc",111);
//         Emp e3=new Emp("xyz",1,"Manager",400000);
//         e1.updateSalary(200000);
//         e2.updateSalary(35000);
//         System.out.println(e1);
//         System.out.println(e2);
//         System.out.println(e3);
//         System.out.println("Total Employees: "+Emp.employeeCount);

//     }
// }

// @override static String toString()  => pass OBJECTNAME inside this

import java.util.Scanner;
class Employee{
    String name,dept;
    int empid;
    double salary;
    static int employeeCount=0;
    static{
        employeeCount=0;
    }
    Employee(){
        name="unknown";
        empid=12;
        dept="unknown";
        salary=0.0;
        employeeCount++;
    }
    Employee(String name,int empid){
        this();
        this.name=name;
        this.empid=empid;
    }
    Employee(String name,int empid,String dept){
        this(name,empid);
        this.dept=dept;
    }
    Employee(String name,int empid,String dept,double salary){
        this(name, empid, dept);
        this.salary=salary;
    }
    void updateSalary(double salary){
        this.salary=salary;
    }
    void updateSalary(double salary,double bonus){
        this.salary=salary+bonus;
    }
    @Override public String toString(){
        return name+" "+empid+" "+dept+" "+salary;
    }

}
public class Company{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int empid=sc.nextInt();
        Employee e1=new Employee(name,empid);
        e1.updateSalary(120000);
        System.out.println(e1.toString());
        System.out.println(Employee.employeeCount);

    }
}



