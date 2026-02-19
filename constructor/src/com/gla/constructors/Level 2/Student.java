class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    void display() {
        System.out.println("Roll: " + rollNumber);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent();
        p.rollNumber = 101;
        p.name = "Rahul";
        p.setCGPA(8.5);
        p.display();
        System.out.println("CGPA: " + p.getCGPA());
    }
}
