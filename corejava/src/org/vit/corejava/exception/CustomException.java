package org.vit.corejava.exception;

class AgeLimitExceedException extends Exception{
    public AgeLimitExceedException(String message){
       super(message);
    }     
}

public class CustomException {

    public static String getAge(int age) throws AgeLimitExceedException{
        if(age > 80){
            throw new AgeLimitExceedException("Invalid Age!");
        }else{
            return "Valid Age!";
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(getAge(88));
        } catch (AgeLimitExceedException e) {
             System.out.println(e.toString());
        }
    }
    
}
