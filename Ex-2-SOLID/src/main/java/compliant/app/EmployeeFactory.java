package compliant.app;

import java.time.LocalDate;

import compliant.payroll.AbstrEmployee;
import compliant.payroll.AssociateProfessor;
import compliant.payroll.AssociateProfessorTaxCalculator;
import compliant.payroll.FullProfessor;
import compliant.payroll.FullProfessorTaxCalculator;
import compliant.payroll.HeadOfDepartment;
import compliant.payroll.HeadOfDepartmentTaxCalculator;

public class EmployeeFactory implements IEmployeeFactory{
    @Override
    public AbstrEmployee createFullProfessor(LocalDate employmentDate, String surname, String name, int id){
        return new FullProfessor(employmentDate, surname, name, id, new FullProfessorTaxCalculator());
    }
    @Override
    public AbstrEmployee createAssociatedProfessor(LocalDate employmentDate, String surname, String name, int id){
        return new AssociateProfessor(employmentDate, surname, name, id, new AssociateProfessorTaxCalculator());
    }
    @Override
    public AbstrEmployee createHeadOfDepartment(LocalDate employmentDate, String surname, String name, int id){
        return new HeadOfDepartment(employmentDate, surname, name, id, new HeadOfDepartmentTaxCalculator());
    }
}
