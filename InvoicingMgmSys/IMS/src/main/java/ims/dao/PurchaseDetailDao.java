package ims.dao;

import java.util.List;

import ims.entity.Purchase;
import ims.entity.Purchase_detail;

public interface PurchaseDetailDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Purchase_detail> getAllData();
	public Purchase_detail getSpecialData(String purchaseDetailId);
}
