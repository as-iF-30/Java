public class DataString {
	public String data,EncryptedString="",DecryptedString="";
	int key;
	void SetData(String x)
	{   data=x;  }
	void SetKey(int i)
	{   key=i;   }
	void Encrypt()
	{
		for(int i=0;i<data.length();i++)
		{
			int ascii=(int)data.charAt(i);
			for(int j=0;j<key;j++)
			{
				if(ascii==90)
				{
					ascii=65;
					continue;
				}
				else
					if(ascii==122)
					{
						ascii=97;
						continue;
					}
					else
						ascii++;
			}
			EncryptedString+=(char)ascii+"";
		}
	}
	void Decrypt()
	{
		for(int i=0;i<data.length();i++)
		{
			int ascii=(int)data.charAt(i);
			for(int j=0;j<key;j++)
			{
				if(ascii==65)
				{
					ascii=90;
					continue;
				}
				else
					if(ascii==97)
					{
						ascii=122;
						continue;
					}
					else
						ascii--;
			}
			DecryptedString+=(char)ascii+"";
		}