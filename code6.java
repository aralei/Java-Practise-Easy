class Person
{
    //protected型  
    protected String name;
    protected String addr;
    protected String sex;
    protected String age;
 
    //set,getの使用を忘れずに
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAddr() {
        return addr;
    }
 
    public void setAddr(String addr) {
        this.addr = addr;
    }
 
    public String getSex() {
        return sex;
    }
 
    public void setSex(String sex) {
        this.sex = sex;
    }
 
    public String getAge() {
        return age;
    }
 
    public void setAge(String age) {
        this.age = age;
    }
 
    void ShowItems()
    {
        System.out.println(getName() + getAddr() + getSex() + getAge());
    }
}
 
class Student extends Person
{
    int mathScore;
    int englishScore;
    //それ以外はPersonから継承
 
    public Student(String name, String addr, String sex, String age, int mathScore, int englishScore) {
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.name = name;
        this.addr = addr;
        this.sex = sex;
        this.age = age;
    }
 
    void ShowItems()
    {
        System.out.println(name + addr + sex + age + mathScore + englishScore);
    }
}

public class Mycode6 {
    public static void main(String[] args)
    {
        Student stu = new Student("bobo", "osaka", "boy", "25", 80, 90);
        stu.ShowItems();
    }
}
