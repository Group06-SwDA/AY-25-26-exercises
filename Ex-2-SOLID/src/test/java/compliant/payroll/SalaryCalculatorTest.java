package compliant.payroll;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {

    private final SalaryCalculator salaryCalculator = new SalaryCalculator();

    @Test
    void testFullProfessorSalary() {
        FullProfessor fp = new FullProfessor(LocalDate.of(2005, 3, 1), "Subito", "Giovanni", 123, new FullProfessorTaxCalculator());

        double grossSalary = salaryCalculator.calculateSalary(fp);
        double netSalary = salaryCalculator.getSalaryAfterTax(fp, grossSalary);

        assertEquals(6050.0, grossSalary, 0.01);
        assertEquals(4098.5, netSalary, 0.01);
    }

    @Test
    void testAssociateProfessorSalary() {
        AssociateProfessor ap = new AssociateProfessor(LocalDate.of(2015, 4, 1), "Trapani", "Chiara", 628, new AssociateProfessorTaxCalculator());

        double grossSalary = salaryCalculator.calculateSalary(ap);
        double netSalary = salaryCalculator.getSalaryAfterTax(ap, grossSalary);

        assertEquals(3200.0, grossSalary, 0.01);
        assertEquals(2377.33, netSalary, 0.01);
    }

    @Test
    void testHeadOfDepartmentSalary() {
        HeadOfDepartment hod = new HeadOfDepartment(LocalDate.of(1995, 2, 1), "Magno", "Alessandro", 64, new HeadOfDepartmentTaxCalculator());

        double grossSalary = salaryCalculator.calculateSalary(hod);
        double netSalary = salaryCalculator.getSalaryAfterTax(hod, grossSalary);

        assertEquals(7350.0, grossSalary, 0.01);
        assertEquals(4839.5, netSalary, 0.01);
    }
}
