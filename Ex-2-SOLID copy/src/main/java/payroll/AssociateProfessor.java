package payroll;

import java.time.LocalDate;

public class AssociateProfessor implements IEmployee {

    private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;
    private final double yearsMultiplierAP = 20;
    private final double baseSalaryAP = 3000;

    public AssociateProfessor(LocalDate employmentDate, String surname, String name, int id) {
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
            return yearsMultiplierAP;
        }

    public double getBaseSalary(){
        return baseSalaryAP;
    }

}
