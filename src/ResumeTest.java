public class ResumeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "XX公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1999-2006", "YY企业");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("男", "24");
        c.setWorkExperience("1998-2003", "zz企业");

        a.display();
        b.display();
        c.display();
    }
}
