package OOP1Inheritance.InheritancePrt1.JavaObjects;

public class Main extends Object{
    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);

    }
}

//Only one class in  a java source file can be public


