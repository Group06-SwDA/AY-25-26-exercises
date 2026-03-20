package compliant.app;

import java.time.LocalDate;

import compliant.payroll.AbstrEmployee;
import compliant.payroll.FullProfessor;
import compliant.payroll.FullProfessorTaxCalculator;

public class FullProfFactory implements IEmployeeFactory{
    public AbstrEmployee createEmployee(LocalDate employmentDate, String surname, String name, int id){
        return new FullProfessor(employmentDate, surname, name, id, new FullProfessorTaxCalculator());
    }
}
