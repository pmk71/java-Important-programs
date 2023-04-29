package NumberandStrings;

public class Fibinoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
int a=0;
int b=1;
int sum=0;

while(n>0)
{
	System.out.println(a);
	sum=a+b;
	a=b;
	b=sum;
	n--;
}
	}

}
