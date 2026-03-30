package payroll;

import java.time.LocalDate;

public interface IEmployee {

    public LocalDate getDateEmployment();
    public String getSurname();
    public double getYearsMultiplier();
    public double getBaseSalary();
}

