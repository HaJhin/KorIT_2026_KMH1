package ex3_generic;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		GenericExample<Integer> data = new GenericExample<Integer>();
		data.addArr2(1);
		data.addArr2(2);
		data.addArr2(3);
		
		int sum = 0;
		for (int i = 0; i < data.sizeArr2(); i++) {
			sum += data.getArr(i);
		}
		System.out.println(sum);
		
		// 실수타입 객체를 만들고 데이터 3개를 넣은 후 출력
		GenericExample<Double> doubleData = new GenericExample<Double>();
		doubleData.addArr2(3.14);
		doubleData.addArr2(1.0);
		doubleData.addArr2(1.23);
		for (int i = 0; i < doubleData.sizeArr2(); i++) {
			System.out.println(doubleData.getArr(i));
		}
		
		/*
		dataList2.addArr2(true);
		System.out.println(dataList2.getArr(0));
		dataList2.sizeArr2();
		System.out.println(dataList2.sizeArr2());
		
		
		dataList2.addArr2("안녕하세요");
		System.out.println(dataList2.getArr(1));
		dataList2.sizeArr2();
		System.out.println(dataList2.sizeArr2());
		
		dataList2.addArr2(13);
		System.out.println(dataList2.getArr(1));
		dataList2.sizeArr2();
		System.out.println(dataList2.toString());
		*/
		/*
		for (int i = 0; i < dataList.sizeArr2(); i++ ) {
			Object data = dataList.getArr(i);
			if (data instanceof Integer) {
				System.out.println("정수 : " + (int)data);
			} else if (data instanceof Double) {
				System.out.println("실수 : " + (double)data);
			} else if (data instanceof String) {
				System.out.println("문자열 : " + (String)data);
			} else System.out.println("그 외 : " + data);
		} */
		
		// System.out.println(dataList2.toString());
	}
}
