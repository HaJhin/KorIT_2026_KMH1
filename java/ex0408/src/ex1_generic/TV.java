package ex1_generic;

public class TV implements RemoteControl {

	@Override
	public void control() {
		System.out.println("TV 전원 ON");
	}

}
