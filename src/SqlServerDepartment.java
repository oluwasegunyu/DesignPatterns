public class SqlServerDepartment implements IDepartment{
    @Override
    public void insert(Department department){
        System.out.println("在SQL Server中给Department表添加一条记录");
    }

    @Override
    public Department getDepartment(int id){
        System.out.println("在SQL Server中根据id得到Department表中的一条记录");
        return  null;
    }
}
