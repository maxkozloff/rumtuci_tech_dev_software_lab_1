package ru.mtusi.lab1.service;

import ru.mtusi.lab1.model.tbl_phonenumber;

import java.util.List;

public interface PhoneService {
    tbl_phonenumber get(Long uid);
    List<tbl_phonenumber> getAll();
    tbl_phonenumber save(tbl_phonenumber number);
    void delete(Long uid);
}
