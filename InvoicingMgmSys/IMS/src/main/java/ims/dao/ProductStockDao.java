package ims.dao;

import java.util.List;

import ims.entity.Product_stock;

public interface ProductStockDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Product_stock> getAllData();
	public Product_stock getSpecialData(String productStockId);
}
