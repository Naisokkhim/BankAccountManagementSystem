public abstract class Employee {
    private int employeeId;
    private String employeeName;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    private  String employeePhone;
    public Employee(int employeeId,String employeeName,String employeePhone){
            this.employeeId = employeeId ;
            this.employeeName = employeeName ;
            this.employeePhone = employeePhone ;
    }
    public double calculateSalary(){
        return 0;
    }
}
