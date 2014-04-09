package com.sunshine.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 二分查找,折半查找
 * 
 * （1）确定该区间的中点位置：mid=（low+high）/2 min代表区间中间的结点的位置，low代表区间最左结点位置，high代表区间最右结点位置
 * （2）将待查a值与结点mid的关键字（下面用R[mid].key）比较，若相等，则查找成功，否则确定新的查找区间：
 * 如果R[mid].key>a，则由表的有序性可知
 * ，R[mid].key右侧的值都大于a，所以等于a的关键字如果存在，必然在R[mid].key左边的表中。这时high=mid-1
 * 如果R[mid].key<a,则等于a的关键字如果存在，必然在R[mid].key右边的表中。这时low=mid+1
 * 如果R[mid].key=a，则查找成功。
 * 
 * （3）下一次查找针对新的查找区间，重复步骤（1）和（2）
 * 
 * （4）在查找过程中，low逐步增加，high逐步减少，如果low>high，则查找失败。
 * 
 * 平均查找长度 :lg(n+1)
 * 
 * @author Administrator
 * 
 */
public class BinarySearch implements ISearch {
	static List<Integer> list = new ArrayList<Integer>();
	static {
		// 往list加入逐渐增大1-10000的所有偶数，作为实验数组，很明显，他是有序的！
		for (int i = 0; i < 100; i += 2) {
			// 这里当然也可用数组
			list.add(i);
		}
	}

	@Override
	public void search(int[] arr) {
		System.out.println("请输入要查询的数字：");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		int low = 0;
		int high = list.size();
		while (low < high) {
			int mid = (low + high) / 2;
			if (key == list.get(mid)) {
				System.out.println("此数值在list中的位置为：" + mid);
				break;
			}
			if (key > list.get(mid)) {
				low = mid + 1; // 当小于时，是low指针向后移动，high指针不变
			}
			if (key < list.get(mid)) {
				high = mid - 1; // 当大于时，是high指针向前移动，low指针不变
			}
		}
		if (low >= high) {
			System.out.println("没有查到结果！");
		}
	}

	/**
	 * 递归算法实现
	 * 
	 * @param low
	 * @param high
	 * @param list
	 * @param key
	 */
	public void search(int low, int high, List<Integer> list, int key) {
		while (low <= high) {
			int mid = (low + high) / 2;
			int temp = list.get(mid);
			if (key == temp) {
				System.out.println("此数值在list中的位置为：" + mid);
				break;
			} else {
				if (temp > key) {
					high = --mid;
				} else {
					low = ++mid;
				}
				search(low, high, list, key);
			}
		}
		if (low > high) {
			System.out.println("没有查到结果！");
			return;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		// search.search(null);
		System.out.println("请输入要查询的数字：");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		search.search(0, list.size() - 1, list, key);

	}
}
