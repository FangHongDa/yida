package com.yida.wx.count.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回的类
 * 
 * @author lfy
 * 
 */
public class Msg {
	//状态码   100-成功    200-失败
	private int statusCode;
	//提示信息
	private String statusMsg;
	
	

	//用户要返回给浏览器的数据
	private Map<String, Object> data = new HashMap<String, Object>();

	public static Msg success(){
		Msg result = new Msg();
		result.setStatusCode(100);
		result.setStatusMsg("处理成功！");
		return result;
	}
	
	public static Msg fail(){
		Msg result = new Msg();
		result.setStatusCode(200);
		result.setStatusMsg("处理失败！");
		return result;
	}
	
	public Msg add(String key,Object value){
		this.getData().put(key, value);
		return this;
	}
	
	
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMsg() {
		return statusMsg;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	
	
}
