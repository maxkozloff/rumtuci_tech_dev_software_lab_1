package ru.mtusi.lab1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mtusi.lab1.model.tbl_users;


@Transactional(readOnly = true)
public interface Repository extends JpaRepository<tbl_users, Long> {
    @Transactional
    @Modifying
    @Query("DELETE FROM tbl_users U WHERE U.id = :id")
    int delete(@Param("id") Long id);
}
