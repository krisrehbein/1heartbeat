package org.example.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {


    @RequestMapping("")
    public String index() {

        return "index";
}




}
