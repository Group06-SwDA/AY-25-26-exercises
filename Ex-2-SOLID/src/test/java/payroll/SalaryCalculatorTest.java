package payroll;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {

    private final SalaryCalculator salaryCalculator = new SalaryCalculator();

    @Test
    void testFullProfessorSalary() {
        FullProfessor fp = new FullProfessor(LocalDate.of(2005, 3, 1), "Subito", "Giovanni", 123);

        double grossSalary = salaryCalculator.calculateSalary(fp);
        double netSalary = fp.getSalaryAfterTax(grossSalary);

        assertEquals(6000.0, grossSalary, 0.01);
        assertEquals(4033.33, netSalary, 0.01);
    }

    @Test
    void testAssociateProfessorSalary() {
        AssociateProfessor ap = new AssociateProfessor(LocalDate.of(2015, 4, 1), "Trapani", "Chiara", 628);

        double grossSalary = salaryCalculator.calculateSalary(ap);
        double netSalary = ap.getSalaryAfterTax(grossSalary);

        assertEquals(3200.0, grossSalary, 0.01);
        assertEquals(2360.0, netSalary, 0.01);
    }

    @Test
    void testHeadOfDepartmentSalary() {
        HeadOfDepartment hod = new HeadOfDepartment(LocalDate.of(1995, 2, 1), "Magno", "Alessandro", 64);

        double grossSalary = salaryCalculator.calculateSalary(hod);
        double netSalary = hod.getSalaryAfterTax(grossSalary);

        assertEquals(7300.0, grossSalary, 0.01);
        assertEquals(4774.33, netSalary, 0.01);
    }
}
