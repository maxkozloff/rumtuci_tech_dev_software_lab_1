package ru.mtusi.lab1.service;

import ru.mtusi.lab1.model.tbl_users;
import java.util.List;

public interface UserService {

    tbl_users get(Long uid);

    List<tbl_users> getAll();

    tbl_users save(tbl_users user);

    void delete(Long uid);

}
