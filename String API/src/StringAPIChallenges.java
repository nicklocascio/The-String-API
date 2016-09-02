import java.util.Scanner;

public class StringAPIChallenges
	{
	public static void main(String[] args)
		{
//		Scanner word = new Scanner(System.in);
//		System.out.println("Please input a word.");
//		String pluralWord = word.nextLine();
//		String result = (pluralWord.endsWith("s")) ? "That's plural!" : "That's not plural.";
//		System.out.println(result);
//		
//		int counter = 0;
		Scanner word2 = new Scanner(System.in);
		System.out.println("Please input another word.");
		String wordVowels = word2.nextLine();
		switch(wordVowels)
			{
			case "a":
				{
				wordVowels.codePointAt('a');
				}
			case "e":
				{
				wordVowels.codePointAt('e');
				}
			case "i":
				{
				wordVowels.codePointAt('i');		
				}
			case "o":
				{
				wordVowels.codePointAt('o');	
				}
			case "u":
				{
				wordVowels.codePointAt('u');
				}
			}
//		for(int i=0; i<wordVowels.length(); i++)
//			{
//			
//			}
//		
//		if(wordVowels)
//		Scanner word3 = new Scanner(System.in);
//		System.out.println("Please input your full name.");
		}
	}
