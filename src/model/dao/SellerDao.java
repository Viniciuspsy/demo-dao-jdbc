package model.dao;

import java.util.List;

import model.intities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteDyId(Seller id);
	Seller findById(Integer id);
	List<Seller > findAll();
}
