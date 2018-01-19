public class MyString {
	private int length;
	private char[] charArray;
	public MyString()
	{
		length = 0;
	}
	public MyString(String str)
	{
		length = str.length();
		charArray = new char[length];
		for(int i = 0; i < length; i ++)
			charArray[i] = str.charAt(i);
	}
	public boolean equals(String str)
	{
		for(int i = 0; i < str.length() && i < length; i ++)
			if(charArray[i] != str.charAt(i))
				return false;
		if(str.length() == length)
			return true;
		else
			return false;
	}
	public int indexOf(char ch)
	{
		for(int i = 0; i < length; i ++)
			if(charArray[i] == ch)
				return i;
		return -1;
	}
	public int indexOf(String s)
	{
		char[] other = s.toCharArray();
		int lastIndex = length - other.length + 1;
		for(int i = 0; i <= lastIndex; i++)
		{
			boolean sand = true;
			for(int j = 0, k = i; j < other.length; j++, k++)
			{
				if(charArray[k] != other[j])
				{
					sand = false;
					break;
				}
			}
			if(sand)
				return i;
		}
		return -1;
	}
	public boolean startsWith(String str)
	{
		if(indexOf(str) == 0)
			return true;
		else
			return false;
	}
	public boolean endsWith(String str)
	{
		int index = indexOf(str);
		if(index == -1 || index + str.length() != length)
			return false;
		else
			return true;
	}
	public boolean contains(String str)
	{
		return indexOf(str) != -1;
	}
	public String toString()
	{
		if(length == 0)
			return "";
		else
			return new String(charArray);
	}
}