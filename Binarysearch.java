import java.util.*;
public class Binarysearch
{
	static int a[],i,max=7,temp=0,key;
	static Scanner sc;
	public static void Binary(int a[],int key)
	{
		int l=0,h=max-1,m;
		while(l<=h)
		{
			m=(l+h)/2;
			if(m==key)
			{
				System.out.println("element is found ");
				temp=1;
				break;
			}
			else if(m<key)
			{
				l=m+1;
			}
			else
			{
				h=m-1;
			}
		}
		if(temp==0)
		{
			System.out.println("elements are not found");
		}
	}
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		a=new int[max];
		System.out.println("enter array elements ");
		for(i=0;i<max;i++)
			a[i]=sc.nextInt();
		System.out.println("enter key");
		key=sc.nextInt();
		Binary(a,key);
	}
}
			