import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("价格：");
        double price = in.nextDouble();

        System.out.print("数量：");
        double num = in.nextDouble();

        String type = "满300返100";
        CalculatorContext cal = new CalculatorContext(type);

        System.out.println("总计：" + cal.getResult(price*num));
    }
}
