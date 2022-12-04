package Pack3.partie2.src.partie2;

public class Element {
	
	private int id;
	public Element(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Element [id=" + id + "]";
		
	}
}
