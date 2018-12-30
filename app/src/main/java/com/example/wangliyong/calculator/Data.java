package com.example.wangliyong.calculator;

public class Data {
	//保存字符串
	String str;
	//f为真时，当前对象的str为数字，否则为操作符
	boolean f;
	Data(){
		this.f=false;
		str="";
	}
}
