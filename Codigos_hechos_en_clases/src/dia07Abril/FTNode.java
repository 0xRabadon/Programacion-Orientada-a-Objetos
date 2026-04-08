package dia07Abril;

import java.util.List;
import java.util.ArrayList;

public class FTNode {
	private String name;
	private ArrayList<FTNode> children;
	
	public FTNode(String name) {
		this.name = name;
		this.children = new ArrayList<FTNode>();
	}
	
	public void addChild(FTNode child) {
		this.children.add(child);
	}
	public int countDescendants() {
		int hijos = 0;
		for (FTNode c : children) {
			hijos++;
		}
		return hijos;
	}
	public FTNode findDescendant(String name) {
//		for (FTNode c : children) {
//			if (children[c] == name) {
//			}
//		}
		return;
	}
	public String toString() {
		return "no";
	}
	
	public String getName() {
		return name;
	}
	public FTNode getChildren() {
		return 
	}
	public void setName(String nombre) {
		this.name = nombre;
	}
	public void setChildren(FTNode hijo) {
		this.children =
	}
}
