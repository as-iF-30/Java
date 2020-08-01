public class DataNum {

	int [] a = new int[1000];
	public String num,EncryptedString="",DecryptedString="";
	int key;
	void SetData(String x)
	{
		num=x;
	}
	void SetKey(int i)
	{
		key=i;
	}
	void Encrypt()
	{
		for(int i=0;i<num.length();i++)
		{
			a[i]=Character.getNumericValue(num.charAt(i))+key;
		}
		for(int i=0;i<num.length();i++)
		{
			EncryptedString+=a[i]+"";
		}
	}
	void Decrypt()
	{
		for(int i=0;i<num.length();i++)
		{
			int x = Character.getNumericValue(num.charAt(i))-key;
			if(x<0)
			{
				errorHandle(i);
				i++;
				continue;
			}
			else
			{
				DecryptedString+=x+"";
			}
		}
	}
	void errorHandle(int h)
	{
		int x1=0;
		x1 = Character.getNumericValue(num.charAt(h))*10 + Character.getNumericValue(num.charAt(h+1)); 
		x1=x1-key;
		DecryptedString+=x1+"";
	}

}
