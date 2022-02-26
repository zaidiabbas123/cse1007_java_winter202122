# Exception Handling in Java
## Whats is an Exception?
- Something goes wrong during execution of the program.
- It can be handled by using `try` and `catch` blocks
## try and catch block
- If developer thinks or predicts something may go wrong in a single or block of statements that can be written inside the try block.
- The appropriate exception can be written in catch block with valid error message.
- During runtime, if exception happens in try block then it will pass the control to catch. Catch block will display the appropriate message and JVM will continue execution of remaining part of the program.

## What is finally?
- `finally` is a block which will always be executed even if exception happened during runtime.
- It is used for primarily in handling database and socket connections in real time.

## throws and throw
- if developer does not want to handle the exception. it can be thrown using `throws` keyword.
- `throw` is used for creating user defined exception.

## Which exception cases will terminate the program?
- Case-1: If JVM capture and throws the exception
- Case-2: If developer uses throws without try-catch
- Case-3: If developer creates own exception using throw with built-in exception classes

## Conclusion
- Always use try-catch in Java program if there are chances for error in statement(s)