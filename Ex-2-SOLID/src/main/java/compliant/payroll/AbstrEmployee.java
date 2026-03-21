package compliant.payroll;

import java.time.LocalDate;

public abstract class AbstrEmployee {
    private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;
    private ITaxCalculator taxCalculator;
    
    public AbstrEmployee(LocalDate employmentDate, String surname, String name, int id, ITaxCalculator taxCalculator) {
        this.employmentDate = employmentDate;
        this.surname = surname;
        this.name = name;
        this.id = id;
        this.taxCalculator = taxCalculator;
    }

    public LocalDate getDateEmployment() {
        return this.employmentDate;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ITaxCalculator geTaxCalculator(){
        return this.taxCalculator;
    }

    public abstract double getBaseSalary();
    public abstract double getYearsMultiplier();
}
