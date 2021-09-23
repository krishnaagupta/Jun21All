package Programs;
// here the class is implementening comparable interface and overideing the compaareto mentood.
/*this is the base class not consumption here when we use this interface we are giving pwer to 
the class itslf to decide the way sorting should happen

1) implement comparaable interface in base class and override compareto metood in base class
2) in comsu,ption class call collection .sort */


public class Q33CircusComparable implements Comparable {
	private int height,weight;

	public Q33CircusComparable(int height,int weight) {
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

	@Override
	public int compareTo(Object obj) {
		if (obj==null) {
			return 0;
		}

		if  (obj instanceof Q33CircusComparable) {
			Q33CircusComparable new_name = (Q33CircusComparable) obj;
		}else {
			return-1;
		}
		
		Q33CircusComparable o= (Q33CircusComparable) obj;

		if ((this.height-o.getHeight())==0) {
			return this.weight-o.getWeight();
		} else {
			return(this.height-o.getHeight());
		}
	}
}
