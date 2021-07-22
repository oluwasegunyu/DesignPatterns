import com.sun.xml.internal.bind.v2.model.core.ID;

public class DBTest {
    public static void main(String[] args){
        User user = new User();
        Department dept = new Department();

        IFactory factory = new AccessFactory();
        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);

        IDepartment id = factory.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
    }
}
