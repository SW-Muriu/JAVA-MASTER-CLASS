A text block is a special format for multi-line literals
Added in the JDK-15


String Inspection Methods (isEmpty etc)
String Comparison methods (return boolean)
String Manipulation Methods


//Comparison of Methods:
1. contains - returns boolean if string contains arguments passed
2. endsWith/StartsWith - returns boolean if arguments are passed 
3. regionMatches - returns boolean of defined subregions match


While a string builder is mutable, a string is not. Hence, any new string concatenation should be assigned to a new variable
String methods create a new object in memory, and return a reference to the new object, while string builder
methods return a stringBuilder reference, which is a self reference