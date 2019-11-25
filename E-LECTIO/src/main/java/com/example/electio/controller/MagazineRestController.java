package com.example.electio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.electio.beans.MagazineBean;
import com.example.electio.repository.MagazineRepo;



@RestController

public class MagazineRestController {
	@Autowired
	MagazineRepo repo;

	@GetMapping("/magazinee/view")
	public List<MagazineBean> view() {

		return repo.findAll();
	}

	@PostMapping("/magazinee/insert")
	public MagazineBean insert(@RequestBody MagazineBean magazine) {

		return repo.save(magazine);
	}
	
	@PostMapping("/magazinee/update")
	public MagazineBean update(@RequestBody MagazineBean magazine) {

		return repo.save(magazine);
	}
	
	@PostMapping("/magazinee/delete/{id}")
	public boolean delete(@PathVariable Integer id) {

		repo.deleteById(id);
		return true;
	}
	

}
