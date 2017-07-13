package statystyka;

public class slownik
{
	static public DB1[] baza;
	
	public static void wszystko()
	{
		String wejscie = "fsfaskjf sdf sda sdf d rtaretqert rgfgfdgre gsadfsd f";
		int rozmiar=0;
		String temporary = null;
		for(int i=0; i<wejscie.length();i++)
		{
			wejscie=wejscie.toLowerCase();
			
			if(wejscie.charAt(i)==' ')
			{
				rozmiar++;
			}
		}
		baza = new DB1 [rozmiar];
		
		for(int i=0; i<wejscie.length();i++)
		{
			if(wejscie.charAt(i)==' ')
					{
						for(int k=0;k<rozmiar;k++)
						{
							if(baza[k].slowo.equals(temporary))
							{
								baza[k].ilosc++;
							}
							else
							{
								baza[k].slowo=temporary;
								baza[k].ilosc=1;
							}
						}
						temporary=null;
					}
			else
			{
				temporary=temporary+wejscie.charAt(i);
			}
		}
	}
	public static void main(String[] args)
	{
			// test
			wszystko();
	}
}