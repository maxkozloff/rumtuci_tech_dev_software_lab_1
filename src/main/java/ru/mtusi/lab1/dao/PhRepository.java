package ru.mtusi.lab1.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mtusi.lab1.model.tbl_phonenumber;

@Transactional(readOnly = true)
public interface PhRepository extends JpaRepository<tbl_phonenumber, Long> {
@Transactional
@Modifying
@Query("DELETE FROM tbl_phonenumber P WHERE P.id = :id")
    int delete(@Param("id") Long id);
}
