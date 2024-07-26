public class Main {
    public static void main(String[] args) {
        System.out.println("Running...");

        Employee employeeOne = new Employee("Jack", 25, 3500, "Singapore");

        // you will need to declare the prefix return value
        String employeeOneName = employeeOne.name;
        int employeeOneAge = employeeOne.age;
        int employeeOneSalary = employeeOne.salary;
        String employeeOneLocation = employeeOne.location;

        System.out.println("Employee details:" +
                employeeOneName + "," +  employeeOneAge + "," + employeeOneLocation);

        employeeOne.raiseSalary();

        Employee employeeTwo = new Employee("John", 23, 3500, "Singapore");

        String employeeTwoName = employeeTwo.name;
        int employeeTwoAge = employeeTwo.age;
        int emmployeeTwoSalary = employeeTwo.salary;
        String employeeTwoLocation = employeeTwo.location;

        System.out.println("Employee details: " +
                employeeTwoName + "," + employeeTwoAge + "," + employeeTwoLocation);

    }
}
