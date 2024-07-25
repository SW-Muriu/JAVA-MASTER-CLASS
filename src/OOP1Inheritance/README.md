1. OOP is a way to model real world aobjects as s/w objects which contain both data and code
2. AKA Class-based programming
3. A class is the blueprint of an object
4. Real world objects have 2 main components:
   a. state
   b. Behavior
5. State describe the object,
6. Behavior defines the actions that can be performed by the object
7. The class defines the data (fields) and the behavior (methods) that are relevant to the real world object in question
8. If a field is not static, its called an instance field, and  each object may have a different value for that field stored
9. A static method can't be dependent on any one object's stat, so it can't reference any instance members
10. Therefore, any method that operates on instance fields, has to be nonstatic


1. classes are organized in logical groupings called packages
2. You declare a package name in the class using the package statement
3. If you don't declare a package, the class implicitly belongs to the default package
4. A class is said to be top-level, if its defined in the src file, and not enclosed in the code block of another class, type or method
5. A top level class has only 2 valid access modifier options: Public or none
6. When the access modifier is omitted, this has a special meaning called package access, meaning the class is accessible only to classes in the same package

//Access Modifiers for class members
1. They are public, protected and private 
2. Allow granular control over class members
3. Public gives unrestricted access from any other class, in any other package
4. Protected Allows access in the same package, and any subclasses in other packages, to have access to the member
5. When the modifier is omitted, it creates package access, when only classess in the same package have access
6. Private means th2at no other class can access this member

//Encapsulation 
1. All member attributes should be private, for encapsulation
2. Encapsulation is the bundling of behavior and attributes on a single object
3. Also, it entails hiding of some fields and methods from public access 


//Getters and Setters
1. A getter is a method on a class that retrieves the value of a private field, and returns it
2. A setter is a method on a class that sets the value of a private field
3. The 2 control and protect access to private fields