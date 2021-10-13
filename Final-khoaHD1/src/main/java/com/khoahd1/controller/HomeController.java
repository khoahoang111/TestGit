package com.khoahd1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.khoahd1.entity.Form1Entity;
import com.khoahd1.entity.Form2Entity;

import com.khoahd1.service.Form1Service;
import com.khoahd1.service.Form2Service;

@Controller
public class HomeController {
	
	@Autowired
	private Form1Service form1Service;

	
	@Autowired
	private Form2Service form2Service;
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	@RequestMapping(value = {"/", "/home"})
	public String showHome(ModelMap model) {
		model.addAttribute("form2", form2Service.getAllForm2());
		return "home";
	}
	
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	@RequestMapping(value = {"/add"}, method = RequestMethod.GET)
	public String showFormADD(ModelMap model) {
//		model.addAttribute("hinhthuc", loaiSanService.getLoaiSan());
		model.addAttribute("dangKy", new Form2Entity());
		return "form-add";
	}
	
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	@RequestMapping(value = {"/add"}, method = RequestMethod.POST)
	public String add(ModelMap model,
			@RequestParam("form1Entity.id") int id,
			@ModelAttribute("dangKy") @Valid Form2Entity form2Entity,
			BindingResult bindingResult) {
		
		

		 if (bindingResult.hasErrors() ) {
				return "form-add";
		}
//
		System.out.println("sssss:"+id);
		 Form1Entity per = new Form1Entity();
			per = form1Service.getById(id);
		 if (per == null) {
			 model.addAttribute("checkTT","khong co trong he thong");
				return "form-add";
		}

		model.addAttribute("hinhThuc", form1Service.getAllForm1());
		form2Service.save(form2Entity);
		return "redirect:/home";
	}
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String editDangKySan(ModelMap model,
			@PathVariable("id")int id) {	
		model.addAttribute("dangKy", form2Service.getById(id));
		model.addAttribute("hinhThuc", form1Service.getAllForm1());
		return "form-add";
	}
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String update(ModelMap model,
			@ModelAttribute("dangKy") @Valid Form2Entity form2Entity,
			BindingResult bindingResult) {	
		
		 if (bindingResult.hasErrors()) {
				return "form-add";
		}
		
		form2Service.update(form2Entity);
		return "redirect:/home";
	}
	
	
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(ModelMap model,
			@PathVariable("id")int id) {	
		form2Service.delete(id);
		return "redirect:/home";
	}
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	@RequestMapping(value = "/search" , method = RequestMethod.POST)
	public String  search(ModelMap model,
			@RequestParam("tenKH") String tenKH){

		model.addAttribute("form2", form2Service.search(tenKH));
		return "home";
	}
	
	
	
	
	
	
	
	
}
