package PetProject.Exceptions;

public class MenuIncorrectButtonException extends RuntimeException{
    public MenuIncorrectButtonException() {
        System.out.println("Incorrect button! Please press right button");
    }
}
