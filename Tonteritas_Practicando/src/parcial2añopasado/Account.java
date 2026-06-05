package parcial2añopasado;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String id;
	private String name;
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ArrayList<Member> membership() {
		ArrayList<Member> miembros = new ArrayList<>();
		return miembros;
	}
	public String getId() { 
		return id;
	}
	public String getName() {
		return name;
		}
}
