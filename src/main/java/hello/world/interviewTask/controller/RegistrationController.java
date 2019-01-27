package hello.world.interviewTask.controller;

import hello.world.interviewTask.dao.UserRep;
import hello.world.interviewTask.entity.User;
import hello.world.interviewTask.model.PasswordValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegistrationController {

    @Autowired
    private UserRep userRepo;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(Model model, User user) {
        User userFromDb = userRepo.findByUsername(user.getUsername());

        if (userFromDb != null){
            model.addAttribute("errorMessage", "User already exists");
            return "registration";
        }

        userRepo.save(user);

        return "redirect:/login";
    }


    @PostMapping("/validation")
    @ResponseBody
    public String checkPassword(@RequestBody PasswordValidation password){
       return "TEST = " + password.getPassword();
    }

}
