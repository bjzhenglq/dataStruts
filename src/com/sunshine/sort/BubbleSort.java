package com.sunshine.sort;

/**
 * ð������
 * 
 * ����˼�룺��Ҫ�����һ�����У��Ե�ǰ��δ�ź���ķ�Χ�ڵ�ȫ���������϶��¶����ڵ����������ν��бȽϺ͵������ýϴ�������³�����С������ð������
 * ÿ�������ڵ����ȽϺ������ǵ�����������Ҫ���෴ʱ���ͽ����ǻ�����
 * 
 * @author Administrator
 * 
 */
public class BubbleSort {

	static int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4,
			62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

	public void sort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		sort.sort(a);
	}

}
