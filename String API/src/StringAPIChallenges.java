import java.util.Scanner;

public class StringAPIChallenges
	{
	public static void main(String[] args)
		{
//		Scanner word = new Scanner(System.in);
//		System.out.println("Please input a noun.");
//		String pluralWord = word.nextLine();
//		String result = (pluralWord.endsWith("s")) ? "That's plural!" : "That's not plural.";
//		System.out.println(result);
			
		Scanner word2 = new Scanner(System.in);
		System.out.println("Please input another word.");
		String wordVowels = word2.nextLine();
		int sum = 0;
		for(int i=0; i<wordVowels.length(); i++)
			{
			switch(wordVowels.substring(i, i + 1))
				{
				case "a":
					{
					sum += i;		
					break;
					}
				case "e":					
					{					
					sum += i;	
					break;
					}
				case "i":
					{
					sum += i;	
					break;
					}
				case "o":
					{
					sum += i;	
					break;
					}
				case "u":
					{
					sum += i;	
					break;
					}
					
				}
	
			}
		
		System.out.println(sum);
//		Make method	
//		Scanner word3 = new Scanner(System.in);
//		System.out.println("Please input your full name.");
//		String fullName = word3.nextLine();
		

		
		}
	}
