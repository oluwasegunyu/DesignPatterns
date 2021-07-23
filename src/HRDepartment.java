import java.util.Collections;

public class HRDepartment extends Company{
    public HRDepartment(String name){
        super(name);
    }

    @Override
    public void add(Company c){}

    @Override
    public void remove(Company c){}

    @Override
    public void display(int depth){
        System.out.println(String.join("", Collections.nCopies(depth, "-")) + name);
    }

    @Override
    public void lineOfDuty(){
        System.out.println(name + "员工招聘培训管理");
    }
}
