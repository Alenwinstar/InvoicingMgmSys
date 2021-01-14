package ims.dao;

import java.util.List;

import ims.entity.Program;
import ims.entity.Supplier;
import ims.entity.User;

public interface UserDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public User getSpecialData(String userId); // 查詢帳號用
	public List<Program> getUsefulProgram(String userId);// 該user可使用的program
}
