package ims.dao;

import java.util.List;

import ims.entity.User;
import ims.entity.User_role;

public interface UserRoleDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<User_role> getAllData(String roleId);
	public User_role getSpecialData(String userRoleId);
}
