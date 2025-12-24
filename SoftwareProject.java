
package software.project;


public class SoftwareProject {

    
    public static void main(String[] args) {
        
        
      
        Student s1 = new Student(18,"Grade 12","A1","Ahmed","S001","01012345678","Student");
        Student s2 = new Student(17,"Grade 11","A1","Sara","S002","01098765432","Student");
                

        Teacher t1 = new Teacher("teacher@school.com","Mathematics","A1","Mr. Ali","T001","01122223333","Teacher" );

        Course mathCourse = new Course(101, "Mathematics");

        mathCourse.addStudent(s1);
        mathCourse.addStudent(s2);

        mathCourse.displayStudents();
        
        System.out.println("__________________________");

        
        ClassRoom classA1 = new ClassRoom("A1", 30);
        classA1.displayClassRoom();
        
        System.out.println("__________________________");

        
        Attendance a1 = new Attendance(1, "2025-03-10", "Present");
        Attendance a2 = new Attendance(2, "2025-03-11", "Absent");

        a1.displayAttendance();
        a2.displayAttendance();
        
        System.out.println("__________________________");

       
        Grade g1 = new Grade(1, 95.5, "Excellent");
        Grade g2 = new Grade(2, 88.0, "Very Good");

        g1.displayGrade();
        g2.displayGrade();
        
        System.out.println("__________________________");

        mathCourse.removeStudent(s1);
        mathCourse.displayStudents();
    }
}
 
        
        
       
    
    

