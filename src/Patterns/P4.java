package Patterns;
import java.util.Iterator;

public class P4 {
public static void main(String[] args) {
	int n=1;
	char ch='A';
	
	for(int i=1;i<=3;i++)
	{
		for (int j=1;j<=4;j++)
		{
			if(i%2==1)
				System.out.print(ch++ +" ");
			else
			{
				System.out.print(n +" ");
				n=n+2;
		}
	}
		System.out.println();
}
}
}
