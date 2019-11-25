package com.example.electio.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.electio.beans.MagazineBean;



@Repository

public interface MagazineRepo extends JpaRepository<MagazineBean, Integer> {
	
	

}
