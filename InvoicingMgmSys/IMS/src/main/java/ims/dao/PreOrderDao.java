package ims.dao;

import java.util.List;

import ims.entity.Pre_order;

public interface PreOrderDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Pre_order> getAllData();
	public Pre_order getSpecialData(String preOrderId);
}
