package ex1_generic;

public class Audio implements RemoteControl {

	@Override
	public void control() {
		System.out.println("Audio 전원 ON");
	}

}
