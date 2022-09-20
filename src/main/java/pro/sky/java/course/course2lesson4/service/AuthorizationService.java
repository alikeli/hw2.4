package pro.sky.java.course.course2lesson4.service;

public interface AuthorizationService {
    String authorization(String userLogin,
                         String userPassword,
                         String userConfirmPassword);
}
