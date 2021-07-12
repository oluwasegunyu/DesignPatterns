import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("请输入数字A：");
            double NumberA = in.nextDouble();

            System.out.println("请选择运算符（+、-、*、/）：");
            String operator = in.next();

            System.out.println("请输入数字B:");
            double NumberB = in.nextDouble();

            double result;

            switch (operator){
                case "+":
                    result = NumberA + NumberB;
                    break;
                case "-":
                    result = NumberA - NumberB;
                    break;
                case "*":
                    result = NumberA * NumberB;
                    break;
                case "/":
                        result = NumberA / NumberB;
                    break;
                default:
                    result = 0;
            }
            System.out.println("结果是：" + result);
        }catch(ArithmeticException ex){
            System.out.println("您地输入有误： " + ex.getMessage());
        }
    }
}
