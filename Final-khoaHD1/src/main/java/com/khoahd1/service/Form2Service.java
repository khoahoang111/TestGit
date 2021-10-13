package com.khoahd1.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoahd1.entity.Form1Entity;
import com.khoahd1.entity.Form2Entity;
import com.khoahd1.repository.Form2Repository;

@Service
public class Form2Service {
	
	@Autowired
	private Form2Repository form2Repository;
	
	
	@Autowired
	private Form1Service form1Service;
	/**
	 * @author khoa hoang
	 * @return
	 */
	public List<Form2Entity> getAllForm2(){
		return form2Repository.findAll();
	}
	
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	public Form2Entity getById(int id) {
		return form2Repository.findById(id).get();
	}
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	public void save(Form2Entity form2Entity) {
		form2Entity.setNgayDatCoc(new Date());
		Form1Entity form1Entity = form1Service.getById(form2Entity.getForm1Entity().getId());
		float  tienThanhToan = tinhTienThanhToan(form2Entity.getTienDatCoc(), form1Entity, form2Entity.getSoLan());
		form2Entity.setTienThanhToan(tienThanhToan);
		form2Repository.save(form2Entity);
	}
	
	
	
	
	
	
	
	
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	public void update(Form2Entity form2Entity) {
		form2Entity.setNgayDatCoc(new Date());
//		float tienThanhtoan = 0;
		Form1Entity form1Entity = form1Service.getById(form2Entity.getForm1Entity().getId());
		float  tienThanhToan = tinhTienThanhToan(form2Entity.getTienDatCoc(), form1Entity, form2Entity.getSoLan());
		form2Entity.setTienThanhToan(tienThanhToan);
		form2Repository.save(form2Entity);
	}
	
	
	
	
	
	
	
	
	/**
	 * @author khoa hoang
	 * @return
	 */
	public void delete(int id) {
		form2Repository.deleteById(id);
	}
	
	
	public List<Form2Entity> search(String name){
		
		
		return form2Repository.findByTenKHORSoDienthoai(name, name);
	}
	
	
	
	public float tinhTienThanhToan(float tienDatCoc, Form1Entity form1Entity, int sl) {
		
		float tongTienTT = 0;
		float giaSan = form1Entity.getGia();
		 if (sl == 1) {
			tongTienTT = giaSan;
		}else if (sl > 1) {
			tongTienTT = giaSan + (sl -1) + giaSan * 0.7f;
		}
		return tongTienTT - tienDatCoc;
	}
	
}
