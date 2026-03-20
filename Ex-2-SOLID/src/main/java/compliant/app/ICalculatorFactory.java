package compliant.app;

import compliant.payroll.ISalaryCalculator;

public interface ICalculatorFactory {
    public ISalaryCalculator createCalculator();
}
