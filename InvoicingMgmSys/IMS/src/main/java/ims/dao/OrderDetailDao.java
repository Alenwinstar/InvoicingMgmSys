package ims.dao;

import java.util.List;

import ims.entity.Order_detail;


public interface OrderDetailDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Order_detail> getAllData();
	public Order_detail getSpecialData(String orderDetailId);
}
