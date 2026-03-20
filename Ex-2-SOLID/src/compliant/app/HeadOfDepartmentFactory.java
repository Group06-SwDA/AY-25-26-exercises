package compliant.app;

import java.time.LocalDate;

import compliant.payroll.AbstrEmployee;
import compliant.payroll.HeadOfDepartment;
import compliant.payroll.HeadOfDepartmentTaxCalculator;

public class HeadOfDepartmentFactory implements IEmployeeFactory{
    public AbstrEmployee createEmployee(LocalDate employmentDate, String surname, String name, int id){
        return new HeadOfDepartment(employmentDate, surname, name, id, new HeadOfDepartmentTaxCalculator());
    }
}
