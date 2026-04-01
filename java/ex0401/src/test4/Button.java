package test4;

public class Button {
	ClickListener listener;

	public ClickListener getListener() {
		return listener;
	}

	public void setListener(ClickListener listener) {
		this.listener = listener;
	}
	
	void click() {
		listener.onClick();
	}
}
