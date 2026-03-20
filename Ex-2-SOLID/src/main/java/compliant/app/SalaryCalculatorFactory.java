package compliant.app;

import compliant.payroll.ISalaryCalculator;
import compliant.payroll.SalaryCalculator;

public class SalaryCalculatorFactory implements ICalculatorFactory{
    @Override
    public ISalaryCalculator createCalculator(){
        return new SalaryCalculator();
    }
}
