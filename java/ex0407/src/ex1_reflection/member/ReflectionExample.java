package ex1_reflection.member;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ReflectionExample {
	public static void main(String[] args) {
		Class clazz = Car.class;
		
		// getDeclaredConstructors() : 생성자 정보 읽기
		// Constructor : 클래스의 생성자 정보를 담고 있는 클래스
		System.out.println("[생성자 정보]");
		Constructor[] cons = clazz.getDeclaredConstructors();
		// System.out.println(Arrays.toString(cons));
		
		// c.getParameterTypes() : 매개변수의 타입 반환
		for (Constructor c : cons) {
			System.out.print(c.getName()+"(");
			Class[] parameters = c.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		} // for ed
		
	} // main ed
	
	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length-1)) System.out.print(",");
		}
	}
}
