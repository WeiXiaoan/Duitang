package com.duitang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class NumUtils {
	
	public List<Integer> handle(String numInput){
		List<Integer> list = new ArrayList<Integer>();	//���ڴ洢�õ�����
		String[] num = numInput.split(",");	//�ö��ŷָ����õ����ַ���
		for(int i = 0; i < num.length ; i++){
			list.add(Integer.parseInt(num[i]));	//���ַ�תΪ�������洢��list
		}
		//�����㷨�����ؽ��
		return figure(list);
	}
	
	
	private List<Integer> figure(List<Integer> list){
		
		int[] left = new int[list.size()];	//���ڴ洢һ����������������ĳ˻�
		int[] right = new int[list.size()];	//���ڴ洢һ�������ұ��������ĳ˻�
		List<Integer> resultList = new ArrayList<Integer>();	//���ڴ洢���صĽ��
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
