package pro.sky.java.course.course2lesson4.exceptions;
public class WrongPasswordExceptionConfirm extends RuntimeException{
    public WrongPasswordExceptionConfirm(String message) {
        super(message);
    }
}
