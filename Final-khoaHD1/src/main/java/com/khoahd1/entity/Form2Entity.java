package com.khoahd1.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Form2Entity {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	
	@NotBlank(message = "khong duoc de trong")
	private String tenKH;
	
	@Pattern(regexp = "^[0-9]{10,11}$", message = "Chi nhap 10 hoac 11 chu so")
	private String soDienthoai;
	
	

	private int soLan;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@NotNull(message = "Vui long nhap ngay thue")
	@Future(message = "Ngay thue phai lon hon ngay hien tai")
	private Date ngayBatDau;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
//	@NotNull(message = "Vui long nhap ngay thue")
//	@Future(message = "Ngay thue phai lon hon ngay hien tai")
	private Date ngayKT;
	
	
	
	
	
	private  float tienDatCoc;
	
	
	private  float tienThanhToan;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date ngayDatCoc;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date ngayThanhToan;

	@ManyToOne
	private Form1Entity form1Entity;

	public Form2Entity() {
		super();
	}

	

	public Form2Entity(int id, @NotBlank(message = "khong duoc de trong") String tenKH, String soDienthoai, int soLan,
			Date ngayBatDau, Date ngayKT, float tienDatCoc, float tienThanhToan, Date ngayDatCoc, Date ngayThanhToan,
			Form1Entity form1Entity) {
		super();
		this.id = id;
		this.tenKH = tenKH;
		this.soDienthoai = soDienthoai;
		this.soLan = soLan;
		this.ngayBatDau = ngayBatDau;
		this.ngayKT = ngayKT;
		this.tienDatCoc = tienDatCoc;
		this.tienThanhToan = tienThanhToan;
		this.ngayDatCoc = ngayDatCoc;
		this.ngayThanhToan = ngayThanhToan;
		this.form1Entity = form1Entity;
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
	 * @return the tenKH
	 */
	public String getTenKH() {
		return tenKH;
	}

	/**
	 * @param tenKH the tenKH to set
	 */
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	/**
	 * @return the soDienthoai
	 */
	public String getSoDienthoai() {
		return soDienthoai;
	}

	/**
	 * @param soDienthoai the soDienthoai to set
	 */
	public void setSoDienthoai(String soDienthoai) {
		this.soDienthoai = soDienthoai;
	}

	/**
	 * @return the soLan
	 */
	public int getSoLan() {
		return soLan;
	}

	/**
	 * @param soLan the soLan to set
	 */
	public void setSoLan(int soLan) {
		this.soLan = soLan;
	}

	/**
	 * @return the ngayBatDau
	 */
	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	/**
	 * @param ngayBatDau the ngayBatDau to set
	 */
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	/**
	 * @return the ngayKT
	 */
	public Date getNgayKT() {
		return ngayKT;
	}

	/**
	 * @param ngayKT the ngayKT to set
	 */
	public void setNgayKT(Date ngayKT) {
		this.ngayKT = ngayKT;
	}

	/**
	 * @return the tienDatCoc
	 */
	public float getTienDatCoc() {
		return tienDatCoc;
	}

	/**
	 * @param tienDatCoc the tienDatCoc to set
	 */
	public void setTienDatCoc(float tienDatCoc) {
		this.tienDatCoc = tienDatCoc;
	}

	/**
	 * @return the tienThanhToan
	 */
	public float getTienThanhToan() {
		return tienThanhToan;
	}

	/**
	 * @param tienThanhToan the tienThanhToan to set
	 */
	public void setTienThanhToan(float tienThanhToan) {
		this.tienThanhToan = tienThanhToan;
	}

	/**
	 * @return the ngayDatCoc
	 */
	public Date getNgayDatCoc() {
		return ngayDatCoc;
	}

	/**
	 * @param ngayDatCoc the ngayDatCoc to set
	 */
	public void setNgayDatCoc(Date ngayDatCoc) {
		this.ngayDatCoc = ngayDatCoc;
	}

	/**
	 * @return the ngayThanhToan
	 */
	public Date getNgayThanhToan() {
		return ngayThanhToan;
	}

	/**
	 * @param ngayThanhToan the ngayThanhToan to set
	 */
	public void setNgayThanhToan(Date ngayThanhToan) {
		this.ngayThanhToan = ngayThanhToan;
	}

	/**
	 * @return the form1Entity
	 */
	public Form1Entity getForm1Entity() {
		return form1Entity;
	}

	/**
	 * @param form1Entity the form1Entity to set
	 */
	public void setForm1Entity(Form1Entity form1Entity) {
		this.form1Entity = form1Entity;
	}
	
	

}
