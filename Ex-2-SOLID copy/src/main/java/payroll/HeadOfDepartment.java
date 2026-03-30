package payroll;

import java.time.LocalDate;

public class HeadOfDepartment implements IEmployee {

    private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;
    private final double extraHoD = 800;
    private final double baseSalaryFP = 5000;

    public HeadOfDepartment(LocalDate start, String surname, String name, int id) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.employmentDate = start;
    }

    public LocalDate getDateEmployment() {
        return this.employmentDate;
    }

    public String getSurname() {
        return this.surname;
    }

    public double getYearsMultiplier() {
        return extraHoD;
    }

    public double getBaseSalary() {
        return baseSalaryFP + extraHoD;
    }

}
