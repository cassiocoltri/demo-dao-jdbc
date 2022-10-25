package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Ablubleu");
		
		Seller seller = new Seller(21, "Borsalino", "borsalino@gmail.com", new Date(), 1000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println(obj);
		System.out.println(seller);
		System.out.println(sellerDao);

	}

}
