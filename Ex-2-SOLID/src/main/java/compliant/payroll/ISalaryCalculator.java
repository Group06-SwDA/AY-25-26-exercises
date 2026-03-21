package compliant.payroll;

public interface ISalaryCalculator {
    public double calculateSalary(AbstrEmployee employee);
    public double getSalaryAfterTax(AbstrEmployee empl, double monthlySalary);
}
