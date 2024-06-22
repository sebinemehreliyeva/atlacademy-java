public class Manager extends Employee {

    String departmentManaged;

    public static final int MANAGMENT_PAYMENT = 5000;

    public Manager(int no, String name, int year, String department, String departManaged) {
        super(no, name, year, department);
        this.departmentManaged = departManaged;
    }

    @Override
    public void work (){
        System.out.println("Manager is working");
        manage();
}
public void manage(){
    System.out.println("Manager manages IT Department");
   }

   @Override
   public double caltulateSalary(){
        return year* BASE_SALARY + MANAGMENT_PAYMENT;
    }
    @Override
    public void printInfo(){
        super.printINfo();
        System.out.println("Manager Department"+departmentManaged );
    }


}
