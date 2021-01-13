package ims.dao;

import java.util.List;

import ims.entity.Category;

public interface CategoryDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Category> getAllData();
	public Category getSpecialData(String CategoryId);
}
