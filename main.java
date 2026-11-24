
public class Student {

    // 1. Attributes
    private int studentId;
    private String name;
    private int age;
    private String department;

    // 2. Constructor
    public Student(int studentId, String name,
                   int age, String department) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // 3. Method to display student details
    public void displayDetails() {
        System.out.println("Student Details");
        System.out.println("--------------------");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    // 4. Method to update department
    public void updateDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.println("Department updated successfully!");
    }

    // 5. Main method
    public static void main(String[] args) {

        // Create a Student object
        Student student1 = new Student(
            101,
            "Alex",
            20,
            "Computer Science"
        );

        // Display original details
        student1.displayDetails();

        // Update department
        student1.updateDepartment("Information Technology");

        // Display updated details
        System.out.println("\nUpdated Student Details:");
        student1.displayDetails();
    }
}
