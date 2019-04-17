import java.util.*;
class sub{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String a="abcdefghijklmnopqrstuvwxyz";
		String b="zyxwvutsrqponmlkjihgfedcba";
		System.out.println("Enter the String ");
		String msg=s.nextLine();
		char c,d;
		String encrypted="";
		String decrypt="";
		for(int i=0;i<msg.length();i++)
		{
			c=msg.charAt(i);
			int j=a.indexOf(c);
			encrypted+=b.charAt(j);
		}
		System.out.println("encrypted message is "+encrypted);
		for(int i=0;i<msg.length();i++)
		{
			c=encrypted.charAt(i);
			int j=b.indexOf(c);
			decrypt+=a.charAt(j);
		}
		System.out.println("decrypted message is "+decrypt);

	}
}