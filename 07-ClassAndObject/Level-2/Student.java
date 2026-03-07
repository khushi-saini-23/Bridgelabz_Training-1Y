class Student {

    public int roll;
    protected String name;
    private double cgpa;

    public void setCgpa(double c) {
        cgpa = c;
    }

    double getCgpa() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {

    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCgpa());
    }
}

class Main {
    public static void main(String[] args) {

        PostgraduateStudent s = new PostgraduateStudent();

        s.roll = 37;
        s.name = "khushi";
        s.setCgpa(8.5);

        s.show();
    }
}