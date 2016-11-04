package com.personal;

import java.util.Scanner;

class ReaderService extends Service
{

	private final String f1 = new String("../data/f1.txt");
	private final String f2 = new String("../data/f2.txt");
	private final String f3 = new String("../data/f3.txt");

	public void readData()
	{
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(f2);
		Scanner sc3 = new Scanner(f3);
		Data d;
		while(true)
		{
			if (sc1.hasNext())
			{
				d = new Data();
				d.idata = Integer.parseInt(sc1.nextLine());
				d.dataType = DataType.INT;
				this.callBack(d);
			}
			if (sc1.hasNext())
			{
				d = new Data();
				d.ddata = Double.parseDouble(sc2.nextLine());
				d.dataType = DataType.DOUBLE;
				callBack(d);
			}
			if (sc1.hasNext())
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
