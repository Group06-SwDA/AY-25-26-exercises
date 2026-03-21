package compliant.app;

import java.time.LocalDate;

import compliant.payroll.AbstrEmployee;

public interface IEmployeeFactory {
    public AbstrEmployee createFullProfessor(LocalDate employmentDate, String surname, String name, int id);
    public AbstrEmployee createAssociatedProfessor(LocalDate employmentDate, String surname, String name, int id);
    public AbstrEmployee createHeadOfDepartment(LocalDate employmentDate, String surname, String name, int id);
}
