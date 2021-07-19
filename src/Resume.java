public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name){
        this.name = name;
        work = new WorkExperience();
    }

    public Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work = (WorkExperience) work.clone();
    }

    public void setPersonalInfo(String sex, String age){
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String timeArea, String company){
        work.setWorkDate(timeArea);
        work.setCompany(company);
    }

    public void display(){
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历 " + work.getWorkDate() + work.getCompany());
    }

    public Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
