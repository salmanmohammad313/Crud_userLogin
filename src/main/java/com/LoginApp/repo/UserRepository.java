package com.LoginApp.repo;

import com.LoginApp.dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

    public User findByUserNameAndPassword(String userName, String password);
}
