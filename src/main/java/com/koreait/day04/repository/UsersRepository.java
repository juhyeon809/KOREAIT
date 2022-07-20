package com.koreait.day04.repository;

import com.koreait.day04.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    //select * from users where userid=?
    Optional<Users> findByUserid(String Userid);

    // login() : select * from users where userid=? and userpw=?
    Optional<Users> findByUseridAndUserpw(String userid, String userpw);

    // select* from users where status=? order by id desc
    Optional<List<Users>>  findByStatusOrderByIdDesc(String status);


}
