package com.sunshine.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ���ֲ���,�۰����
 * 
 * ��1��ȷ����������е�λ�ã�mid=��low+high��/2 min���������м�Ľ���λ�ã�low��������������λ�ã�high�����������ҽ��λ��
 * ��2��������aֵ����mid�Ĺؼ��֣�������R[mid].key���Ƚϣ�����ȣ�����ҳɹ�������ȷ���µĲ������䣺
 * ���R[mid].key>a�����ɱ�������Կ�֪
 * ��R[mid].key�Ҳ��ֵ������a�����Ե���a�Ĺؼ���������ڣ���Ȼ��R[mid].key��ߵı��С���ʱhigh=mid-1
 * ���R[mid].key<a,�����a�Ĺؼ���������ڣ���Ȼ��R[mid].key�ұߵı��С���ʱlow=mid+1
 * ���R[mid].key=a������ҳɹ���
 * 
 * ��3����һ�β�������µĲ������䣬�ظ����裨1���ͣ�2��
 * 
 * ��4���ڲ��ҹ����У�low�����ӣ�high�𲽼��٣����low>high�������ʧ�ܡ�
 * 
 * ƽ�����ҳ��� :lg(n+1)
 * 
 * @author Administrator
 * 
 */
public class BinarySearch implements ISearch {
	static List<Integer> list = new ArrayList<Integer>();
	static {
		// ��list����������1-10000������ż������Ϊʵ�����飬�����ԣ���������ģ�
		for (int i = 0; i < 100; i += 2) {
			// ���ﵱȻҲ��������
			list.add(i);
		}
	}

	@Override
	public void search(int[] arr) {
		System.out.println("������Ҫ��ѯ�����֣�");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		int low = 0;
		int high = list.size();
		while (low < high) {
			int mid = (low + high) / 2;
			if (key == list.get(mid)) {
				System.out.println("����ֵ��list�е�λ��Ϊ��" + mid);
				break;
			}
			if (key > list.get(mid)) {
				low = mid + 1; // ��С��ʱ����lowָ������ƶ���highָ�벻��
			}
			if (key < list.get(mid)) {
				high = mid - 1; // ������ʱ����highָ����ǰ�ƶ���lowָ�벻��
			}
		}
		if (low >= high) {
			System.out.println("û�в鵽�����");
		}
	}

	/**
	 * �ݹ��㷨ʵ��
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
				System.out.println("����ֵ��list�е�λ��Ϊ��" + mid);
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
			System.out.println("û�в鵽�����");
			return;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		// search.search(null);
		System.out.println("������Ҫ��ѯ�����֣�");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		search.search(0, list.size() - 1, list, key);

	}
}
