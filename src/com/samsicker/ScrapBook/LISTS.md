1. Collections are java containers

**Lists And ArrayLists**
- A special type IN Java called Interface
- List Interface describes a set of method signatures that all List classes implement have.


- In Java, a List is an ordered collection of elements that can contain duplicate elements. It is part of the Java Collections Framework and is one of the most commonly used interfaces for handling collections of data. The List interface provides various methods to manipulate and access elements in a sequential manner.
**Key Characteristics of a List**
  - Ordered Collection:
        A List maintains the order of elements based on the sequence in which they were inserted. This means that elements can be accessed by their index, starting from 0.
  - Allows Duplicates:
      A List can contain duplicate elements. This is different from sets, which do not allow duplicates. 
  - Index-Based Access:
    - Elements in a List can be accessed, inserted, or removed using their index, making List suitable for scenarios where you need random access to elements.
  - Generic Type:
Like other collections in Java, List is a generic interface, which means it can hold elements of any specified type.
Example: List<String> can hold a list of strings, while List<Integer> can hold a list of integers.

**ArrayList:**
* Implements a resizable array, which means it can grow and shrink in size dynamically.
* Offers fast random access to elements since it is backed by an array.
* Slower when inserting or removing elements in the middle of the list because it requires shifting elements.
* Commonly used when you need fast access to elements and don't expect frequent insertions/removals.

 **LinkedList:**
* Implements a doubly linked list, where each element is stored in a node that has pointers to the previous and next nodes.
* Faster when inserting or removing elements in the middle of the list since it only involves updating pointers.
* Slower random access compared to ArrayList because it requires traversal from the start or end of the list.
* Commonly used when you need frequent insertions or deletions.

**Stack:**

* A subclass of Vector that represents a last-in, first-out (LIFO) stack.
* Contains methods like push(), pop(), and peek() to manipulate the stack.

**Vector:**

* Similar to ArrayList, but is synchronized, making it thread-safe.
* Slower than ArrayList due to the overhead of synchronization.
* Rarely used in modern Java programming, often replaced by ArrayList or more advanced concurrency collections.


**Common Methods**
Here are some of the commonly used methods in the List interface:

1. add(E element): Appends the specified element to the end of the list.
2. add(int index, E element): Inserts the specified element at the specified position in the list.
3. get(int index): Returns the element at the specified position in the list.
4. set(int index, E element): Replaces the element at the specified position in the list with the specified element.
5. remove(int index): Removes the element at the specified position in the list.
6. remove(Object o): Removes the first occurrence of the specified element from the list.
7. size(): Returns the number of elements in the list.
8. contains(Object o): Returns true if the list contains the specified element.
9. isEmpty(): Returns true if the list contains no elements.
10. clear(): Removes all the elements from the list.
11. subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.