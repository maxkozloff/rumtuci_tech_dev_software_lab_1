package ru.mtusi.lab1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtusi.lab1.dao.Repository;
import ru.mtusi.lab1.model.tbl_users;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final Repository repo;

    @Autowired
    public UserServiceImpl (Repository repo){
        this.repo=repo;
    }

    @Override
    public tbl_users get(Long uid){
        tbl_users Users = repo.findById(uid).orElse(null);
        if (Users == null)
        {
            throw new java.lang.Error("такой записи не существует");
        }
        return Users;
    }

    @Override
    public List<tbl_users> getAll(){
        return repo.findAll();
    }

    @Override
    public tbl_users save(tbl_users user){
        return repo.save(user);
    }

    @Override
    public void delete(Long uid){
        repo.delete(uid);
    }



}
