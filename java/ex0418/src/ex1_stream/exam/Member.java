package ex1_stream.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Member {
	int id;
	String name;
	String status;
	public Member(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return String.format("Member{id=%d, name=%s, status=%s}\n",id,name,status);
	}
}
