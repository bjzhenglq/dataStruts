package com.sunshine.search;

import java.util.Scanner;

/**
 * 顺序查找哦
 * 
 * 基本思想： 从表的一端开始，顺序扫描表，依次将扫描到的结点关键字和给定值（假定为a）相比较，若当前结点关键字与a相等，则查找成功；若扫描结束后，
 * 仍未找到关键字等于a的结点，则查找失败。
 * 
 * 说白了就是，从头到尾，一个一个地比，找着相同的就成功，找不到就失败。很明显的缺点就是查找效率低。
 * 
 * 适用于线性表的顺序存储结构和链式存储结构。
 * 
 * 平均查找长度=（n+1）/2
 * 
 * 
 * @author Administrator
 * 
 */
public class SequentialSearch implements ISearch {

	static int arr[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4,
			62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

	@Override
	public void search(int[] a) {
		System.out.println("请输入要查询的数字：");
		Scanner input = new Scanner(System.in);
		int input1 = input.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == input1) {
				System.out.println(input1 + "的位置为：" + i);
				break;
			}
			if (i == a.length - 1)
				System.out.println("No Result!");
		}

	}

	public static void main(String[] args) {
		ISearch search = new SequentialSearch();
		search.search(arr);
	}
}
