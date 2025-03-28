class StudentBio {
    String name;
    int rollno;
    float cgpa;
    String stay;

    // Constructor to initialize the variables
    public StudentBio(String name, int rollno, float cgpa, String stay) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
        this.stay = stay;
    }

    // Method to display the details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Stay: " + stay);
    }

    public static void main(String[] args) {
        // Create an object of StudentBio//
        StudentBio student = new StudentBio("Priyanka", 24107, 8.63f, "Hostler");

        // Display the details
        student.displayDetails();
    }
}
