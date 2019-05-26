package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.JurusanModel;
import com.xsis.batch197.model.MahasiswaModel;
import com.xsis.batch197.repository.JurusanRepo;
import com.xsis.batch197.repository.MahasiswaRepo;

@Controller
public class MahasiswaController {
	@Autowired
	private JurusanRepo jurRepo;

	@Autowired
	private MahasiswaRepo mhsRepo;

	@RequestMapping(value = "/mahasiswa") // url
	public String mahasiswa(Model jurusan) {
		List<JurusanModel> jurList = jurRepo.findAll();
		jurusan.addAttribute("jurList", jurList);
		return "/mahasiswa/mahasiswa"; // file fisik di folder
	}

	@RequestMapping(value = "/mahasiswa/save")
	public String save(@ModelAttribute MahasiswaModel mahasiswa) {
		mhsRepo.save(mahasiswa);
		return "redirect:/mahasiswa/list";
	}

	@RequestMapping(value = "/mahasiswa/list")
	public String list(Model kirim) {
		List<MahasiswaModel> mhsList = mhsRepo.findAll();
		kirim.addAttribute("mhsList", mhsList);
		return "/mahasiswa/list";
	}

	@RequestMapping(value = "/mahasiswa/edit/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		MahasiswaModel mahasiswaEdit = mhsRepo.findById(id).orElse(null);
		kirim.addAttribute("mahasiswaEdit", mahasiswaEdit);
		//
		List<JurusanModel> jurList = jurRepo.findAll();
		kirim.addAttribute("jurList", jurList);
		return "mahasiswa/edit";
	}

	@RequestMapping(value = "/mahasiswa/hapus/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		MahasiswaModel mahasiswaEdit = mhsRepo.findById(id).orElse(null);
		mhsRepo.delete(mahasiswaEdit);
		return "redirect:/mahasiswa/list";
	}

}
