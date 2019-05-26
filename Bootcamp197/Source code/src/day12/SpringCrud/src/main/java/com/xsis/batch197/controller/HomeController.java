package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.FakultasModel;

@Controller
public class HomeController {
	@RequestMapping(value = "/home/index") // url
	public String jurusan(Model fakultas) {
		return "/home/index"; // file fisik
	}
}