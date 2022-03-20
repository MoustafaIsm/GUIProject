package modelsPackage;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private String position;
    private String password;

    public Employee(int id, String firstName, String lastName, int age, int salary, String position, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.position = position;
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            final Employee other = (Employee) obj;
            if (this.id == other.id) {
                return true;
            }
        }
        return false;
    }

}
