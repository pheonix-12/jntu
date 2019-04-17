import java.util.*;
class ceaser{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("Enter the key");
		int key=sc.nextInt();
		String encrypted=encryptString(str,key);
		System.out.println("The encrypted string is"+encrypted);
		//String decrypted=decryptString(encrypted,key);
		//System.out.println("The decrypted String is "+decrypted);

	}
	public static String encryptString(String str,int key)
	{
		String encrypted="";
		for(int i=0;i<str.length();i++)
		{
			int c=str.charAt(i);
			if(Character.isUpperCase(c))
			{
				c=c+(key%26);
				if(c>'Z')
					c=c-26;
			}
			if(Character.isLowerCase(c))
			{
				c=c+(key%26);
				if(c>'z')
				{
					c=c-26;
				}
			}
			encrypted+=(char)c;
		}
		return encrypted;
	}
}