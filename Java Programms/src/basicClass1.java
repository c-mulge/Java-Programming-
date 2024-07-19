import java.util.*;

class Employee{
    Scanner nm =new Scanner(System.in);
    int id;
    String name;
    int salary;
    public void getdetails(){
        System.out.println("Enter details: ");
        id=nm.nextInt();
        name=nm.next();
        salary=nm.nextInt();
    }
    public void display(){
        System.out.println("Details are: ");
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }
}

public class basicClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp= new Employee();
        emp.getdetails();
        emp.display();
    }
}