package com.xsis.batch197.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BiodataController {
	@RequestMapping(value="biodata/add")
	public String add () {
		return "biodata/add";
	}
}
