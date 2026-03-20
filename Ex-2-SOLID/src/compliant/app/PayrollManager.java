package compliant.app;
import java.time.LocalDate;
import compliant.payroll.*;

public class PayrollManager {

    public static void main(String[] args) {
        ICalculatorFactory salaryCalculatorFactory = new SalaryCalculatorFactory();
        IEmployeeFactory fullProfFactory = new FullProfFactory();
        IEmployeeFactory associateProfFactory = new AssociateProfFactory();
        IEmployeeFactory headOfDepartmentFactory = new HeadOfDepartmentFactory();
        
        AbstrEmployee fp = fullProfFactory.createEmployee(LocalDate.of(2005, 03, 1),"Subito", "Giovanni",123);
        AbstrEmployee ap = associateProfFactory.createEmployee(LocalDate.of(2015,04,01 ), "Trapani", "Chiara", 628);
        AbstrEmployee hod = headOfDepartmentFactory.createEmployee(LocalDate.of(1995, 2, 1), "Magno", "Alessandro", 64);
        ISalaryCalculator salaryCalculator = salaryCalculatorFactory.creCalculator();
        double monthlySalaryTemp = 0; 

        monthlySalaryTemp = salaryCalculator.calculateSalary(fp); //compute monthly gross salary 
        System.out.println("Gross monthly salary of " + fp.getSurname() + " : " + monthlySalaryTemp );  //print monthly gross salary
        System.out.println("Net monthly salary of " + fp.getSurname() + " : " + fp.getSalaryAfterTax(monthlySalaryTemp)); //print monthly net salary
        

        monthlySalaryTemp = salaryCalculator.calculateSalary(ap);
        System.out.println("Gross monthly salary of " + ap.getSurname() + " : " + monthlySalaryTemp );
        System.out.println("Net monthly salary of " + ap.getSurname() + " : " + ap.getSalaryAfterTax(monthlySalaryTemp));

        monthlySalaryTemp = salaryCalculator.calculateSalary(hod);
        System.out.println("Gross monthly salary of " + hod.getSurname() + " : " + monthlySalaryTemp );
        System.out.println("Net monthly salary of " + hod.getSurname() + " : " + hod.getSalaryAfterTax(monthlySalaryTemp));

    }

}
