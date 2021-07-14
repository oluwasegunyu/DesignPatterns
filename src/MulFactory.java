public class MulFactory implements IFactory{
    public Operation CreateOperation(){
        return new OperationMul();
    }
}
