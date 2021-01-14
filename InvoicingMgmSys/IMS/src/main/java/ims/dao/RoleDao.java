package ims.dao;

import java.util.List;

import ims.entity.Purchase_detail;
import ims.entity.Role;

public interface RoleDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Role> getAllData();
	public Role getSpecialData(String roleId);
}
