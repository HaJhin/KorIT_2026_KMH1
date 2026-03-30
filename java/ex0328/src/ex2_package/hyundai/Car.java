package ex2_package.hyundai;

// import의 역할
// 긴 이름을 줄여서 쓰기 위한 문법

import ex2_package.hankook.SnowTire;
import ex2_package.kumho.AllSeasonTire;

public class Car {
	// 타이어가 필요해!
	
	// 클래스의 전체 경로를 쓴 경우에는 import문이 필요없다.
	ex2_package.hankook.Tire tire1 = new ex2_package.hankook.Tire();
	ex2_package.kumho.Tire tire2 = new ex2_package.kumho.Tire();
	
	// import문을 써주면 경로를 작성하지 않아도 오류가 나지 않는다.
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
}