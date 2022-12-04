//By extending the JpaRepository interface we inherit the save, findAll, findById methods.
package com.cst8277.ums.ojo.johnson.data.repository;

import com.cst8277.ums.ojo.johnson.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
    public interface UserRepository extends JpaRepository<User, Integer>{

}


