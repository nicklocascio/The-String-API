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
//		
//		int counter = 0;
//		Scanner word2 = new Scanner(System.in);
//		System.out.println("Please input another word.");
//		String wordVowels = word2.nextLine();
//		int counter = 0;
//		switch(wordVowels)
//			{
//			case "a":
//				{
//				System.out.println(wordVowels.indexOf("a"));
//				}
//			case "e":
//				{
//				wordVowels.indexOf("e");
//				counter++;
//				}
//			case "i":
//				{
//				wordVowels.indexOf("i");
//				counter++;
//				}
//			case "o":
//				{
//				wordVowels.indexOf("o");
//				counter++;
//				}
//			case "u":
//				{
//				wordVowels.indexOf("u");
//				counter++;
//				}
//			System.out.println(counter);
//			}
//		for(int i=0; i<wordVowels.length(); i++)
//			{
//			
//			}
//		
//		if(wordVowels)
		Scanner word3 = new Scanner(System.in);
		System.out.println("Please input your full name.");
		String fullName = word3.nextLine();
		for(int i=0; i<fullName.length(); i++)
			{
			switch(fullName.indexOf(i))
				{
				case "a":
					{
					fullName.lastIndexOf(fullName.indexOf("a"));
					}
				case "e":					
					{					
					fullName.lastIndexOf(fullName.indexOf("e"));				
					}
				case "i":
					{
					fullName.lastIndexOf(fullName.indexOf("i"));				
					}
				case "o":
					{
					fullName.lastIndexOf(fullName.indexOf("o"));				
					}
				case "u":
					{
					fullName.lastIndexOf(fullName.indexOf("u"));				
					}
				}
			}
		}
	}
