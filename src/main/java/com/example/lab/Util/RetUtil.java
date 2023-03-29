package com.example.lab.Util;

import com.example.lab.common.Ret;

public class RetUtil {
	public  static final int SUCCESS = 0;
	public static final int FAIL = 1;

	public static Ret<Object> success(){
		return new Ret<>(RetUtil.SUCCESS, "成功", null);
	}
	public static Ret<Object> successWithMsg(String info){
		return new Ret<>(RetUtil.SUCCESS, info, null);
	}

	public static Ret<Object> success(String info, Object data){
		return new Ret<>(RetUtil.SUCCESS, info, data);
	}
	public static Ret<Object> success(Object data){
		return new Ret<>(RetUtil.SUCCESS, "成功", data);
	}
	public static Ret<Object> failure(String msg){
		return new Ret<>(RetUtil.FAIL, msg, null);
	}

}
