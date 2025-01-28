class OperatorDemo
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=7;
		int res = a++ + ++b - --a + b++ - a++;
		System.out.println(res);
	}
}
