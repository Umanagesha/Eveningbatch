package Generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Test;

public class D1 
{
@Test
public void State1()
{
	Properties p=new Properties();
	p.load(new FileInputStream("./p.Properties"));
	String a1 = p.getProperty("baseurl");
	System.out.println(a1);
}


}
