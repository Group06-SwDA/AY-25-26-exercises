package compliant.app;

import java.time.LocalDate;

import compliant.payroll.AbstrEmployee;

public interface IEmployeeFactory {
    public AbstrEmployee createEmployee(LocalDate employmentDate, String surname, String name, int id);
}
