import java.util.Scanner;


public class Ch3_3
{
	public static void main (String [] args)
	{
		String first, second,third,change;
		int compare1,compare2,compare3;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Please enter three words");
		first = keyboard.next();
		second = keyboard.next();
		third = keyboard.next();
		compare1 = first.compareTo(second);
		compare2 = first.compareTo(third);
		compare3 = second.compareTo(third);
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);
		//while(compare1 )
		if (compare1 >=0){
			change = second;
			second = first;
			first = change;
		}
		if (compare2 >=0){
			change = third;
			third = first;
			first = change;
		}
		if(compare3 >= 0){
			change = third;
			third = second;
			second = change;
		}
		System.out.println(second);
	}
}
