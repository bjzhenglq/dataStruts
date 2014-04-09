package com.sunshine.sort;

/**
 * ��������
 * 
 * ����˼�룺ѡ��һ����׼Ԫ��,ͨ��ѡ���һ��Ԫ�ػ������һ��Ԫ��,ͨ��һ��ɨ�裬���������зֳ�������,һ���ֱȻ�׼Ԫ��С,һ���ִ��ڵ��ڻ�׼Ԫ��,
 * ��ʱ��׼Ԫ�������ź�������ȷλ��,Ȼ������ͬ���ķ����ݹ�����򻮷ֵ�������
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
		// ����ĵ�һ����Ϊ����
		int tmp = list[low];
		while (low < high) {
			while (low < high && list[high] >= tmp) {

				high--;
			}
			// ������С�ļ�¼�Ƶ��Ͷ�
			list[low] = list[high];
			while (low < high && list[low] <= tmp) {
				low++;
			}
			// �������ļ�¼�Ƶ��߶�
			list[high] = list[low];
		}
		// �����¼��β
		list[low] = tmp;
		// ���������λ��
		return low;
	}

	public void _quickSort(int[] list, int low, int high) {
		// ��list�������һ��Ϊ��
		if (low < high) {
			int middle = getMiddle(list, low, high);
			// �Ե��ֱ���еݹ�����
			_quickSort(list, low, middle - 1);
			// �Ը��ֱ���еݹ�����
			_quickSort(list, middle + 1, high);
		}
	}

	public void quick(int[] a2) {
		// �鿴�����Ƿ�Ϊ��
		if (a2.length > 0) {
			_quickSort(a2, 0, a2.length - 1);
		}
	}

	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		sort.sort(arr);
	}

}
