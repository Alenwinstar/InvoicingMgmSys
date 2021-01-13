package ims.dao;

import java.util.List;

import ims.entity.Pre_order_detail;

public interface PreOrderDetailDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Pre_order_detail> getAllData();
	public Pre_order_detail getSpecialData(String preOrderDetailId);
}
