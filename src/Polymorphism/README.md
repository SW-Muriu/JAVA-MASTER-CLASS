1. Polymorphism allows us to write code that can call a method but the actual method that gets executed ca be different for different objects at runtime
2. This means that the behavior that occurs during the program execution depends on the runtime type of the object, which might differ from its declared type in the code
3. For polymorphism to work, the declared type must have a relationship with the runtime type. 
4. Inheritance is one way to establish a relationship, where a subclass can override from its superclass
5. getClass() fetches the run time instance of the class in question. Anf getSimpleName() gets the name of that class
6. Polymorphism is the ability to execute different behavior for different types, which are determined at run time
7. Allows one to write generic code based on the base/parent class
8. And this code in the main method is extendable, meaning it does not have to change as new subclasses become available 