package com.example.TicketUniverse.security.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/management")
public class ManagementController {


    //TODO sistemare questa classe in base a cosa serve
    @GetMapping("/get")
    public String get() {
        return "GET:: management controller";
    }
    @PostMapping("/post")
    public String post() {
        return "POST:: management controller";
    }
    @PutMapping("/put")
    public String put() {
        return "PUT:: management controller";
    }
    @DeleteMapping("/delet")
    public String delete() {
        return "DELETE:: management controller";
    }


}
