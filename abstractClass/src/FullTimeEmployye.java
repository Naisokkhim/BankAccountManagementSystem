public class FullTimeEmployye extends Employee{


    private double salary;
    public double getSalary() {
        return salary;
    }

    public void setSallary(double salary) {
        this.salary = salary;
    }

    public FullTimeEmployye(int employeeId, String employeeName, String employeePhone, double salary) {
        super(employeeId, employeeName, employeePhone);
        this.salary = salary ;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
