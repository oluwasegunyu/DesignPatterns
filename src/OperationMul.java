public class OperationMul extends Operation{
    public double GetResult(){
        double result = 0;
        result = get_numberA() * get_numberB();
        return result;
    }
}