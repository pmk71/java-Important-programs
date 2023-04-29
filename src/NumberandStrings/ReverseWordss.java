package NumberandStrings;

public class ReverseWordss {
public static void main(String[] args) {
	 String s="All the best";
	 String rev="";
	String[] s1 = s.split(" ");
	
	for (int i = 0; i < s1.length; i++) {
		rev=s1[i]+" "+rev;
	}
	System.out.println(rev);
}
}
