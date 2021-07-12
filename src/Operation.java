public class Operation {
    public static double GetResult(double NumberA, double NumberB, String operator){
        double result = 0d;
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
            }
            return result;
    }
}
