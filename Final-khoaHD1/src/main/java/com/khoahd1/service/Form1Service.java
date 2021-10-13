package com.khoahd1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoahd1.entity.Form1Entity;

import com.khoahd1.repository.Form1Repository;

@Service
public class Form1Service {
		
		@Autowired
		private Form1Repository form1Repository;
		
		/**
		 * @author khoa hoang
		 * @return
		 */
		public List<Form1Entity> getAllForm1(){
			return form1Repository.findAll();
		}
		
		
		/**
		 * @author khoa hoang
		 * @return
		 */
		public Form1Entity getById(int id) {
			Optional<Form1Entity> member = form1Repository.findById(id);
			return member.isPresent()?member.get():null;
		}
		
		/**
		 * @author khoa hoang
		 * @return
		 */
		public void save(Form1Entity form1Entity) {
			form1Repository.save(form1Entity);
		}
		
		/**
		 * @author khoa hoang
		 * @return
		 */
		public void update(Form1Entity form1Entity) {
			form1Repository.save(form1Entity);
		}
		
		
		/**
		 * @author khoa hoang
		 * @return
		 */
		public void delete(int id) {
			form1Repository.deleteById(id);
		}
	
}
