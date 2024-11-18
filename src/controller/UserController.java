package controller;

import model.dao.UserDao;
import model.dto.User;

public class UserController {

    public UserDao userDao = UserDao.getInstance();


    public void signUp(String id,String pwd){
        User user = new User(id,pwd);
        userDao.users.add(user);
    }

    public void login(String id, String pwd) {
        for (User user : userDao.users) {
            if (user.getId().equals(id) && user.getPwd().equals(pwd)){
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패");
            }
        }
    }

}
