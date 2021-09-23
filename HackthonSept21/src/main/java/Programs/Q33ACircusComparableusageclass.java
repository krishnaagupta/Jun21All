package Programs;
//Q33. A circus is designing a tower routine consisting of 
/*people standing atop one another’s shoulders. For practical and 
aesthetic reasons, each person must be both shorter and lighter
than the person below him or her. Given the heights and weights of 
each person in the circus, write a method to compute the largest possible 
number of people in such a tower. EXAMPLE: Input (ht, wt): (65, 100) (70, 150) 
(56, 90) (75, 190) (60, 95) (68, 110) Output: The longest tower is length 6 and 
includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190) */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q33ACircusComparableusageclass  {



	public static void main(String[] args) {


		List<Q33CircusComparable>people = new ArrayList<Q33CircusComparable> ();
		people.add(new Q33CircusComparable(65,100));
		people.add(new Q33CircusComparable(70, 150));
		people.add(new Q33CircusComparable(56, 90));
		people.add(new Q33CircusComparable(75, 190));
		people.add(new Q33CircusComparable(60, 95));
		people.add(new Q33CircusComparable(68, 110));

		Collections.sort(people);
		System.out.println(people);

	}


}
