package collectionsdemo.ListDemo;


import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparator
{

    Employee()
    {

    }
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee) o1;
        Employee e2=(Employee) o2;
        if(e1.getId()>e2.getId())
        {
            return +1;
        }
        else if(e1.getId()<e2.getId())
        {
            return -1;
        }
        else {
            return 0;
        }
    }
}

public class ComparatoDemo {

    public static void main(String[] args) {
        Employee emp1=new Employee(1,"Ayush");
        Employee emp2=new Employee(5,"Piyush");
        Employee emp3=new Employee(3,"Abhishek");
        Employee emp4=new Employee(6,"Yogsh");
        System.out.println(emp1);

        TreeSet<Employee> treeSet=new TreeSet<>(new Employee());
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        System.out.println(treeSet);

    }
}
