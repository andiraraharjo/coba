/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Andira
 */
public class KelasUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student s1 = new Student("Mia", 1, "CSE"); 
       Student s2 = new Student("Priya", 2, "CSE"); 
       Student s3 = new Student("John", 1, "EE"); 
       Student s4 = new Student("Rahul", 2, "EE");
       
       List <Student> cse_students = new ArrayList<Student>(); 
       cse_students.add(s1); 
       cse_students.add(s2); 
       
       List <Student> ee_students = new ArrayList<Student>(); 
       ee_students.add(s3); 
       ee_students.add(s4); 
       
       Department CSE = new Department("CSE", cse_students); 
       Department EE = new Department("EE", ee_students); 
       
       List <Department> departments = new ArrayList<Department>(); 
       departments.add(CSE); 
       departments.add(EE);
       Institute institute = new Institute("BITS", departments);
     
       
       System.out.println("Total students in institute: "); 
       System.out.println(institute.getTotalStudentsOfInstitute()); 
    }
    
}