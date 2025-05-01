package com.example.userInput.controller;

import com.example.userInput.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RootController {

    @GetMapping()
    public String homePage() {
        return "index";
    }
/*
    @GetMapping("/addUser")
    public String userData(@RequestParam String uName, @RequestParam int uId, @RequestParam int uAge, Model model) {
        model.addAttribute("uName", uName);
        model.addAttribute("uId", uId);
        model.addAttribute("uAge", uAge);

        return "UserData";
    }
*/
    @PostMapping("/addUser")
    public String uData(User user, Model model) {
        model.addAttribute("user", user);
        return "UserData";
    }

    @GetMapping("/userList")
    public String uList(Model model){
        List<User>userList=new ArrayList<>();
        userList.add(new User("Didar", 211, 25));
        userList.add(new User("Omar", 212, 15));
        userList.add(new User("Farhad", 213, 28));

        model.addAttribute("userList",userList);

        return "UserList";
    }

}
