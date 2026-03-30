package payroll;

import java.time.LocalDate;

public class FullProfessor implements IEmployee {

    private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;
    private final double baseSalaryFP = 5000;
    private final double yearsMultiplierFP = 50;
    
    public FullProfessor(LocalDate employmentDate, String surname, String name, int id) {
        this.employmentDate = employmentDate;
        this.surname = surname;
        this.name = name;
        this.id = id;

    }


    public LocalDate getDateEmployment() {
        return this.employmentDate;
    }

    public String getSurname() {
        return this.surname;
    }

    public double getYearsMultiplier(){
        return yearsMultiplierFP;
    }
    
    public double getBaseSalary(){
        return baseSalaryFP;
    }
}
