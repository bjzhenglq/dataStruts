package com.sunshine.sort;

/**
 * ��ѡ������
 * 
 * ����˼�룺��Ҫ�����һ�����У�ѡ����С��һ�������һ��λ�õ���������
 * 
 * Ȼ����ʣ�µ�������������С����ڶ���λ�õ������������ѭ���������ڶ����������һ�����Ƚ�Ϊֹ��
 * 
 * @author Administrator
 * 
 */
public class SimpleSelectSort {

	static int a[] = { 1, 54, 6, 3, 78, 34, 12, 45 };

	public void sort(int[] arr) {
		int position = 0;
		for (int i = 0; i < a.length; i++) {
			int j = i + 1;
			position = i;
			int temp = a[i];
			for (; j < arr.length; j++) {
				if (a[j] < temp) {
					temp = a[j];
					position = j;
				}
			}
			a[position] = a[i];
			a[i] = temp;
		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

	}

	public static void main(String[] args) {
		SimpleSelectSort sort = new SimpleSelectSort();
		sort.sort(a);
	}

}
