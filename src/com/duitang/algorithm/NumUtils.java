package com.duitang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class NumUtils {
	
	public List<Integer> handle(String numInput){
		List<Integer> list = new ArrayList<Integer>();	//用于存储得到的数
		String[] num = numInput.split(",");	//用逗号分割所得到的字符串
		for(int i = 0; i < num.length ; i++){
			list.add(Integer.parseInt(num[i]));	//将字符转为整数并存储进list
		}
		//调用算法，返回结果
		return figure(list);
	}
	
	
	private List<Integer> figure(List<Integer> list){
		
		int[] left = new int[list.size()];	//用于存储一个数的左边所有数的乘积
		int[] right = new int[list.size()];	//用于存储一个数的右边所有数的乘积
		List<Integer> resultList = new ArrayList<Integer>();	//用于存储返回的结果
		left[0] = 1 ;
		right[list.size()-1] = 1 ;
		for(int i = 1 ; i < list.size() ; i++){
			left[i] = left[i-1] * list.get(i-1);	
		}
		
		for(int i = list.size()-2 ; i >= 0 ;i--){
			right[i] = right[i+1] * list.get(i+1);
		}
		
		for(int i = 0 ; i < list.size() ; i++){
			resultList.add(i, left[i] * right[i]);	
		}
		
		return resultList;
	}
	
	
}
