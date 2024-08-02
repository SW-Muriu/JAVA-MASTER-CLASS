package OOP.OOP1Inheritance.Person;

public class Person {
    private String firstName = "";
    private String lastName = "";
    private int age;

    //Functional Methods
    public boolean isTeen(){
        return (age > 12 && age < 20  )? true: false;
    }

    public String getFullName(){
        
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        } else if (firstName.isEmpty()){
            return lastName;
        } else if(lastName.isEmpty()){
            return firstName;
        }
        String s = firstName + " " + lastName;
        return s;
    }


    //Getters
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }


    //Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void  setAge(int age){
       this.age =  (age < 0 || age > 100)?  0:  age;
    }



}
