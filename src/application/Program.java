package application;

import java.sql.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.intities.Department;
import model.intities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
			
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(0), 3000.0, obj);
		
		SellerDao sellerdao = DaoFactory.creatSellerDao();
		
		System.out.println(seller);
	}
}
