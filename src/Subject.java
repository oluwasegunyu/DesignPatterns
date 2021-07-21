public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void Notify();
    String getAction();
    void setAction(String arction);
}
