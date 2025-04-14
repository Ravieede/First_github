import java.util.Scanner;
class Insert
{
	void insert_element(int a[] , int index , int element)
	{
		for(int x = a.length-2; x >= index; x--)
		{
			a[x+1] = a[x];
		}
			a[index] = element;
	}

    public static void main(String args[])
	{
		Insert insert = new Insert();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < arr.length-1; i++)
		{
			System.out.print("Enter Array Element At Index "+i+" ");
			arr[i] = sc.nextInt();	
		}		
	
		System.out.print("Array Elements Are : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");	
		}

			System.out.println();	

		int element , index;
		System.out.println("Enter Element to insert enter index where to insert : ");
		element = sc.nextInt();
		index = sc.nextInt();
		
		insert.insert_element(arr , index , element);

		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");	
		}
	}
}