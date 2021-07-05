package Group3.AzureWebApp;

public class Employee {
    int id;
    String firstName;
    String lastname;
    String SSN;
    String department;
    int salary;
    boolean active;
    String startDate;

    public Employee(int id, String firstName, String lastname, String SSN, String department, int salary, boolean active, String startDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.SSN = SSN;
        this.department = department;
        this.salary = salary;
        this.active = active;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
