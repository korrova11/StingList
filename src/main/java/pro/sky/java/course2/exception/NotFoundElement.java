package pro.sky.java.course2.exception;

public class NotFoundElement extends RuntimeException{
    public NotFoundElement(String message) {
        super(message);
    }
}
