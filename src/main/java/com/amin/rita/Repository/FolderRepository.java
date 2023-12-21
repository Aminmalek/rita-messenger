package com.amin.rita.Repository;

import com.amin.rita.entity.Channel;
import com.amin.rita.entity.EmpUser;
import com.amin.rita.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {

}