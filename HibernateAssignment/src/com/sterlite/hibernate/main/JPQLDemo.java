package com.sterlite.hibernate.main;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sterlite.hibernate.entities.Product;

public class JPQLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				Configuration cfg = new Configuration();
				Configuration c = cfg.configure();
				SessionFactory sf = c.buildSessionFactory();
				Session ss = sf.openSession();
				
//						//JPQ
//				Query q = ss.createQuery("from Product where pname like 'A%' order by brand");
//				List<Product> pro = q.getResultList();
//				
//				pro.forEach( (ele)->System.out.println(ele));
				
				Query q = ss.createQuery("select p.pname,p.price from Product p");
				List<Object[]> rows = q.getResultList();
				
				for(int i=0;i<rows.size();i++) {
						Object [] row = rows.get(i);
						System.out.println("Name: "+ row[0]+" Price: "+row[1]);
					}
				
				Query q1 = ss.createQuery("select count(*) from Product");
				
				long rowCo = (long)q1.getSingleResult();
				System.out.println(rowCo);
				
				Query q2 = ss.createQuery("select max(p.price) from Product p ");
				
				float ma = (float)q2.getSingleResult();
				System.out.println(ma);
				
				
				ss.close();
	}

}
