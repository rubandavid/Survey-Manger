package com.survey.manger.dao;

import com.survey.manger.dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User,Long> {

    List<User> findAll();
}
