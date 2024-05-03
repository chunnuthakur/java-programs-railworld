package Abstraction.Abstract_Class;

public abstract class AbstractClass {

    public abstract void empName(String name);

    public abstract void empId(String id);

    public abstract void empAddress(String Address);
}

class Railword extends AbstractClass {
    public void empName(String name) {
        System.out.println("Emp Name" + " " + name);
    }

    public void empId(String id) {
        System.out.println(id);
    }

    public void empAddress(String Address) {
        System.out.println(Address);
    }

    public static void main(String[] args) {
        Railword emp1 = new Railword();
        emp1.empName("Ganesh");
        emp1.empId("RLW094");
        emp1.empAddress("Khandea MP");
    }
}
