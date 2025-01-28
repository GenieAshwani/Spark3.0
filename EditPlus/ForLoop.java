class ForLoop 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		
		//store value using array
		System.out.println("Storing data into array");
		int a=10;
		for(int i=0;i<=4;i++)
		{
			arr[i]=a;
			a++;
		}

		//print array
		//sop(arr[0])
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("for each");
		for(int data:arr)
		{
			System.out.println(data);
		}
	}
}
