public class CalculatorReturn extends Calculator{
    private double moneyCondition=0;
    private double moneyReturn=0;

    public CalculatorReturn(double cashCondition, double cashReturn){
        this.moneyCondition = cashCondition;
        this.moneyReturn = cashReturn;
    }
    public double count(double money){
        double result = money;
        if(money>=moneyCondition)
            result = money-Math.floor(money/moneyCondition)*moneyReturn;
        return result;
    }
}