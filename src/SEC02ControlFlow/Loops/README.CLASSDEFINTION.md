-Attributes on classes are another way to store data
- A class is a custom data type
- it's like an empty form, which can be issued to unique individual (Objects) to fill
- An object is therefore an instance of a class
- creation of an object from a class is instantiations
- new keyword creates an instance of a class
- Data types are actually native classes
- eg: 
  - String s = "HEllO" can be as 
  - String s = new String("Hello")
- There are 2 types of fields. The instance field and the static field
- The value in a static field is stored in a special memory location, and only in one place
- It is hence accessed using ClassName.fieldName
  - eg: Integer.MAX_VALUE (This is stored in the class)
- However, in an instance field, the value is not stored
- It is accessed as ObjectVariable.fieldName
  - eg: myObject.firstName
- There are also static method and instance method.
- Static methods require the word 'static' when declaring the class
- Methods are accessed as ClassName.methodName
  - eg: 
    - Integer.parseInt('123');
    - The method called parseInt is called directly from the class Integer
- However, instance methods omit the word static, when declared on the class
- Method is accessed by ObjectVariable.methodName
  - eg: 
    - "Hello".toUppercase()
    - The method called toUpperCase is called on an instance of a String, with a value "hello"