package org.starbox.tingting.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.starbox.tingting.pojo.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
