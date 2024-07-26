public class Employee {
    String name;
    int age;
    int salary;
    String location;

    /**
     * This is the constructor. Basically the "gateway" to using
     * this class from this class to other classes/methods.
     * You will not be able to use any functions/methods not attributes
     * tied to this class without the using the constructor to build an instance.
     */
    Employee(String name, int age, int salary, String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    /**
     * This is a function/method
     */
    public void raiseSalary(){
        System.out.println("Raising salary for " + this.name +"...");
        this.salary = this.salary + 10;
        System.out.println("Salary for " + this.name + " is now: " + this.salary);
    }
}
