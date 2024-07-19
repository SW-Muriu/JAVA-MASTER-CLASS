package OOP1Inheritance.InheritancePrt1.JavaObjects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    //    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {

        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}


