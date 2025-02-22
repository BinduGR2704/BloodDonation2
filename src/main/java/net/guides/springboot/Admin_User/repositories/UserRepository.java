package net.guides.springboot.Admin_User.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import  net.guides.springboot.Admin_User.model.User;


import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByEmail (String email);

    @Query(value="select * from users where users.bloodgroup like ?1 " , nativeQuery=true)
   public List<User> findByKeyword(@Param("keyword") String keyword);


}