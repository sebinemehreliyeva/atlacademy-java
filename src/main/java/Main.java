public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Jack", 14, "Production") {
            @Override
            public double caltulateSalary() {
                return 0;
            }

            @Override
            public void printInfo() {

            }
        };
        System.out.println("Salary"+e.calculateSalary());
        e.printINfo();

        System.out.println("------");


        Manager m = new Manager(2,"Ayel",20,"IT","IT");
        System.out.println("Salary"+m.calculateSalary());
        m.printINfo();

        System.out.println("------");

        Director d = new Director(3,"Nigar",25,"COMPANY","COMPANY",10000);
        System.out.println("Salary"+d.calculateSalary());
        d.printINfo();

        System.out.println("------");

    }

}
