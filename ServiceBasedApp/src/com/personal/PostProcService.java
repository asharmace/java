package com.personal;

import java.io.PrintWriter;

class PostProcService extends Service
{
	private PrintWriter w1;
	private PrintWriter w2;
	private PrintWriter w3;


	PostProcService()
	{
		try
		{
			w1 = new PrintWriter("../data/outf1.txt", "UTF-8");
			w2 = new PrintWriter("../data/outf2.txt", "UTF-8");
			w3 = new PrintWriter("../data/outf3.txt", "UTF-8");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void process(Data d)
	{
		try
		{
			switch(d.dataType)
			{
				case INT :
				{
					w1.write(String.valueOf(d.idata) + "\n");
					break;
				}
				case DOUBLE:
				{
					w2.write(String.valueOf(d.ddata) + "\n");
					break;
				}
				case STRING :
				{
					w3.write(d.sdata + "\n");
					break;
				}
			}
		}
		catch (Exception e) 
		{
		   e.printStackTrace();
		}
	}

	public void stop()
	{
		done = true;
		while(!queue.isEmpty())
		{
			try
			{
				Thread.sleep(5);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		try
		{
			w1.close();
			w2.close();
			w3.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}