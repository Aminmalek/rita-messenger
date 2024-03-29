package com.amin.rita.repository;
import com.amin.rita.entity.Notif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifRepository extends JpaRepository<Notif, Long> {

}