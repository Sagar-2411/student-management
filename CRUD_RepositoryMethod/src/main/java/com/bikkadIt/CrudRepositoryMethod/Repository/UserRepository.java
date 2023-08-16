package com.bikkadIt.CrudRepositoryMethod.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.CrudRepositoryMethod.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
