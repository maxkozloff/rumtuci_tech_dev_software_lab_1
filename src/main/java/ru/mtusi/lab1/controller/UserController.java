package ru.mtusi.lab1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtusi.lab1.model.tbl_users;
import ru.mtusi.lab1.service.UserService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = UserController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    public static final String REST_URL = "/api/v1/users";

    private UserService us;
    @Autowired
    public UserController(UserService us){
        this.us = us;
    }
    @GetMapping(value = "/{uid}")
    public tbl_users get(@PathVariable("uid") Long uid){
        log.info("get" + uid);
        return us.get(uid);
    }
    @GetMapping
    public List<tbl_users> getAll(){
        log.info("getAll");
        return us.getAll();
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public tbl_users save (@RequestBody tbl_users user){
        log.info("save" + user);
        return us.save(user);
    }

    @DeleteMapping("/{uid}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("uid") Long uid){
        log.info("delete" + uid);
        us.delete(uid);
    }

}
