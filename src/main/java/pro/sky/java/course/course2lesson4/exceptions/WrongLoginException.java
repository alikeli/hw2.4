package pro.sky.java.course.course2lesson4.exceptions;
public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);

    }
}
