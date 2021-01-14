package ims.dao;

import java.util.List;

import ims.entity.Program;
import ims.entity.Purchase;

public interface PurchaseDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Purchase> getAllData();
	public Purchase getSpecialData(String purchaseId);
}
