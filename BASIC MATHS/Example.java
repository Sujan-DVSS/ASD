

class Student{
    String rollno;
    String name;
    int marks;

    public Student(){
        System.out.println("1234" + " Defaulter name " + 35);
    }

    public Student(int marks){
        this.marks = marks;
    }

    public Student(String rollno,String name){
        this(100); //-> this(100) - > Student(int marks)   . ->this() - > Student()
        this.rollno = rollno;
        this.name = name;
    }

    public void display(){
        System.out.println(rollno + " " + name + " " + marks);
    }
}

public class Example {
    public static void main(String args[]) {
       Student sujan = new Student("18241A05J5", "Sujan");
        sujan.display();

    }
}
