package home3;

public class WrongPhoneNumberLengthException extends RuntimeException{
    public WrongPhoneNumberLengthException() {
        super("В номере телефона неверное число цифр");
    }
}

