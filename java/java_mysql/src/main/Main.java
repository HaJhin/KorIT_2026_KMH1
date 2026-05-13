package main;

import dao.MemberDao;
import dto.MemberDTO;

public class Main {
	public static void main(String[] args) {
		// member 테이블의 모든 내용 조회
		MemberDao dao = new MemberDao();
		
		// dao.findAll();
		
		// dao.insertMember(new MemberDTO("장길산", "jang@test.com", 40));
		
		// dao.updateMember(new MemberDTO(1, 50));
		
		dao.deleteMember(new MemberDTO(4));
	}
}
