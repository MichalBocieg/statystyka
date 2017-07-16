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
		bazatest[0] = new DB1();
		bazatest[1] = new DB1();
		bazatest[2] = new DB1();
		bazatest[3] = new DB1();
		bazatest[4] = new DB1();
		DB1[] bazaexpect = new DB1 [5];
		bazaexpect[0] = new DB1();
		bazaexpect[0].SetString("afa");	//nullpointerexception
		bazaexpect[0].SetIlosc(1);
		bazaexpect[1] = new DB1();
		bazaexpect[1].SetString("fsdff");
		bazaexpect[1].SetIlosc(1);
		bazaexpect[2] = new DB1();
		bazaexpect[2].SetString("sfsdf");
		bazaexpect[2].SetIlosc(1);
		bazaexpect[3] = new DB1();
		bazaexpect[3].SetString("fsdfs");
		bazaexpect[3].SetIlosc(1);
		bazaexpect[4] = new DB1();
		bazaexpect[4].SetString("sff");
		bazaexpect[4].SetIlosc(1);
		
		bazatest = slownik.wszystko(stringtest);			//znowu problem ze static
		Assert.assertEquals(bazaexpect,bazatest);
		fail("Not yet implemented");
	}

}
