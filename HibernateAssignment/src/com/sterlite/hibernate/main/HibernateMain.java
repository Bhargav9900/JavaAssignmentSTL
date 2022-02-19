/*
 * @author bhargav.bechara@stltech.in
 * @date 18-02-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description hibernate main class
 */

package com.sterlite.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sterlite.hibernate.entities.Product;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create configuration object-step1
		Configuration cfg = new Configuration();
		
		//read hibernate confi from hibernate.cfg.xml - step2
		Configuration c = cfg.configure();
		
		//load all read configuration in sessionfactory and obtain it - step3
		//Bulid SessionFactory using read confi and obtain it
		//heavy weight and singleton object
		SessionFactory sf = c.buildSessionFactory();
		
		// obtain session - Session represents Database connection - step4
		//session provides CURD methods to perform databases
		
		//Session is lightweight and nor single ton
		
		Session ss = sf.openSession();
		
		//step 5 : Obtain Transaction from session
		Transaction tx = ss.beginTransaction();
		
		//step6 perform UPDATE DELETE using ORM
		
			//get row as per primary key in the form of object
		Product p = ss.get(Product.class, 3002);
		
		//Product p = ss.load(Product.class, 3032);
		
		System.out.println(p);
		
			//add a product object as a row in database table
//		Product product = new Product();
//		product.setPid(3067);
//		product.setPname("Phone");
//		product.setBrand("Sony");
//		product.setPrice(45000.78f);//transient state
//		
//		ss.save(product);//after saving product will be in persistance state
//		
//		System.out.println("Added");
		
		Product p1 = ss.get(Product.class, 3067);
		
		System.out.println(p1);
		
			//update existing row using object of persistent class
//		Product pu = ss.get(Product.class, 3067);
//		if(p!=null) {
//			p.setPrice(p.getPrice() + 25000.00f);
//			ss.update(p);
//		}
//		else {
//			System.out.println("sorry record not found");
//		}
//		
		
			//delete
		Product pd = ss.get(Product.class, 3067);
		if(pd!=null) {
			ss.delete(pd);
		}
		else {
			System.out.println("sorry record not found");
		}
		
		
		
		
//		Product p2 = ss.get(Product.class, 3067);
//		System.out.println(p2);
		//step 7: commite transaction
		tx.commit();
		
		//step8 close transaction
		ss.close();
	}

}
