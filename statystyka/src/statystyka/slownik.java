package statystyka;

public class slownik
{
	static public DB1[] baza;
	
	public static DB1[] wszystko(String wejscie) //a tutaj dziala bez statica, na potrzeby testu jednak nie dziala
	{
		int rozmiar=1;
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
							baza[k] = new DB1();
							if(baza[k].GetString().equals(temporary))	//nullpointerexception pomimo inicjalizacji
							{
								baza[k].SetIlosc(baza[k].GetIlosc()+1);
							}
							else
							{
								baza[k].SetString(temporary);
								baza[k].SetIlosc(1);
							}
						}
						temporary=null;
					}
			else
			{
				temporary=temporary+wejscie.charAt(i);
			}
		}
		System.out.println(baza[0].GetIlosc()+" "+baza[0].GetString());
		return baza;
	}
}