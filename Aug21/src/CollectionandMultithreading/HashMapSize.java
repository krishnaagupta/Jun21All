package CollectionandMultithreading;
//2. Write a program to get size of HashMap?
import java.util.HashMap;
import java.util.Map;

public class HashMapSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer, Character>map1=new HashMap<Integer, Character>();
map1.put(5, 'n');
map1.put(1, 'n');
map1.put(2, 'k');
map1.put(3, 'p');

System.out.println("The Size of HashMap is "+ map1.size());
	}

}
