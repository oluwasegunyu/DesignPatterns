public class SqlServerUser implements IUser{
    public void insert(User user){
        System.out.println("在SQL Server中给User表增加一条记录");
    }
    public User getUser(int id){
        System.out.println("在SQL server中根据ID得到user表中的一条记录");
        return null;
    }
}
