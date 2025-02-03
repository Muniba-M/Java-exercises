//Name: Muniba Maududi
//Date: 2/feb/2025
//Description: COSC 1200 Assignment1 - creating student details

package dc.Student;
import dc.Student.Student;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Sarah Jons", 24, 1000223);
        Student student2 = new Student("John", 29, 1010002332);

        // Display details before modifying anything
        System.out.println("Before modifying changes: ");
        student1.displayDetails();
        student2.displayDetails();

        // Modify student1 details using setters
        student1.setStudentName("Jack Williams");
        student1.setStudentAge(35);
        student1.setStudentId(1010234);

        // Display updated details
        System.out.println("After modifying changes on student1 details:");
        student1.displayDetails();

        // Change university name
        Student.changeUniversityName("University of Toronto");

        // Display details after university name change
        System.out.println("After changing University name:");
        student1.displayDetails();
        student2.displayDetails();
    }
}
