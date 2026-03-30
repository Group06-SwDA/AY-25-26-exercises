package payroll;

import java.time.LocalDate;
import java.time.Period;

public class SalaryCalculator implements ICalculateSalary {

    private TaxCalculator taxCalculator;

    public SalaryCalculator(){
        this.taxCalculator = new TaxCalculator();
    }

    public double calculateSalary(IEmployee employee) {
        LocalDate starDate = employee.getDateEmployment();
        Period period = Period.between(starDate, LocalDate.now());
        int years = period.getYears();
        double salary= employee.getBaseSalary();
        salary+=years*employee.getYearsMultiplier();
        return salary;
    }

    public double calculateSalaryAfterTax(IEmployee employee) {
        
        double grossSalary = calculateSalary(employee);
        double yearlyGrossSalary = grossSalary*12;
        double yearlyTaxes = taxCalculator.calculateTax(yearlyGrossSalary);
        double taxes= yearlyTaxes/12;
        double netSalary = grossSalary - taxes;

        return netSalary;
    }
   

}
