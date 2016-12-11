package com.example.hello.dao;

/**
 * Created by Administrator on 2016/12/8.
 */
import com.example.hello.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
    public User findByName(String name);
    /*  public User save(User user);
      public User update(User user);*/
    public void delete(User user);
    public ArrayList<User> findAll();
}