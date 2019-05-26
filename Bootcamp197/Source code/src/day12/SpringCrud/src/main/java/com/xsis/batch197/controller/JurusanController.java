package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.FakultasModel;
import com.xsis.batch197.model.JurusanModel;
import com.xsis.batch197.repository.FakultasRepo;
import com.xsis.batch197.repository.JurusanRepo;

@Controller
public class JurusanController {
	@Autowired
	private JurusanRepo jurRepo;

	@Autowired
	private FakultasRepo fakRepo;

	@RequestMapping(value = "/jurusan") // url
	public String jurusan(Model fakultas) {
		List<FakultasModel> listFakultas = fakRepo.findAll();
		fakultas.addAttribute("listFakultas", listFakultas);
		return "jurusan/jurusan"; // file fisik
	}

	@RequestMapping(value = "/jurusan/save")
	public String save(@ModelAttribute JurusanModel dataJurusan) {
		jurRepo.save(dataJurusan);
		return "redirect:/jurusan/list";
	}

	@RequestMapping(value = "/jurusan/list")
	public String list (Model kirim) {
		List<JurusanModel> jurList = jurRepo.findAll();
		kirim.addAttribute("jurList", jurList);
		return "jurusan/list";
	}
	@RequestMapping(value="/jurusan/edit/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		JurusanModel jurEdit = jurRepo.findById(id).orElse(null);
		kirim.addAttribute("jurEdit", jurEdit);
		//untuk edit kode fakultas
		List<FakultasModel> listFakultas = fakRepo.findAll();
		kirim.addAttribute("listFakultas", listFakultas);
		return "jurusan/edit";

	}

	@RequestMapping(value = "/jurusan/hapus/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		JurusanModel jurEdit = jurRepo.findById(id).orElse(null);
		jurRepo.delete(jurEdit);
		return "redirect:/jurusan/list";
	}
	@RequestMapping(value="/jurusan/datajurusan")
	public String view(Model kirim){
		List<JurusanModel> jurList = jurRepo.findAll();
		kirim.addAttribute("jurList", jurList);
		return "jurusan/datajurusan";
	}
}
