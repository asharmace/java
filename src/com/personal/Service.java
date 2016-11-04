package com.personal;

import java.util.ArrayList;

abstract class Service implements IService
{
	private Thread t;
	private boolean started;
	private boolean done;

	Service()
	{
		started = false;
		done = false;
	}

	abstract void process(Data d);

	public void run()
	{
		while (!done)
		{
			// Lock and get data from Queue
			Data d = new Data();
			process(d);
		}
	}

	public void start()
	{
		t = new Thread(this);
		t.start();
		started = true;
	}

	public void stop()
	{
		done = true;
	}

	public boolean isRunning()
	{
		return started && !done;
	}

	public boolean isStopped()
	{
		return done;
	}

	public void callBack(Data d)
	{
		// Lock and insert into Queue;
	}

}