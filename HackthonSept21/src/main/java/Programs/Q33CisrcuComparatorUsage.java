package Programs;
/*Q33. A circus is designing a tower routine consisting of people standing atop one another’s shoulders. 
 * For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her.
 *  Given the heights and weights of each person in the circus, write a method to compute the largest possible number of people 
 *  in such a tower. EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) Output: 
 *  The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190) */
/*Steps if you use comparator
 * 1.the comparator is uses in tw0 cases 1) if the class has not implemented comparable 2. if the usage class wants to sort in a different way other than one mentions in the original class.
 * 2. use the comparator ananonymus class inside use a method compare 
 * 3. pass the comparatopr paramater com in below case to collection.sort
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q33CisrcuComparatorUsage {

	public static void main(String[] args) {
		List<Q33CircusComparator>people = new ArrayList<Q33CircusComparator> ();
		people.add(new Q33CircusComparator(65,100));
		people.add(new Q33CircusComparator(70, 150));
		people.add(new Q33CircusComparator(56, 90));
		people.add(new Q33CircusComparator(75, 190));
		people.add(new Q33CircusComparator(60, 95));
		people.add(new Q33CircusComparator(68, 110));
		Comparator<Q33CircusComparator> com=new Comparator<Q33CircusComparator>() {
			public int compare(Q33CircusComparator p1,Q33CircusComparator p2) {
				if (p1.getHeight()==p2.getHeight()){
					return p1.getWeight()-p2.getWeight();
				}
				else {
					return p1.getHeight()-p2.getHeight();
				}
					
			}
		};
		Collections.sort(people,com);
		System.out.println(people);
	}

}
