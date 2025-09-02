package collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
//		.add(값)
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(40);
		datas.add(80);
		datas.add(90);
		System.out.println(datas.size());
		System.out.println(datas);
		try {
			System.out.println(datas.get(0));
		} catch(IndexOutOfBoundsException e) {
			System.out.println("올바른 인덱스 범위 쓰시오");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		실습
//		추가(삽입)
//		50뒤에 500을 삽입
		Collections.shuffle(datas);
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);
		}
		System.out.println(datas);
		
//		try {
//			datas.add(-1, 500);
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("올바른 인덱스 범위 입력하시오!");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(datas);
//		수정
//		90을 9로 수정
		int prev = 0;
		try {
			if(datas.contains(90)) {
				prev = datas.set(datas.indexOf(90), 9);
				System.out.println("수정 완료");
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("올바른 인덱스 범위 입력!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(datas);
//		datas.set(5, 9);
//		System.out.println(datas);
//		삭제
//		80을 삭제
//		1. 인덱스 삭제
//		datas.remove(6);
//		System.out.println(datas);
//		if(datas.contains(80)) {
//			datas.remove(datas.indexOf(80));
//		}
//		System.out.println(datas);
		
//		2. 값으로 삭제
		if(datas.contains(80)) {
//			정수 -> 정수
//			Wrapper Class
			datas.remove(Integer.valueOf(80));
		}
		System.err.println(datas);
		
		
	}
}
