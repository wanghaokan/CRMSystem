package org.aptech.shiro.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.aptech.shiro.crm.pojo.CrmUser;

public interface CrmUserDao extends CommonDao<CrmUser, Integer>{
	/**
	 * 根据登录用户的编号查询对应的权限信息
	 * @param userId
	 * @param type
	 * @return
	 */
	public List<CrmUser> getByUserId(@Param("userId") Integer userId,@Param("type") String type);
	
	public List<String> getCRMCodeByUserId(Integer userId);
	
	public CrmUser selUser(String user);
}
