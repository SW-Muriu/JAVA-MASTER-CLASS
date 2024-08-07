//Arrays

1. A way to store and manipulate values of the same type
2. It is not necessary to specify the size of an array, and when you have to, use the new keyword.
   -Eg:
    - int[] intArray = new int[10];
3. Once instantiated with a size, an array's size cannot be changed
4. We can use an array initializer instead of initializing all the number individually

   int[] firstFivePositives = new int[]{1,2,3,4,5};

5. Can also use the anonymous array initializer

   int[] firstFivePositives = {1,2,3,4,5}

6. An array is a special java class and hence inherits from java.lang.Object

//Advanced for loop

1. The enhanced for loop walks through elements in an array, or other form of collection types
2. It processes one element at a time, from the first element to the last

   for(declaration: collection){
   //Block of statements
   }

3. java.util.arrays holds static methods for arrays common functionalities. They are not instance methods
4. You can create an array of objects, with each object having different values, hence this can contain different types

//Array Manipulation
1. Common behaviours of the Array class include
   - Sorting
   - Initializing Values
   - Copying 
   - Searching 
2. These classes are provided for by the Array helper class as static methods
3. copyOf can be used for a partial copy, a full copy or a copy plus extra values 



//Searching in Arrays 
1. Linear/Sequential search: Expensive method since you are checking through the elements one after the other 
2. Interval Searching: As done in using a dictionary 
3. There are various methods to each of the 2 search techniques above. 


//Binary Search 
1. It is static for Arrays class. 
2. Points to note:
   - Array must be sorted
   - If there are duplicate values, there's no telling at which duplicate value it will much
   - Elements must be comparable 
   - Method returns the position of a match if found, -1 otherwise 
   - Remember, the position is not necessarily the first/last matching element
- In comparing arrays, they are only equal if they have the same length, they elements are placed the same and in the same indices


1. When you assign an object to a variable, the variable becomes a reference to that object
2. This is true of arrays, but the array has yet another indirection if its an array of objects
3. Every array element is also a reference
4. A reference is an address to the object in memory, but not the object itself



//Variable Arguments/ Variadic Arguments (varargs)

1. Used when one wants to allow a method to accept a variable number of the same type of arguments. This is done using an ellipsis

   - public void sum(int... args){}
   - 