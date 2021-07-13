public class CalculatorTest {
    public static void main(String[] args){
        Calculator cal = new Calculator();

        cal.setGoodPrice(2);
        cal.setGoodNum(2);
        cal.count();
        System.out.println("总价：" + cal.count());
    }
}
