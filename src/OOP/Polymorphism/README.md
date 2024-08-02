1. OOP.Polymorphism allows us to write code that can call a method but the actual method that gets executed ca be different for different objects at runtime
2. This means that the behavior that occurs during the program execution depends on the runtime type of the object, which might differ from its declared type in the code
3. For polymorphism to work, the declared type must have a relationship with the runtime type. 
4. Inheritance is one way to establish a relationship, where a subclass can override from its superclass
5. getClass() fetches the run time instance of the class in question. Anf getSimpleName() gets the name of that class
6. OOP.Polymorphism is the ability to execute different behavior for different types, which are determined at run time
7. Allows one to write generic code based on the base/parent class
8. And this code in the main method is extendable, meaning it does not have to change as new subclasses become available


//Local Variable Type Inference 
1. Intro in Java 10
2. increases code readability. Reduces boilerplate code
3. Called LVTI because
   - Cant be used in field declarations 
   - cant be used in method signatures that is, in param type or return type
   - cant be used without an assignment, since it has to infer. Hence, also, can't be assigned to null
4. Compile time type is similar to declared type
5. run time type is essentially what is on the right of the assignment, and it is determined on the JVM, as bytecode
6. Sevaral rules have to be followed to assign a run time instance to a different compile time type.
   - one of them is through the inheritance rule
     - Where an instance to a variable of the same type , or a parent type, or a parent's parent type including java.lang.Object, the ultimate base class
7. The difference between run time and compile time typing is because of polymorphism. One compile time type 'Movie' was used to generate 4 different run time types 'Adventure etc...'

//InstanceOf operator
1. Test the type of Object/instance
2. The reference variable being tested is the left operand 

unknownObject instanceof Adventure

3. Returns true if unknownObject is an instance of Adventure
4. Not that Adventure is not in quites, meaning I am not testing the type name but the actual type itself

unknownObject instanceof ScienceFiction syfy

if the JVM can identify an object matches the type, it can extract data from the object without casting (Java 16+)
For this operator, the object can be assigned to a variable, in this case, syfy
The variable syfy (if the instance is true) is already typed as a ScienceFiction variable
This is called pattern matching for the instance variable