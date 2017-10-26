package cn.test;

import static org.hamcrest.CoreMatchers.instanceOf;

//类比C语言的指针再次进行引用传递的理解
public class Test0905 {
	public static void main(String[] args) {
//		int i = 9;
		String i = "hello";
//		String[] i = new String[]{"hello","world","name"};
		
		f(i);
		System.out.println(i);
//		print(i);
	}
	
	public static void f(int i){
		i = 100;
	}
	
	public static void f(String i){
		i = "123";
	}
	
	public static void f(String[] i){
		for(int x=0;x<i.length;x++){
			i[x] = "123";           //地址的传递,对堆内存进行了操作,即原来变量所指的堆内存的内容发生了变化
		}
		
	}
	
	public static void print(String[] arr){
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]+",");
		}
		System.out.println();
	}
}
