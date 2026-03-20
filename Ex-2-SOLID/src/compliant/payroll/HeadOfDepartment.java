package compliant.payroll;

import java.time.LocalDate;

public class HeadOfDepartment extends AbstrEmployee {

    public HeadOfDepartment(LocalDate employmentDate, String surname, String name, int id, ITaxCalculator taxCalculator) {
        super(employmentDate, surname, name, id, taxCalculator);
    }

    @Override
    public double getBaseSalary() {
        return 5800;
    }

    @Override
    public double getYearsMultiplier() {
        return 50;
    }
}