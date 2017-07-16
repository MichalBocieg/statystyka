package statystyka;

public class DB1
{
	private String slowo=" ";
	private int ilosc=0;
	public void SetString(String slowo)
	{
		this.slowo=slowo;
	}
	public void SetIlosc(int ilosc)
	{
		this.ilosc=ilosc;
	}
	public String GetString()
	{
		return slowo;
	}
	public int GetIlosc()
	{
		return ilosc;
	}
	
}
