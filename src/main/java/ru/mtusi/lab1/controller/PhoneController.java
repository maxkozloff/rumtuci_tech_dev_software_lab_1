package ru.mtusi.lab1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtusi.lab1.model.tbl_phonenumber;
import ru.mtusi.lab1.service.PhoneService;


import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = PhoneController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class PhoneController {
    public static final String REST_URL = "/api/v1/numbers";

    private PhoneService ph;
    @Autowired
    public PhoneController(PhoneService ph){
        this.ph = ph;
    }
    @GetMapping(value = "/{uid}")
    public tbl_phonenumber get(@PathVariable("uid") Long uid){
        log.info("get" + uid);
        return ph.get(uid);
    }
    @GetMapping
    public List<tbl_phonenumber> getAll(){
        log.info("getAll");
        return ph.getAll();
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public tbl_phonenumber save (@RequestBody tbl_phonenumber number){
        log.info("save" + number);
        return ph.save(number);
    }

    @DeleteMapping("/{uid}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("uid") Long uid){
        log.info("delete" + uid);
        ph.delete(uid);
    }

}
