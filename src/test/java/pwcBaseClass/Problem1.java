package pwcBaseClass;

public class Problem1
{
	
	public static void printPermute(char str[], int index)
	{
		if (index == str.length)
		{
			System.out.println(str);
			return;
		}

		if (str[index] == '*')
		{
			str[index] = '0';
			printPermute(str, index + 1);
			str[index] = '1';
			printPermute(str, index + 1);
			str[index] = '*';
		}
		else
			printPermute(str, index + 1);
	}

	
	public static void main (String[] args)
	{
		String input = "1*01*";
		char[] str = input.toCharArray();
		printPermute(str, 0);
	}
}


