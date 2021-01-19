package ims.dao;

import java.util.List;

import ims.entity.Product_stock;
import ims.entity.Program;

public interface ProgramDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Program> getAllData(List<String> roleIdList);
	public Program getSpecialData(String programId);
}
