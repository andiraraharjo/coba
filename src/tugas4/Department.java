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
public class Department {
    String name;
    
    private List<Student>student;
    
    Department(String name, List<Student> student){
        
        this.name=name;
        this.student = student;
    }
    public List<Student>getStudent(){
        return student;
    }
    
}
