## JSHELL 
- Date : 20-Jan-2022
- Author : Anthoniraj Amalanathan

### What is JSHELL?
- JSHELL is the command line tools for Read/Evaluate/Print/Loop (REPL) Java Statements
- It can be used for learning Java Concepts
- The small Java Statements executed in JSHELL is called as Snippets
- To run, type `jshell` in Terminal/Command Window

### Minimum Java Version?
- Minimum JDK9 version is required to use JSHELL

### JSHELL Commands
- `/help` - Getting help
- `/exit` - Exit JSHELL
- `/list` - List ALL Snippets
- `/edit` - Edit Snippet in Editor
- `/save` - Save Snippets into File
- `/vars` - List variables
- `/imports` - List imported packages
- `/reset` - Reset the current session
- `Ctrl+l` - Clear the Screen
- `Ctrl+C` - To exit from the current snippet

#### Use as Calculator (Java Operators Demo)
  ```java
  10 + 20
  100 * 3863
  ```

#### Create a String
  ```java
  String str = "Hello";
  str.toUpperCase()
  str.length()
  ```

#### Create a List
- Creatigng a Simple List
- Getting Dynamic Help of a Method (Press Tab after typing Char(s))
- List.of() vs Arrays.asList()

```java
  var myList = Arrays.asList(4,5,3,1,2);
  myList.sort(Comparator.naturalOrder())
  myList
  myList.sort(Comparator.reverseOrder())
  myList
```

#### Create a Greet Method
- Simple method 
```java
  String display(){
    return "Welcome to JSHELL";
  }
  display()
```

- Method with Parameter
```java
  String greetUser(String name){
    return "Welcome " + name;
  }
  greetUser("Anthoniraj")
```

#### Create a Boolean Method
- If-Else Statement

```java
  boolean isEven(int n){
    if (n % 2 == 0) {
       return true;
    }else{
       return false;
    }
  }
isEven(10)
isEven(9)
```
- Conditional Operator
```java
boolean isOdd(int n){ 
   return (n%2 !=0)? true:false; 
}
```

#### Save the Snippets into File
```
/save C:\Users\Anthoniraj\Documents\Snippet.java
```