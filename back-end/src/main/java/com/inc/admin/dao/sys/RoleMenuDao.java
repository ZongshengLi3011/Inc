package com.inc.admin.dao.sys;

import com.inc.admin.domain.sys.RoleMenuDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleMenuDao {

	RoleMenuDO get(Long id);
	
	List<RoleMenuDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);
	
	int save(RoleMenuDO roleMenu);
	
	int update(RoleMenuDO roleMenu);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	int batchRemoveByMenuIds(@Param("ids") List<Long> ids);

	List<Long> listMenuIdByRoleId(Long roleId);
	
	int removeByRoleId(Long roleId);

	int removeByMenuId(Long menuId);
	
	int batchSave(List<RoleMenuDO> list);
}
