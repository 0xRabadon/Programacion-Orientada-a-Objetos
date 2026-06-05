package parcial2añopasado;

public class Message {
	private String id;
	private String text;
	private datetime date;
	private Account creator;
	
	public Message(String id, String text, datetime date, Account creator) {
		this.id = id;
		this.text = text;
		this.date = date;
		this.creator = creator;
	}
	
	public String getId(){
		return id;
	}
	public String getText() {
		return text;
	}
	public datetime getDate() {
		return date;
	}
	public Account getCreator() {
		return creator;
	}
}
