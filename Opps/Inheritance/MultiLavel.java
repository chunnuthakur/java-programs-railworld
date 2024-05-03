package Inheritance;

interface SportMarks {
    void showSportMarks(int number);
}

interface TheoryMarks {
    void showTheoryMarks(int number);
}

public class MultiLavel implements TheoryMarks, SportMarks {
    String name;
    String roll;
    String sem;

    MultiLavel(String name, String roll, String sem) {
        this.name = name;
        this.roll = roll;
        this.sem = sem;
    }

    public void studentInfo() {
        System.out.println(this.name + " " + this.roll + " " + this.sem);
    }

    @Override
    public void showSportMarks(int number) {
        System.out.println(number);
    }

    @Override
    public void showTheoryMarks(int number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        MultiLavel s1 = new MultiLavel("Ganesh", "RWI091", "7");
        s1.studentInfo();
        s1.showSportMarks(89);
        s1.showTheoryMarks(90);

    }


}
