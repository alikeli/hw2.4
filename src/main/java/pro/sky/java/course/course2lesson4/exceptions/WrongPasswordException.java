package pro.sky.java.course.course2lesson4.exceptions;
public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(String message) {
        super(message);

    }
}
