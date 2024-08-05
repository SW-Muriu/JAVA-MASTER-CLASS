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