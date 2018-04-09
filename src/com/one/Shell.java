package com.one;

/**
 * 希尔排序
 * @author lys
 *
 */
public class Shell extends Example{
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a){
		//将a按升序排列
		int N = a.length;
		int h = 1;
		while (h < N/3) h = 3*h + 1; //1, 4, 13, 40, 121, 364, ......
		while (h >= 1){
			//将数组变为h有序
			for (int i = h; i < N; i++) {
				//将a[i]插入到a[i-h], a[i-2*h], a[i-3*h]...之中
				for (int j = i; j>=h && less(a[j], a[j-h]); j-=h) {
					exch(a, j, j-h);
				}
			}
			h = h/3;
		}
	}
	
}
