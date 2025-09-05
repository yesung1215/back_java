package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SteramTask4 {
	
	public void introduce(Member member) {
		String intro = "이름: " + member.getName() + "\n취미: " + member.getHobby() + "\n소개: " + member.getIntroduction();
		System.out.println(intro);
	}
	
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
//		for(Member member : memberArray) {
//			members.add(member);
//		}
		
//		System.out.println(members);
		
//		1) 각 Member의 취미를 검토하시오.
//		취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를 모두 출력하시오.
		
//		members
//			.stream()
//			.filter((member) -> member.getHobby().contains("개발"))
//			.forEach((develMember) -> {System.out.println(develMember);});
		
//		2) 각 Member의 취미를 검토하시오.
//		취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를
//		개발자 OOO(이름)으로 변경 후 모두 출력하시오.
		
//		members
//			.stream()
//			.filter((member) -> member.getHobby().contains("개발"))
//			.map((member) -> "개발자 " + member.getName())
//			.forEach(System.out::println);
		
//		3) 취미를 3개 이상 가진 사람의 id를 출력
		members
			.stream()
			.filter(user -> user.getHobby().split("_").length >= 3)
			.forEach(user -> {System.out.println(user.getId());});
			
		
//		4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds 변수에 담기
//		hobbyIds를 출력
		ArrayList<Long> hobbyIds = members
			.stream()
			.filter(user -> user.getHobby().split("_").length >= 3)
			.map(user -> user.getId())
			.collect(Collectors.toCollection(ArrayList::new)); // 람다 못받고 참조변수만 받을 수 있음
		
//		System.out.println(hobbyIds); 
		System.out.println(members); 
		
//		5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기
//		hobbyIds
//			.stream()
//			.mapToInt(Long::intValue)
//			.boxed() // 래핑
//			.map(i -> members.get(i))
//			.map(u -> u.getIntroduction())
//			.forEach(System.out::println);
		
//		6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
		
		int max = members
			.stream()
			.map(mem -> mem.getIntroduction().length())
			.mapToInt(Integer::intValue)
			.max()
			.orElse(0); 
			
//		members
//			.stream()
//			.filter(member -> member.getIntroduction().length() == max)
//			.map(m -> "이름: " + m.getName() + "\n취미: " + m.getHobby() + "\n소개: " + m.getIntroduction())
//			.forEach(System.out::println);
		
		Member member = members
				.stream()
				.max(Comparator.comparingInt(m -> m.getIntroduction().length()))
				.get(); 
		
		SteramTask4 st4 = new SteramTask4();
		st4.introduce(member);
		
		
		
		
	}	
}
