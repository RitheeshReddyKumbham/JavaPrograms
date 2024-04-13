
import java.util.*;

class student3 {
    int rollNo;
    String name;
    String branch;
    double percent;
    int marks;
    static int year;
    static String college = "peters";

    static Scanner s = new Scanner(System.in);

    void calcPercent(int a, int b, int c) {
        percent = (double) (a + b + c) / 300 * 100;
        marks=a+b+c;
        System.out.println("Total Marks: " +marks);
        System.out.println("Percentage: " + percent);
    }

    public static void main(String args[]) {
        student3[] students = new student3[100]; // Array to store students
        System.out.println("For Adding Student Enter: 1\nFor Deleting Student Enter: 2\nFor Calculating Marks Enter: 3");
        int input = s.nextInt();

        switch (input) {
            case 1:
            	
                addStudent(students);
                
            case 2:
                deleteStudent(students);
     
            case 3:
                calculateMarks(students);
                break;
        }

        s.close();
    }

    static void addStudent(student3[] students) {
    	System.out.println("enter no of students data to be added");
    	int num=s.nextInt();
    	for(int i=1;i<=num;i++) { 
        if(i<=num) {
           System.out.println("Enter year to get marks ");
           int year = s.nextInt();
           System.out.println("Enter name of student ");
           String name = s.next();
           System.out.println("Enter rollNo of student");
           int rollNo = s.nextInt();
           System.out.println("Enter branch of student");
           String branch = s.next();
           student3 newStudent = new student3();
        
              if(year==1) {
                    System.out.println("Enter marks of 3 subjects");
		            int sub1 = s.nextInt();
                    int sub2 = s.nextInt();
                    int sub3 = s.nextInt(); 
                    newStudent.calcPercent(sub1, sub2, sub3);
                    // Add new student to the array
                    students[rollNo] = newStudent;
  	            }
  	           else if(year==2) {
                   System.out.println("Enter marks of 3 subjects");
	               int sub1 = s.nextInt();
                   int sub2 = s.nextInt();
                   int sub3 = s.nextInt();
                   newStudent.calcPercent(sub1, sub2, sub3);
                   // Add new student to the array
                   students[rollNo] = newStudent;
        }
  	   
        else if(year==3) {
            System.out.println("Enter marks of 3 subjects");
		    int sub1 = s.nextInt();
            int sub2 = s.nextInt();
            int sub3 = s.nextInt(); 
            newStudent.calcPercent(sub1, sub2, sub3);
           // Add new student to the array
           students[rollNo] = newStudent;
  	  }
  	      
        else if(year==4) {
           System.out.println("Enter marks of 3 subjects");
  		   int sub1 = s.nextInt();
           int sub2 = s.nextInt();
           int sub3 = s.nextInt(); 
           newStudent.calcPercent(sub1, sub2, sub3);
           students[rollNo] = newStudent;
  		  
  	     }
              newStudent.name = name;
              newStudent.rollNo = rollNo;
              newStudent.branch = branch;
  	  }
      }
    }
    

    static void deleteStudent(student3[] students) {
        System.out.println("Enter rollNo of student to delete");
        int rollNo = s.nextInt();

        if (students[rollNo] != null) {
            students[rollNo] = null;
            System.out.println("Student with rollNo " + rollNo + " deleted successfully.");
        } else {
            System.out.println("No student found with rollNo " + rollNo);
        }
    }

    static void calculateMarks(student3[] students) {
        System.out.println("Enter rollNo of student to calculate marks");
        int rollNo = s.nextInt();
        if (students[rollNo] != null) {
            student3 student = students[rollNo];
            System.out.println("Name: " + student.name);
            System.out.println("Name: " + student.marks);
        } else {
            System.out.println("No student found with rollNo " + rollNo);
        }
    }
    
}
