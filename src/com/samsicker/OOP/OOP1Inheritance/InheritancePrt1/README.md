1. Use extends to pass a superclass in a child class
2. A child class can only have one super class
3. Super() is used to call the default constructor in the superclass, and operates like this(), which calls the constructor
4. Default constructors are the noargs constructor
5. Must be called as the first in a method, just like constructors
6. Hence this() and super() cannot be called in the same method

//Method Overriding
1. Overriding a method is when you create a method on a subclass, which has the same signature as a method in a super class
2. Used in extending or delimitting the operations of a superclass method, within the sub class or creating a new behavior

//this vs super
1. The key word super is used to access or call the parent class members(both variables and methods)
2. the keyword thus, is used to call the current class members(both variables and methods)
3. this is a requirement where we have a param with the same fullName as an instance field
4. Both can be used anywhere in a class except for static elements
5. super is commonly used with method overriding

//this() and super () calls
1. These are known as calls, since they look like regular method calls, although they call constructors
2. this calls constructor from another overloaded constructor in the same class
3. the this() call can only be used in a constructor, and as the first statement
4. Used in constructor chaining. 
5. The same applies to the super() call, though this is used when calling the parent constructor from a sub class

//Method Overloading vs Method Overriding
1. Method overloading means providing 2 or more separate methods in a class with the same fullName but different params
2. Return type may or may not be different, which allows us to reuse the same method names
3. Overloading reduces duplicated code, and we don't have to remember multiple method names
4. we can overload both static and instance methods
5. It appears as if one method is called with different sets of arguments
6. Java devs refer to method overloading as compile-time polymorphism
7. Rules:
   - Methods must have the same method names
   - Methods must have different params
     - If methods follow the above rules
       - They may/may not have different return types
       - They may/may not have different access modifiers
       - They may/may not throw different checked or unchecked exceptions
8. Method overriding is defining a method in a child class, that already exists in the parent class
9. By extending the parent class, the child class gets all the method defined in the parent class, otherwise called derived methods
10. Method overriding is also known as runtime polymorphism or Dynamic Method Dispatch, because the JVM determines the method to be called at runtime
11. use @Override to catch exceptions when overriding methods
12. Static methods cannot be overridden
13. Rules:
    - Must have the same fullName and same args
    - Return type can be a subclass of the return type in the parent class 
    - It can't have a lower access modifier eg: if a parent's method is protected, then using private in the childs overridden method is not allowed. However, using public for the childs method, would be allowed;
14. Constructors and private methods cannot be overridden
15. Only inherited methods are overridden
16. Methods that are final cannot be overridden
17. A subclass can use super.methodName() to call the superclass version of an overridden method