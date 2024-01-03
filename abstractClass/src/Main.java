public class Main {
    public static void main(String[] args) {

        Employee obj = new FullTimeEmployye(1,"Sokhim","0975647395",500 );
        System.out.println("ID                   :"+obj.getEmployeeId());
        System.out.println("Name                 :"+obj.getEmployeeName());
        System.out.println("Phone number         :"+obj.getEmployeePhone());
        System.out.println("Salary (Full Time)   :"+obj.calculateSalary());
        Employee obj1 = new PartTimeEmployee(2,"Thida","09234576894",10,20);
        System.out.println("ID                   :"+obj1.getEmployeeId());
        System.out.println("Name                 :"+obj1.getEmployeeName());
        System.out.println("Phone number         :"+obj1.getEmployeePhone());
        System.out.println("Salary (Part Time)   :"+obj1.calculateSalary());



    }
}