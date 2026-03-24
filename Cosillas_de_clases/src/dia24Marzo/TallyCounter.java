package dia24Marzo;

public class TallyCounter {
	private int value;
	public void click() {
		value++;
	}
	public void reset() {
		value = 0;
	}
	public int getValue() {
		return value;
	}
	public TallyCounter() {
		value = 0;
	}
}
