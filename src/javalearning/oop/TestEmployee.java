package javalearning.oop;

public class TestEmployee {
    public static void main(String[] args) {

        Employee e;// object reference
        e = new Employee("Vishnu", 35000);// create an object of Employee
        e.init("Vishnu", 35000);
        e.print();
        e.setSalary(55000);
        if (e.getSalary() > 50000)
            System.out.println("Fat salary");

    }
}
