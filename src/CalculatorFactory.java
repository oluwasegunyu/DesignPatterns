public class CalculatorFactory {
    public static Calculator CreateCalculator(String type){
        Calculator cal = null;
        switch (type){
            case "正常收费":
                cal = new CalculatorNormal();
                break;
            case "满300返100":
                cal = new CalculatorReturn(300,100);
                break;
        }
        return cal;
    }
}
