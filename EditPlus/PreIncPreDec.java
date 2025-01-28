class PreIncPreDec 
{
	public static void main(String[] args) 
	{
		int a=5;
		int c=a++;
		System.out.println(c);	
		System.out.println(a);

		int b=10;
		int k=--b;
		int f=++b;
		int l=b++;
		System.out.println("b===>"+b);	
		System.out.println("k===>"+k);	
		System.out.println("f===>"+f);	
		System.out.println("l===>"+l);	
	}
}
