package compliant.app;

import compliant.payroll.ISalaryCalculator;
import compliant.payroll.SalaryCalculator;

public class SalaryCalculatorFactory implements ICalculatorFactory{
    @Override
    public ISalaryCalculator creCalculator(){
        return new SalaryCalculator();
    }
}
