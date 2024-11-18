package view;

import controller.UserController;

import java.util.Scanner;

public class MainView {
    public Scanner sc = new Scanner(System.in);
    public UserView userView = new UserView();

    public void mainView(){

        while (true) {
            System.out.println("---- 게시판 ----");
            System.out.println("1. 회원가입   2.로그인   *.종료");
            System.out.println("숫자를 입력해주세요 : ");

            int choose = 0;
            try {
                 choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR");
                sc.nextLine();
                continue;
            }
            switch (choose){
                case 1:
                    userView.signUp();
                    break;
                case 2:
                    userView.login();
                    break;
                default:
                    System.out.println("종료");
                    return;
            }

        }
    }

}
