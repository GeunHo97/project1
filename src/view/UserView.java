package view;


import controller.UserController;
import model.dto.User;

import java.util.Scanner;

public class UserView {

    public UserController userController = new UserController();
    public Scanner sc = new Scanner(System.in);
    public void signUp() {
        while (true) {
            System.out.println("---- 화원가입 ----");
            System.out.println("아이디입력 :");
            String id = sc.next();
            System.out.println("비밀번호입력 : ");
            String pwd = sc.next();
            userController.signUp(id,pwd);
            return;
        }
    }


    public void login() {
        while (true){
            System.out.println("---- 로그인 ----");
            System.out.println("아이디입력 :");
            String id = sc.next();
            System.out.println("비밀번호입력 : ");
            String pwd = sc.next();
            userController.login(id,pwd);
            return;
        }
    }
}
