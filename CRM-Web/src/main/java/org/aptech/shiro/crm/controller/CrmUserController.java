package org.aptech.shiro.crm.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.aptech.shiro.crm.dao.CrmUserDao;
import org.aptech.shiro.crm.pojo.CrmUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class CrmUserController {
	@Resource
	private CrmUserDao crmUserDao;

	public void setSysPermissionDao(CrmUserDao crmUserDao) {
		this.crmUserDao = crmUserDao;
	}
	

	
	@RequestMapping("/login")
	public String login() throws Exception {
		return "login";
	}
	
	@RequestMapping("/index")
	public String index() throws Exception {
		return "index";
	}
	
	@RequestMapping(value="/selUser",method=RequestMethod.GET)
	public String selUser() throws Exception{
		return "login";
		
	}
	@RequestMapping(value="/selUser",method=RequestMethod.POST)
	public String selUser( String usname,String uspwd,ModelMap modelMap,HttpSession session) throws Exception{
		CrmUser user = crmUserDao.selUser(usname);
		if (user == null) {
			modelMap.put("error", "账户不存在");
			return "login";
		}
		if (!uspwd.equals(user.getUserPassword())) {
			modelMap.put("error1", "密码不正确");
			return "login";
		}
		session.setAttribute("user",user);
		return "redirect:/index";
	}
	
}






