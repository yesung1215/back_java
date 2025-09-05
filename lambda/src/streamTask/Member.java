package streamTask;

import java.util.Objects;

// 필드: 이름, 취미, 소개
// 4분

public class Member {
	private long id;
	private String name;
	private String hobby;
	private String introduction;
	private static Long seq;
	
//	최초 1번
	static {
		seq = 0L;
	}
	
//	생성자가 호출될 떄 마다
	{
		this.id = seq++;
	}
	
	public Member() {;}
	public Member(String name, String hobby, String introduction) {
		this.name = name;
		this.hobby = hobby;
		this.introduction = introduction;
	}
	
	long getId() {
		return id;
	}
	void setId(long id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getHobby() {
		return hobby;
	}
	void setHobby(String hobby) {
		this.hobby = hobby;
	}
	String getIntroduction() {
		return introduction;
	}
	void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", hobby=" + hobby + ", introdution=" + introduction + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return id == other.id;
	}
	
}
