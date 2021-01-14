package ims.dao;

import java.util.List;

import ims.entity.Role_program;
import ims.entity.Supplier;

public interface SupplierDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Supplier> getAllData();
	public Supplier getSpecialData(String supplierId);
}
