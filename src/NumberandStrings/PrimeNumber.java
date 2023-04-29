package NumberandStrings;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1;
int i=2;
int count=0;
if(num>=2)
{
while(i<=num/2)
{
	if(num%i==0)
	{
count++;
break;
	}
	i++;

}
if(count==0)
	System.out.println("the number is prime");
else
	System.out.println("the number is not prime");
}
else
	System.out.println("enter the valid number");
}
}