package home3;

public class WrongDataLengthException extends RuntimeException{

    public WrongDataLengthException() {
        super("Введено неверное число данных");
    }
}
