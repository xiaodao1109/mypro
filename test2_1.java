import java.util.ArrayList;
class Student{
    int id;
    String name;
    String sex;
    int ChineseScore;
    int MathScore;
    int EnglishiScore;
    public void addmessage(int a, String b,String c){
        this.id=a;
        name=b;
        sex=c;
    }
    public void showmessage(){
        System.out.println("学号："+id+" 姓名："+name+" 性别："+sex);
    }
    public void search(int id){
        if(this.id==id){
            showmessage();
        }
    }

}
public class test2_1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Student s1=new Student();
        s1.addmessage(1,"2","男");
        s1.showmessage();
        arrayList.add(s1);
        Student s2=new Student();
        s2.addmessage(2,"3","女");
        arrayList.add(s2);
        Student s3=new Student();
        s3.addmessage(3,"4","女");
        arrayList.add(s3);

        for(Object stu :arrayList){
            Student student =(Student) stu;
            student.search(3);
        }
    }
}