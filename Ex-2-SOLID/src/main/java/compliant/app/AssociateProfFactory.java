package compliant.app;

import java.time.LocalDate;

import compliant.payroll.AbstrEmployee;
import compliant.payroll.AssociateProfessor;
import compliant.payroll.AssociateProfessorTaxCalculator;

public class AssociateProfFactory implements IEmployeeFactory{
    public AbstrEmployee createEmployee(LocalDate employmentDate, String surname, String name, int id){
        return new AssociateProfessor(employmentDate, surname, name, id, new AssociateProfessorTaxCalculator());
    }
}
