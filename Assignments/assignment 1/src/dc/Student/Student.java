//Name: Muniba Maududi
//Date: 2/feb/2025
//Description: COSC 1200 Assignment1 - creating student details

package dc.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Student {

    private String studentName;
    private int studentAge;
    private int studentId;

    //Static field shared by all
    private static String universityName = "Tech University";

    //Constructor
    public Student(String studentName, int studentAge, int studentId) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentId = studentId;
    }

    //default constructor
    public Student() {
        this.studentName = "unknown";
        this.studentAge = 0;
        this.studentId = 0;
    }

    // getters
    public String getStudentName() {return studentName;}
    public int getStudentAge() {return studentAge;}
    public int getStudentId() {return studentId;}

    //setters
    public void setStudentName(String studentName) {this.studentName = studentName;}
    public void setStudentAge(int studentAge) {this.studentAge= studentAge;}
    public void setStudentId(int studentId) {this.studentId= studentId;}

    //Static method to change university name
    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    // Static method to get university name
    public static String getUniversityName() {
        return universityName;
    }

    //displayDetails
    public void displayDetails() {
        System.out.println("Student Name:" + this.studentName);
        System.out.println("Student Age:" + this.studentAge);
        System.out.println("Student ID:" + this.studentId);
        System.out.println("University Name:" + universityName);
        System.out.println("------------------------");
    }

}
