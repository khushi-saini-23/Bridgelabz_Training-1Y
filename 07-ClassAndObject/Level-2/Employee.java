class Employee {

    public int id;
    protected String dept;
    private int sal;

    void setSalary(int s) {
        sal = s;
    }

    int getSalary() {
        return sal;
    }
}

class Manager extends Employee {

    public void show() {
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + getSalary());
    }
}

class Main {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.id = 37;
        m.dept = "cs";
        m.setSalary(500000);

        m.show();
    }
}