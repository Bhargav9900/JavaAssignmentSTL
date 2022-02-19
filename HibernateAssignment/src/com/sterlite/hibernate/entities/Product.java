/*
 * @author bhargav.bechara@stltech.in
 * @date 18-02-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description hibernate pojo class for Product entity
 */

package com.sterlite.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Id
	@Column(name = "ID")
	private int pid;
	
	@Column(name = "NAME")
	private String pname;
	
	private String brand;
	private float price;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
