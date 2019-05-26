package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.FakultasModel;
import com.xsis.batch197.repository.FakultasRepo;
@Controller
public class FakultasController {
	@Autowired
	private FakultasRepo fakRepo;

	@RequestMapping(value = "/fakultas")
	public String fakultas() {
		return "fakultas/fakultas";
	}

	@RequestMapping(value = "/fakultas/save")
	public String save(@ModelAttribute FakultasModel fakultas) {
		fakRepo.save(fakultas);
		return "redirect:/fakultas/list";
	}

	@RequestMapping(value = "/fakultas/list")
	public String list(Model kirim) {
		// object fakultasList bertipe data list
		List<FakultasModel> fakultasList = fakRepo.findAll();
		kirim.addAttribute("fakultasList", fakultasList);
		return "fakultas/list";
	}

	@RequestMapping(value = "/fakultas/edit/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		FakultasModel fakEdit = fakRepo.findById(id).orElse(null);
		kirim.addAttribute("fakEdit", fakEdit);
		return "fakultas/edit";
	}

	@RequestMapping(value = "/fakultas/hapus/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		FakultasModel fakEdit = fakRepo.findById(id).orElse(null);
		fakRepo.delete(fakEdit);
		return "redirect:/fakultas/list";
	}
	@RequestMapping(value="/fakultas/datafakultas")
	public String view(Model kirim){
		List<FakultasModel> fakultasList = fakRepo.findAll();
		kirim.addAttribute("fakultasList", fakultasList);
		return "fakultas/datafakultas";
	}
}
