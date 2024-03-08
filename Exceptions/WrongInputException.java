package PetProject.Exceptions;

public class WrongInputException extends RuntimeException{
    public WrongInputException() {
        System.out.println("Wrong input in the field! Please try again");
    }
}
