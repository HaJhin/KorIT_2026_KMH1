package ex0722.cohension;

import java.util.Iterator;

// 통신적 응집도
// 동일한 입력과 출력을 사용 다른 기능을 수행하는 활동들이 모여 있는 경우

public class SalesReporter {
	public void generateReport(double[] salesData) {
		// 똑같은 매출 데이터를 두 개의 작업에 각각 전달한다.
		
		// 동일한 saleData를 사용해 총 매출액 계산
		double totalRevenue = calculateTotalRevenue(salesData);
		
		// 동일한 salesData를 사용해 세금 계산
		double taxAmount = calculateTax(salesData);
	}
	
	// 배열의 총합 계산
	private double calculateTotalRevenue(double[] salesData) {
		double totalAmount = 0;
		for (double d : salesData) {
			totalAmount += d;
		}
		return totalAmount;
	}

	// 매출별 10% 뗀 금액이 얼만지
	private double calculateTax(double[] salesData) {
		return calculateTotalRevenue(salesData) * 0.1;
	}
}
