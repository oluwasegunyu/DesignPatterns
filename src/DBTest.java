import com.sun.xml.internal.bind.v2.model.core.ID;

public class DBTest {
    public static void main(String[] args){
        User user = new User();
        Department dept = new Department();

        IUser iu = DataAccess.createUser();
        iu.insert(user);
        iu.getUser(1);

        IDepartment id = DataAccess.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
    }
}
