package com.example.electio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.electio.beans.MagazineBean;
import com.example.electio.repository.MagazineRepo;
@Controller
public class MagazineController {
	
@Autowired
private MagazineRepo repo;

@GetMapping("/admin")
public String showAdminPage() {
	return "admin";
}

	@GetMapping("/insert")
	public String showIndexPage() {
		return "insert";
	}
	
	@PostMapping("magazine/insert")
	public String showSuccessPage(MagazineBean magazine,Model model) {
		repo.save(magazine);
		model.addAttribute("magazine/insert",magazine);
		return "success";
	}

}
