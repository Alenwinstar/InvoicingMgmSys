package ims.dao;

import java.util.List;

import ims.entity.Customer;
import ims.entity.Order;

public interface OrderDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Order> getAllData();
	public Order getSpecialData(String orderId);
}
