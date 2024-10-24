package Day3;

/*Create a program to calculate the annual salary of an employee by using inheritance.
Create a class named "User" with the following properties and methods: Properties: id(int):
representing the id of the User name(String):representing the name of the User Constructor:
Declare parameterized constructor to initialize id and name. Create a subclass
named "Employee" that inherits from the "User" class. Add the following additional
properties and methods: Properties: salary(double):representing the monthly salary of the employee Method:
double calculateAnnualSalary():to calculate the annual salary earned by the employee. In the main method,
 create an object of "Employee" class. Calculate the annual salary of the employee and display it..
 [Hint:Use constructor or setter methods to set the value] in java*/

class User {
    int id;
    String userName;

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }
    void data(){
        System.out.println("Id is the "+id+" and "+userName+" is name");
    }
}

    class Employee extends User{
        double salary;

        public Employee(int id, String userName,double salary) {
            super(id,userName);
            this.salary = salary;
        }
        public int  calculateAnnualSalary(){
            return (int) (12*salary);
        }
        void print(){
            data();
            System.out.println("salary is that "+salary);

        }
    }

public class AnnualSalary {
    public static void main(String[] args) {
        Employee employee=new Employee(4,"Ajay",30000);
        employee.print();
    }
}
