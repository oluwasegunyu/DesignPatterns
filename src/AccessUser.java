public class AccessUser implements IUser{
    public void insert(User user){
        System.out.println("在ACCESS数据库中给User表添加一条记录");
    }

    public User getUser(int id){
        System.out.println("在Access中根据ID得到User表一条记录");
        return null;
    }
}
