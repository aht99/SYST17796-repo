package studentlist;

import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {
        
        String[] students = new String[6];
        
//        students[0] = "John";
//        students[1] = "Mary";
//        students[2] = "May";
//        students[3] = "Kamal";
//        students[4] = "Susan";
//        students[5] = "Nancy";
        
        for(int i = 0; i < students.length; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the student name: ");
            students[i] = input.nextLine();
        }
        
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("Goodbye");
    }
    
}
