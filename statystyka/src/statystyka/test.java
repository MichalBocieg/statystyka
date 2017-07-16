package statystyka;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class test {

	@Test
	public void testNormalny()
	{
		String stringtest = "afa fsdff sfsdf fsdfs sff"; 	//in
		DB1[] bazatest = new DB1 [5];						//out
		DB1[] bazaexpect = new DB1 [5];
		
		for(int i = 0;i<5;i++)	
		{
			bazatest[i] = new DB1();
			bazaexpect[i] = new DB1();
		}
		
		bazaexpect[0].SetString("afa");
		bazaexpect[0].SetIlosc(1);
		bazaexpect[1].SetString("fsdff");
		bazaexpect[1].SetIlosc(1);
		bazaexpect[2].SetString("sfsdf");
		bazaexpect[2].SetIlosc(1);
		bazaexpect[3].SetString("fsdfs");
		bazaexpect[3].SetIlosc(1);
		bazaexpect[4].SetString("sff");
		bazaexpect[4].SetIlosc(1);
		
		bazatest = slownik.wszystko(stringtest);			//znowu problem ze static
		Assert.assertEquals(bazaexpect,bazatest);
		fail("Not yet implemented");
	}

}
