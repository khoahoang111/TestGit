package com.khoahd1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Form1Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String khungGio;
	
	private String thoiLuong;
	
	private float gia;
	
	@OneToMany(mappedBy = "form1Entity", cascade = CascadeType.ALL)
	private List<Form2Entity> form2Entities;

	public Form1Entity() {
		super();
	}

	public Form1Entity(int id, String khungGio, String thoiLuong, float gia, List<Form2Entity> form2Entities) {
		super();
		this.id = id;
		this.khungGio = khungGio;
		this.thoiLuong = thoiLuong;
		this.gia = gia;
		this.form2Entities = form2Entities;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the khungGio
	 */
	public String getKhungGio() {
		return khungGio;
	}

	/**
	 * @param khungGio the khungGio to set
	 */
	public void setKhungGio(String khungGio) {
		this.khungGio = khungGio;
	}

	/**
	 * @return the thoiLuong
	 */
	public String getThoiLuong() {
		return thoiLuong;
	}

	/**
	 * @param thoiLuong the thoiLuong to set
	 */
	public void setThoiLuong(String thoiLuong) {
		this.thoiLuong = thoiLuong;
	}

	/**
	 * @return the gia
	 */
	public float getGia() {
		return gia;
	}

	/**
	 * @param gia the gia to set
	 */
	public void setGia(float gia) {
		this.gia = gia;
	}

	/**
	 * @return the form2Entities
	 */
	public List<Form2Entity> getForm2Entities() {
		return form2Entities;
	}

	/**
	 * @param form2Entities the form2Entities to set
	 */
	public void setForm2Entities(List<Form2Entity> form2Entities) {
		this.form2Entities = form2Entities;
	}
	
	
	
}
