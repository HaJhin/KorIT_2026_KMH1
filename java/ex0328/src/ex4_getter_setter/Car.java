package ex4_getter_setter;

public class Car {
	// private로 선언된 필드는 외부에서 접근 불가능
	private int speed;
	private boolean stop;
	
	
	public void setSpeed(int speed) {
		if (speed < 0) {this.speed = 0; return;} 
		else this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	public boolean isStop() {
		return this.stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
