package stringcopy1;

public class Program {
	public static void main(String[] args) {
		
//first way of copying
//String str = "kodnest";
//String str1 = "" + str;


//second way of copying
//String str1 = "";

//for(int i=0;i<= str.length()-1;i++)
//{
//	str1 = str1 + str.charAt(i);
//}

//third way of copying
//for(int i=0;i<= str.length()-1;i++)
//{
//	char ch = str.charAt(i);
//	str1 = str1 + ch;
//}
//
//System.out.println(str);
//System.out.println(str1);
//		String str = "makarasankranthi";
//		String str1 = "";
//		for(int i=0; i<= (str.length()-1)/2;i++)
//		{
//			char ch = str.charAt(i);
//			str1 = str1 + ch;
//		}
//		
//		System.out.println(str1);
		// fourth way
//		for(int i=str.length()/2;i<str.length()/2;i++)
//		{
//			System.out.println(str.charAt(i));
//		}
//printing odd and even index of a string
//String str = "makarasankranthi";
//String str2 = "";
//for(int i =0;i< str.length();i++)
//{
//	if (i %2 == 0)
//	{
//		System.out.println(str.charAt(i));
//	}
//}
		
//printing strings in reverse order
//String str = "makarasankranthi";
//for(int i=str.length()-1;i>=0;i--)
//{
//	System.out.println(str.charAt(i));
//}
//copying the sytring and printing in reverse
//		String str = "makarasankranthi";
//		String str1 = "";
////		String str = "makarasankranthi";
//		for(int i=str.length()-1;i>=0;i--)
//		{
////			System.out.println(str.charAt(i));
//			str1 = str1 + str.charAt(i);
//		}
//		System.out.println(str1);
		
//checking sytings palindtrom
//		String str = "makarasankranthi";
		String str1 = "";
		String str = "nayan";
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
			str1 = str1 + str.charAt(i);
		}
		
		System.out.println(str1);
		if (str.equals(str1))
		{
			System.out.println("palindrome");
		}else {
			System.out.println("not a pallindrome");
		}
}
}
