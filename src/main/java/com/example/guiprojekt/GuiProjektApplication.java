package com.example.guiprojekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class GuiProjektApplication {


    public static void main(String[] args) {
        SpringApplication.run(GuiProjektApplication.class, args);
    }

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/virksomheden")
    public String virksomheden() {
        return "virksomheden";
    }

    @GetMapping("/forbrugeren")
    public String forbrugeren() {
        return "forbrugeren";
    }

    @GetMapping("/om_os")
    public String om_os() {
        return "Om os";
    }
    @GetMapping("/om_madspild")
    public String om_madspild() {
        return "om madspild";
    }

}
