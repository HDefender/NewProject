package PetProject.Exceptions;

// FIXME: 13.03.2024 InvalidInputException звучит лучше
public class WrongInputException extends RuntimeException{// FIXME: 13.03.2024 пробел
    public WrongInputException() {
        System.out.println("Wrong input in the field! Please try again");
    }
}
