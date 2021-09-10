package JavaPrg;
//4.Input string= “ABCAABCAEBE” which character is duplicated less/leasr number of times.
public class LeastStringDuplication {

	public static void main(String[] args) {
		String str1="ABCAABxCAEBoE";
		int count=0,minCount=10;
		String minCh=str1.substring(0);

		for(int i=0;i<str1.length();i++) {
			count=0;
			char ch=str1.charAt(i);

			for (int j=0;j<str1.length();j++) {
				if (ch==str1.charAt(j)) {
					count++;
				}

			}
			//System.out.println("o/p"+ch+count);
			if (minCount>count) {
				minCount=count;
				minCh=String.valueOf(ch);
				
			}
			else if(minCount==count) {
				minCh=minCh+","+str1.charAt(i);
			}
		}
		System.out.println("min Character is"+minCh);
	}

}
