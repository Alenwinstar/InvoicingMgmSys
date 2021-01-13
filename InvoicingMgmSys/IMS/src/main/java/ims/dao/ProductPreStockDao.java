package ims.dao;

import java.util.List;

import ims.entity.Product_pre_stock;

public interface ProductPreStockDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Product_pre_stock> getAllData();
	public Product_pre_stock getSpecialData(String productPreStockId);
}
