package pro.sky.java.course.course2lesson4.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course.course2lesson4.exceptions.WrongLoginException;
import pro.sky.java.course.course2lesson4.exceptions.WrongPasswordException;
import pro.sky.java.course.course2lesson4.exceptions.WrongPasswordExceptionConfirm;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    public String authorization(String userLogin,
                                String userPassword,
                                String userConfirmPassword) {
        final String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*_)(?=\\S).{6,20}"; ;
        if (userLogin.length() > 20) {
            throw new WrongLoginException("Логин слишком длинный");
        } else if (userPassword.length() > 20) {
            throw new WrongPasswordException("Пароль слишком длинный");
        } else if (!userPassword.matches(regex)) {
            throw new WrongPasswordException("Пароль не соответствует критериям");
        } else if (!userLogin.matches(regex)) {
            throw new WrongLoginException("Логин не соответствует критериям");
        } else if (!userPassword.equals(userConfirmPassword)) {
            throw new WrongPasswordExceptionConfirm("Пароли не совпадают");
        }
        return "Успешная авторизация ";
    }
}
