package exam;

public class Main {
	public static void main(String[] args) {
		TextService ts = new TextService();
		String text = "This product is currently out of stock.";
		
		StringProcessor toUpp = t -> t.toUpperCase();
		
		StringProcessor stockCh = t -> t.replace("out of stock.", "in stock.");
		
		System.out.println(ts.processText(text, toUpp));
		
		System.out.println(ts.processText(text, stockCh));
	}
}
