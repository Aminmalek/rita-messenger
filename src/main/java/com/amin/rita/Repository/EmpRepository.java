package com.amin.rita.Repository;

import com.amin.rita.entity.Channel;
import com.amin.rita.entity.EmpUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EmpUser, Long> {

}