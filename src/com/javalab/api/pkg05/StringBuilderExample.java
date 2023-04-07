package com.javalab.api.pkg05;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder = 내부 buffer = 메모리 번지수 안바뀜 = 수정이 많을때
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		sb.append(" Ha Ha");
		System.out.println(sb); // prints "Hello World Ha Ha"
		System.out.println();
		
		// String 차이점 = 메모리 번지수 바뀜 = 수정 적을때
		String data = "ABC";
		data += "def";
		System.out.println(data); // ABCdef

	}

}
