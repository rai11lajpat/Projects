import java.util.ArrayList;

class Student{
    private String Name;
    private String rollNo;
    private String grade;
    private String depart;

    public Student(){

    }
    public Student(String name, String rollNo, String grade, String depart) {
        Name = name;
        this.rollNo = rollNo;
        this.grade = grade;
        this.depart = depart;
    }
   
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getDepart() {
        return depart;
    }
    public void setDepart(String depart) {
        this.depart = depart;
    }
     @Override
    public String toString() {
        return "Student [Name=" + Name + ", rollNo=" + rollNo + ", grade=" + grade + ", depart=" + depart + "]";
    }
    
}






public class SutdentManagment{
    private static final String Student = null;
    Student student;
    static ArrayList<Student> list=new ArrayList<>();

    public static void addStudent(Student st){
        list.add(st);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }  


    public static void main(String[] args) {

        System.out.println("sfdgad");
        Student s1=new Student("gdsfg", "sdfg", "45sd", "df");
        Student s2=new Student("gdsfg", "sdfg", "45sd", "df");
        SutdentManagment.addStudent(s1);
        SutdentManagment.addStudent(s2);

    }
}