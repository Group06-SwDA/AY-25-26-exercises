package payroll;

public interface ICalculateSalary {
    double calculateSalary(IEmployee employee);
    double calculateSalaryAfterTax(IEmployee employee);

}


