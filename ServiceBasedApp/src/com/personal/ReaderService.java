package com.personal;

import java.util.Scanner;
import java.io.File;

class ReaderService extends Service
{

	private final String str1 = new String("../data/f1.txt");
	private final String str2 = new String("../data/f2.txt");
	private final String str3 = new String("../data/f3.txt");

	public void readData()
	{

		File f1 = new File(str1);
		File f2 = new File(str2);
		File f3 = new File(str3);

		Data d;
		try
		{
			Scanner sc1 = new Scanner(f1);
			Scanner sc2 = new Scanner(f2);
			Scanner sc3 = new Scanner(f3);
			while(true)
			{
				if (sc1.hasNext())
				{
					d = new Data();
					d.idata = sc1.nextInt();
					sc1.nextLine();
					d.dataType = DataType.INT;
					this.callBack(d);
				}
				if (sc2.hasNext())
				{
					d = new Data();
					d.ddata = sc2.nextDouble();
					sc2.nextLine();
					d.dataType = DataType.DOUBLE;
					callBack(d);
				}
				if (sc3.hasNext())
				{
					d = new Data();
					d.sdata = sc3.nextLine();
					d.dataType = DataType.STRING;
					callBack(d);
				}
				if (!sc1.hasNext() && !sc2.hasNext() && !sc3.hasNext())
				{
					break;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void start()
	{
		new Thread()
		{
			public void run()
			{
				readData();
			}
		}.start();

		t = new Thread(this);
		t.start();
		started = true;
	}
}
