import java.util.ArrayList;
import java.util.Collections;

public class ConcreteCompany extends Company {
    private ArrayList<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "-")) + name);
        for (Company component : children) {
            component.display(depth + 2);
        }
    }
    
    @Override
    public void lineOfDuty(){
        for (Company component: children) {
            component.lineOfDuty();
        }
    }
}
