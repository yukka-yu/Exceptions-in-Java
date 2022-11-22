package home3;

public class WrongSexException extends RuntimeException{
    public WrongSexException() {
        super("Пол введён неверно");
    }
}
