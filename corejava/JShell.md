## JSHELL 
Session : 20-Jan-2022
Author: Anthoniraj Amalanathan

### What is jShell?

### Minimum Java Version?

### JSHELL Commands
- `/help` - getting help
- `/exit` - Exit JSHELL
- `/list` - list ALL Snippets
- `/edit` - Edit Snippet in Editor
- `/save` - Save Snippets into File
- `/vars` - list variables
- `/imports` - list imported packages
- `Ctrl+l` - Clear the Screen
- `Ctrl+C` - To exit from the current snippet

#### Use as Calculator (Java Operators Demo)
  ```
  10 + 20
  100 * 3863
  ```

#### Create a String
  String str = "Hello";
  str.toUpperCase()
  str.length()

#### Create a List
  var myList = Arrays.asList(4,5,3,1,2);
  myList.sort(Comparator.naturalOrder())
  myList
  myList.sort(Comparator.reverseOrder())
  myList

#### Create a Greet Method
  String greetUser(String name){
    return "Welcome " + name;
  }
  greetUser("Anthoniraj")

#### Create a Boolean Method
  boolean isEven(int n){
    if (n % 2 == 0) {
       return true;
    }else{
       return false;
    }
  }
isEven(10)
isEven(9)