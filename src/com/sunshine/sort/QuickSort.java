package com.sunshine.sort;

/**
 * 快速排序
 * 
 * 基本思想：选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,
 * 此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分
 * 
 * @author Administrator
 * 
 */
public class QuickSort {

	static int arr[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4,
			62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

	public void sort(int[] a) {

		quick(a);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public int getMiddle(int[] list, int low, int high) {
		// 数组的第一个作为中轴
		int tmp = list[low];
		while (low < high) {
			while (low < high && list[high] >= tmp) {

				high--;
			}
			// 比中轴小的记录移到低端
			list[low] = list[high];
			while (low < high && list[low] <= tmp) {
				low++;
			}
			// 比中轴大的记录移到高端
			list[high] = list[low];
		}
		// 中轴记录到尾
		list[low] = tmp;
		// 返回中轴的位置
		return low;
	}

	public void _quickSort(int[] list, int low, int high) {
		// 将list数组进行一分为二
		if (low < high) {
			int middle = getMiddle(list, low, high);
			// 对低字表进行递归排序
			_quickSort(list, low, middle - 1);
			// 对高字表进行递归排序
			_quickSort(list, middle + 1, high);
		}
	}

	public void quick(int[] a2) {
		// 查看数组是否为空
		if (a2.length > 0) {
			_quickSort(a2, 0, a2.length - 1);
		}
	}

	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		sort.sort(arr);
	}

}
