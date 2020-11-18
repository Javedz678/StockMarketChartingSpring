package com.project.stock.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.project.stock.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	Optional<User>  findByUserNameAndPassword( String username,String password);
	Optional<User>  findByUserNameAndPasswordAndType( String username,String password,String type);
}
