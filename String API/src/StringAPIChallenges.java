import java.util.Scanner;

public class StringAPIChallenges
	{
	static String fullName;
	static int firstVowel;
	public static void findFirstVowelIndex()
		{
		Scanner word3 = new Scanner(System.in);
		System.out.println("Please input your full name.");
		fullName = word3.nextLine();
		for(int i = 0; i < fullName.length(); i++)
			{
			if((fullName.substring(i, i + 1).equals("a")) || (fullName.substring(i, i + 1).equals("e")) || (fullName.substring(i, i + 1).equals("i")) || (fullName.substring(i, i + 1).equals("o")) || (fullName.substring(i, i + 1).equals("u")))
				{
				firstVowel = i;
				break;			
				}			
			}
		}
	public static void main(String[] args)
		{
		Scanner word = new Scanner(System.in);
		System.out.println("Please input a noun.");
		String pluralWord = word.nextLine();
		String result = (pluralWord.endsWith("s")) ? "That's plural!" : "That's not plural.";
		System.out.println(result);
			
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
		System.out.println("The sum of indices of all the vowels is: " + sum);
		
		findFirstVowelIndex();
		int answer = fullName.lastIndexOf(fullName.charAt(firstVowel));
		System.out.println("The index of the last occurence of the first vowel is: " + answer);
		}	
	}
		
		

		

