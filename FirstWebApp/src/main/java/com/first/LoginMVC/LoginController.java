package com.first.LoginMVC;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/*@Controller
public class com.first.Login.LoginController {
    //@RequestMapping(value = "/login", method = RequestMethod.GET)
    @GetMapping(value = "/login")

    public @ResponseBody
    ResponseEntity<String> sayHello() {
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
}

 */
@Controller
public class LoginController {

    @Autowired
    ValidUserService service;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    //@ResponseBody
    public String showLoginPage() {
        return "Login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String PostLogin(ModelMap modelMap, @RequestParam String name, @RequestParam String password) {
        if (!service.isUserValid(name, password)) {
            modelMap.addAttribute("errorMassage", "Wrong password or ID");
            return "Login";
        }

            modelMap.addAttribute("name", name);
            modelMap.addAttribute("password", password);
            return "Welcome";


    }
}


