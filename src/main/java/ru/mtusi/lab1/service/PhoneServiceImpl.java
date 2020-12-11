package ru.mtusi.lab1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtusi.lab1.dao.PhRepository;
import ru.mtusi.lab1.model.tbl_phonenumber;

import java.util.List;


@Service
public class PhoneServiceImpl implements PhoneService{

    private final PhRepository repo;
    @Autowired
    public PhoneServiceImpl (PhRepository repo){
        this.repo=repo;
    }

    @Override
    public tbl_phonenumber get(Long uid){
        tbl_phonenumber phone = repo.findById(uid).orElse(null);
        if (phone == null)
        {
            throw new java.lang.Error("такой записи не существует");
        }


        return phone;
    }
    @Override
    public List<tbl_phonenumber> getAll(){
        return repo.findAll();
    }

    @Override
    public tbl_phonenumber save(tbl_phonenumber number) {
        return repo.save(number);
    }

    @Override
    public void delete(Long uid){
        repo.delete(uid);
    }


}
