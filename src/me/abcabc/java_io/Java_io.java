package me.abcabc.java_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;
public class Java_io {
	
	/**
	 * @throws IOException *
	 * 
	 * 
	 * 
	 */
	@Test
	public void test() throws IOException
	{
		
		InputStream in = new FileInputStream("./././others/test_01.txt");
		byte[] bt = new byte[100];
		int btCount;
		while((btCount=in.read(bt))!=-1)
		{
			String s = new String(bt); 
			System.out.println(s);
			for(byte b:bt)
			{
				System.out.print("-"+(char)b+b);
			}
		}
	}
	
	public void test2()
	{
		System.out.println(Byte.MAX_VALUE);
	}

}
/**
*IO流常用的基类：InputStream  OutputStream
*字符流的抽象基类：Reader  Writer
*
*
*
*/