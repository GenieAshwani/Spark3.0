
class Student{

    int a;
    //default one
    Student(){
        System.out.println("cons......");
    }

    Student(int a){
        this.a=a;
        System.out.println("1 - arg - cons "+a);
    }

    Student(Runnable a){
        System.out.println("1 - arg - cons "+a);
    }
}

class MyRun implements Runnable{
    @Override
    public void run() {

    }
}

public class Demo {

    public static void main(String[] args) {
        //Student s=new Student();
        Student s=new Student(10);

        MyRun r=new MyRun();
       Student s1=new Student(r);

        m1();
    }


    public static void m1()
    {
        System.out.println("m1");
    }

    public static void m1(int a)
    {
        System.out.println("m1 - a "+a);
    }
}
