package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/** Store student data.
 * @author Phuong
 * @version 1.0
 *
 */
public class Student {
    
    /**
     * Private instance variable represents first name.
     */
    private String firstname;
    
    /**
     * Private instance variable represents last name.
     */
    private String lastname;
    
    /**
     * Private instance variable represents year of birth.
     */
    private int yearOfbirth;
    
    /**
     * Private instance variable represents student number.
     */
    private int studentNum;
    
    /**
     * Private instance variable represents GPA.
     */
    private double gpa;
    
    /**
     * Public constructor which accepts parameters for
     * first name, last name, year of birth, student
     * number and GPA. 
     * @param first a String.
     * @param last a String.
     * @param yob an integer.
     * @param stuNum an integer.
     * @param gpa a double.
     */
    public Student(String first, String last, int yob, int stuNum, double gpa) {
        this.firstname = first;
        this.lastname = last;
        this.yearOfbirth = yob;
        this.studentNum = stuNum;
        this.gpa = gpa;
    }
    
    /**
     * An accessor for firstname variable.
     * @return return firstname as a String.
     */
    public String getFirst() {
        return firstname;
    }
    
    /**
     * A mutator for firstname variable.
     * @param first a String.
     */
    public void setFirst(String first) {
        firstname = first;
    }
    
    /**
     * An accessor for lastname variable.
     * @return return lastname as a String.
     */
    public String getLast() {
        return lastname;
    }
    
    /**
     * A mutator for lastname variable.
     * @param last a String.
     */
    public void setLast(String last) {
        lastname = last;
    }
    
    /**
     * An accessor for yearOfbirth variable.
     * @return return yearOfbirth as an integer.
     */
    public int getYob() {
        return yearOfbirth;
    }
    
    /**
     * A mutator for yearOfbirth variable.
     * @param yob an integer.
     */
    public void setYob(int yob) {
        yearOfbirth = yob;
    }
    
    /**
     * An accessor for studentNum variable.
     * @return return studentNum as an integer.
     */
    public int getStunum() {
        return studentNum;
    }
    
    /**
     * A mutator for studentNum variable.
     * @param stuNum an integer.
     */
    public void setStunum(int stuNum) {
        studentNum = stuNum;
    }
    
    /**
     * An accessor for gpa variable.
     * @return return gpa as a double.
     */
    public double getGpa() {
        return gpa;
    }
    
    /**
     * A mutator for gpa.
     * @param gPA a double.
     */
    public void setGpa(double gPA) {
        gpa = gPA;
    }
    
    /**
     * Return a String representation of student's first name, 
     * last name, year of birth, student number and GPA.
     * @return return toString in description.
     */
    public String toString() {
   
        return "First Name: " + firstname + "\n" + "Last Name: " + lastname 
                + "\n" + "Year Of Birth: " + yearOfbirth + "\n" 
                + "Student Number: " + studentNum + "\n" 
                + "GPA: " + gpa;
    }
    
    /**
     * Drive the Student program.
     * @author Phuong Nguyen
     * @version 2.0
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        
        //Prompt the user to input their first name,
        //last name, year of birth, student number and GPA.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        
        String firstName = scan.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine();
        
        System.out.println("Please enter your year of birth: ");
        int yearofBirth = scan.nextInt();
        
        System.out.println("Please enter your student number: ");
        int stuNum = scan.nextInt();
        
        System.out.println("Please enter your GPA: ");
        double gPA = scan.nextDouble();
        
        //Create a student object of Student class.
        Student student = new Student(firstName, lastName, 
                    yearofBirth, stuNum, gPA);
        
        //Declare a studentData String variable and call
        //toString() method on student object.
        String studentData = student.toString();
        
        //Print studentData.
        System.out.println("Student data: " + studentData);
        
        //Close Scanner.
        scan.close();
    }
}
