public class Calculator {
    private double total = 0.0d;

    private double goodPrice=0;
    private double goodNum=0;

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public double getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(double goodNum) {
        this.goodNum = goodNum;
    }

    public double count(){
        total = getGoodPrice()*getGoodNum();
        return total;
    }
}
