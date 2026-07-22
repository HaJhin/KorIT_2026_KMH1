package ex0722.coupling;

// 하나의 전역 변수를 공유하고 직접 수정하는 형태
public class CommonCouplingExample {
	
	// 전역으로 공유되는 상태 정보
	static class Globalstate{
		public static int globalDiscountRate = 10;
	}
	
	// 할인률 변경 모듈
	static class ModuleA{
		public void updateDiscount() {
			Globalstate.globalDiscountRate = 20;
			
		}
	}
	
	// 가격 계산 모듈
	static class ModuleB{
		public void printPrice(int price) {
			int finalPrice = price - Globalstate.globalDiscountRate;
			System.out.println("적용된 할인율 후 가격 : " + finalPrice);
		}
	}
}
