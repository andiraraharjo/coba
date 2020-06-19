/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;
import java.util.List;

/**
 *
 * @author Andira
 */
public class TotalStudentsOfIntitute {
    
    private static class TotalStudentsOfInstitute {

        public TotalStudentsOfInstitute() {
        }
    }
    
    public int getTotalStudentsOfIntitute(){
        int noOfStudents = 0;
        
        
        List<Student>students;
        List<Department> department = null;
        
        for(Department dept : department){
            
            students = dept.getStudent();
            noOfStudents += students.size();
            
        } return noOfStudents;
    }
}