public class CalculatorReturn extends Calculator{
    private double moneyCondition=0;
    private double moneyReturn=0;

    public CalculatorReturn(double cashCondition, double cashReturn){
        this.moneyCondition = cashCondition;
        this.moneyReturn = cashReturn;
    }
    public double count(){
        double result = getGoodNum()*getGoodPrice();
        if(getGoodNum()*getGoodPrice()>=moneyCondition)
            result = getGoodNum()*getGoodPrice()-Math.floor(getGoodNum()*getGoodPrice()/moneyCondition)*moneyReturn;
        return result;
    }
}