package compliant.payroll;

import java.time.LocalDate;

public class FullProfessor extends AbstrEmployee {

    public FullProfessor(LocalDate employmentDate, String surname, String name, int id, ITaxCalculator taxCalculator) {
        super(employmentDate, surname, name, id, taxCalculator);
    }

    @Override
    public double getBaseSalary() {
        return 5000;
    }

    @Override
    public double getYearsMultiplier() {
        return 50;
    }
}