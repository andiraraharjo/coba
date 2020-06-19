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
public class Institute {
    String IntituteName;
    
   
    private static class TotalStudentsOfInstitute {

        public TotalStudentsOfInstitute() {
        }
    }
    private List<Department> departments;
    private List<TotalStudentsOfInstitute> totalstudentsffinstitute;
    
    Institute(String InstituteName, List<Department> department){
        
        this.IntituteName=InstituteName;
        this.departments=department;
        this.totalstudentsffinstitute=totalstudentsffinstitute;
        
    }public List<TotalStudentsOfInstitute>getTotalStudentsOfInstitute(){
        
        return totalstudentsffinstitute;
        
    }

    
}