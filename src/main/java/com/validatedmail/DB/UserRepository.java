package com.validatedmail.DB;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.validatedmail.pojo.User;

@Repository/*("userRepository")*/
public interface UserRepository extends CrudRepository<User, String> {
    User findByEmailIdIgnoreCase(String emailId);
}