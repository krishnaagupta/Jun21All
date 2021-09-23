package Programs;

public class Q33CircusComparator {
	private int height,weight;

	public Q33CircusComparator(int height,int weight) {
		this.height=height;
		this.weight=weight;
	}
	public  String toString() {
		return "[Height=" + this.height +" , "+ " weight=" + this.weight + "]";

	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
