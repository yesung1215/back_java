package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask5 {

	public static void main(String[] args) {
		
		ArrayList<Member> members = new ArrayList<Member>();
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		Member member7 = new Member("배승원", "개발_놀기", "자바가 제일 쉬웠어요^^");
		
		Member[] memberArray = new Member[] {member1, member2, member3, member4, member5, member6, member7};
		members.addAll(Arrays.asList(memberArray)); // ArrayList에 memberArray에 담긴 배열 모두 추가
		
//		7) 취미가 2개인 사람의 취미들만 모아서 ArrayList로 변경하기
//		ex) [스포츠댄스, 개발, 골프, 야구, 개발, 놀기]
		
		String[] hobbies = members
			.stream()
			.filter(mem -> mem.getHobby().split("_").length == 2)
			.map(mem -> mem.getHobby())
			.collect(Collectors.joining("_"))
			.split("_");
		
		ArrayList<String> hobbiesList = new ArrayList<String>(Arrays.asList(hobbies));
		System.out.println(hobbiesList);
		
		List<String> hobbiesList3 = Arrays
				.stream(hobbies)
				.collect(Collectors.toList());
		
		System.out.println(hobbiesList3);
	}
}
