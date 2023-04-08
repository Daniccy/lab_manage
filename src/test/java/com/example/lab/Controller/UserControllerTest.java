//package com.example.lab.Controller;
//
//import com.example.lab.Entity.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class UserControllerTest {
//    @Autowired
//    private UserController controller;
//
//    @Test
//    void add() {
//        User u = new User();
//        u.setUserName("test");
//        u.setUserPassward("test");
//        u.setUserPhone("123");
//        u.setUserMail("163");
//        controller.add(u);
//    }
//
//    @Test
//    void get() {
//        controller.get("0011");
//    }
//
//    @Test
//    void update() {
//        User u = new User();
//        u.setUserName("test");
//        u.setUserPassward("test");
//        u.setUserPhone("113");
//        u.setUserMail("163");
//        controller.update(u);
//    }
//
//    @Test
//    void delete() {
//        controller.delete("0011");
//    }
//
//	@Test
//	void login(){
//		controller.login("陈彤烨", "pwd666");
//	}
//}