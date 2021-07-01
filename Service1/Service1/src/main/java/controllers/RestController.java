package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("")
        public String getAdressFromKLADR(@RequestParam String code)
        {

            return "";
        }

}
