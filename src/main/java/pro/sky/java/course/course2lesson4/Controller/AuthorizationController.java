package pro.sky.java.course.course2lesson4.Controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course.course2lesson4.exceptions.WrongLoginException;
import pro.sky.java.course.course2lesson4.exceptions.WrongPasswordException;
import pro.sky.java.course.course2lesson4.exceptions.WrongPasswordExceptionConfirm;
import pro.sky.java.course.course2lesson4.service.AuthorizationService;


@RestController
@RequiredArgsConstructor

public class AuthorizationController {
    private final AuthorizationService authorizationService;


    @GetMapping
    public String authorization(@RequestParam(name = "log") String userLogin,
                                @RequestParam(name = "pass") String userPassword,
                                @RequestParam(name = "confirmPass") String userConfirmPassword) {

        try {
            return authorizationService.authorization(userLogin, userPassword, userConfirmPassword);
        } catch (WrongLoginException e) {
            return "Попробуйте другой логин";
        } catch (WrongPasswordException e) {
            return "Попробуйте другой пароль";
        } catch (WrongPasswordExceptionConfirm e) {
            return "Пароли не совпадают";
        }

    }
}

