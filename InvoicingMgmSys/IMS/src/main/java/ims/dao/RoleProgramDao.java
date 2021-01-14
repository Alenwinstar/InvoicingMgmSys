package ims.dao;

import java.util.List;

import ims.entity.Role;
import ims.entity.Role_program;

public interface RoleProgramDao {

	// 新增
	// 刪除
	// 修改
	// 查詢
	public List<Role_program> getAllData();
	public Role_program getSpecialData(String roleProgramId);
}
