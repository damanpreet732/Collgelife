import java.util.* ;
class cw1 
{
	static String preference (String s1 , String s2 )
	{
		int i = 0;
		for(i=0;i<s1.length()&&i<s2.length();i++)
		{
			if(s1.charAt(i) == s2.charAt(i))
			{
				continue ;
			}
			else {
				if(s1.charAt(i) < s2.charAt(i))
				{
					return s1 ;
				}
				else 
				{
					return s2 ;
				}
			}
		}
		if(i==s1.length())
		{
			return s1 ;
		}
		else return s2 ;
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		String str1 = input.next();
		String str2 = input.next();
		System.out.println(preference(str1,str2));
	}
}