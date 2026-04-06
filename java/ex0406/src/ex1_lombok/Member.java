package ex1_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 어노테이션
// 자바코드에 붙이는 표식
// 컴파일러에게 "이 코드에는 어떤 의미가 있다"라고 알려주는 표식
//@Setter @Getter 
@AllArgsConstructor // @NoArgsConstructor 
@RequiredArgsConstructor 
// final 또는 @NonNull이 붙은 필드만 매개변수로 갖는 생성자
//@ToString
@Data // 게터,세터, 투스트링 등 다 있는 어노테이션
public class Member {
	private String id;
	private String name;
	private int age;
	
}
