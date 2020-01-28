import java.util.Scanner;
class Main
{

	public static void leftRotateByOne(int[] arr)
	{
		int first = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[arr.length - 1] = first;
	}

	public static void leftRotate(int[] arr, int r)
	{
		for (int i = 0; i < r; i++) {
			leftRotateByOne(arr);
		}
	}

	public static void main(String[] args)
	{   
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements for the array");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
		
		int r = 2;

		leftRotate(arr, r);

		for (int i: arr) {
			System.out.printf("%d ", i);
		}
	}
}
