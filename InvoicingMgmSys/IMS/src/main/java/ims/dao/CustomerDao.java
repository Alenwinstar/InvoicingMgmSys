package ims.dao;

import java.util.List;

import ims.entity.Customer;

public interface CustomerDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Customer> getAllData();
	public Customer getSpecialData(String customerId);
}
