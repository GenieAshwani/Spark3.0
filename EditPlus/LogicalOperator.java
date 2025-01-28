class LogicalOperator 
{
	public static void main(String[] args) 
	{
		boolean a=true;
		boolean b=false;
		boolean c=true;
		System.out.println("a && b "+(a&&b));
		System.out.println("a && c "+(a&&c));
		System.out.println("a || b "+(a||b));
		System.out.println("!(a && b) "+!(a&&b));
	}
}
