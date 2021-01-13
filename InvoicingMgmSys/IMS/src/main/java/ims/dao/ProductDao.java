package ims.dao;

import java.util.List;

import ims.entity.Product;

public interface ProductDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Product> getAllData();
	public Product getSpecialData(String productId);
}
