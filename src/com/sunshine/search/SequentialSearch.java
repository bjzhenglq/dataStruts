package com.sunshine.search;

import java.util.Scanner;

/**
 * ˳�����Ŷ
 * 
 * ����˼�룺 �ӱ��һ�˿�ʼ��˳��ɨ������ν�ɨ�赽�Ľ��ؼ��ֺ͸���ֵ���ٶ�Ϊa����Ƚϣ�����ǰ���ؼ�����a��ȣ�����ҳɹ�����ɨ�������
 * ��δ�ҵ��ؼ��ֵ���a�Ľ�㣬�����ʧ�ܡ�
 * 
 * ˵���˾��ǣ���ͷ��β��һ��һ���رȣ�������ͬ�ľͳɹ����Ҳ�����ʧ�ܡ������Ե�ȱ����ǲ���Ч�ʵ͡�
 * 
 * ���������Ա��˳��洢�ṹ����ʽ�洢�ṹ��
 * 
 * ƽ�����ҳ���=��n+1��/2
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
		System.out.println("������Ҫ��ѯ�����֣�");
		Scanner input = new Scanner(System.in);
		int input1 = input.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == input1) {
				System.out.println(input1 + "��λ��Ϊ��" + i);
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
