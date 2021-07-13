public class CalculatorContext {
    private Calculator cal;

    public CalculatorContext(String type){
        switch (type){
            case "正常收费":
                cal = new CalculatorNormal();
                break;
            case "满300返100":
                cal = new CalculatorReturn(300,100);
                break;
        }
    }

    public double getResult(double money){
        return cal.count(money);
    }
}
