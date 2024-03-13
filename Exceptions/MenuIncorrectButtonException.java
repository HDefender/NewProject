package PetProject.Exceptions;

// FIXME: 13.03.2024 Если ты не прерываешь работу менюшки при этом (еще не дошел) - исключение выглядит избыточным
public class MenuIncorrectButtonException extends RuntimeException{ // FIXME: 13.03.2024 пробел
    public MenuIncorrectButtonException() {
        System.out.println("Incorrect button! Please press right button");
    }
}
