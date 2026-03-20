package compliant.payroll;

import java.time.LocalDate;
import java.time.Period;

public class SalaryCalculator implements ISalaryCalculator{
    @Override
    public double calculateSalary(AbstrEmployee employee) {
        LocalDate starDate = employee.getDateEmployment();
        Period period = Period.between(starDate, LocalDate.now());
        int years = period.getYears();
        double salary= employee.getBaseSalary();
        salary+=years*employee.getYearsMultiplier();
        return salary;
    }
}
