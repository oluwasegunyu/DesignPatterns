import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("价格：");
        double price = in.nextDouble();

        System.out.print("数量：");
        double num = in.nextDouble();

        Calculator cal = CalculatorFactory.CreateCalculator("满300返100");
        cal.setGoodNum(num);
        cal.setGoodPrice(price);
        System.out.println("总计：" + cal.count());
    }
}
