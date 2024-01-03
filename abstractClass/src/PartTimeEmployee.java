public class PartTimeEmployee extends Employee{
    private int hour ;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getSalaryWieght() {
        return SalaryWieght;
    }

    public void setSalaryWieght(double salaryWieght) {
        SalaryWieght = salaryWieght;
    }

    private  double SalaryWieght;
    public PartTimeEmployee(int employeeId, String employeeName, String employeePhone, double salaryWieght,int hour) {
        super(employeeId, employeeName, employeePhone);
        this.hour = hour ;
        this.SalaryWieght = salaryWieght ;
    }
    @Override
    public double calculateSalary(){
        return hour * SalaryWieght;
    }
}
