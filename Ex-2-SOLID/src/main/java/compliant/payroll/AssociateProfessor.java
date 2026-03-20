package compliant.payroll;

import java.time.LocalDate;

public class AssociateProfessor extends AbstrEmployee {

    public AssociateProfessor(LocalDate employmentDate, String surname, String name, int id, ITaxCalculator taxCalculator) {
        super(employmentDate, surname, name, id, taxCalculator);
    }

    @Override
    public double getBaseSalary() {
        return 3000;
    }

    @Override
    public double getYearsMultiplier() {
        return 20;
    }
}