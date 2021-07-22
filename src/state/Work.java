package state;

public class Work {
    private int hour;
    private boolean finish = false;
    private State current;

    public Work(){
        current = new ForeNoonState();
    }

    public void setState(State s){
        current = s;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

}
