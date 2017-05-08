package com.yida.wx.count.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yida.wx.count.bean.Msg;
import com.yida.wx.count.bean.User;
import com.yida.wx.count.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping("/showUser")
	public Msg toIndex(@RequestParam(value ="userId", defaultValue = "1")Integer userId){
		User user = this.userService.getUserById(userId);
		return Msg.success().add("date", user);
	}
	
	
	/*@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}*/
}
