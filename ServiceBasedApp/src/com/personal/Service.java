package com.personal;

import java.util.LinkedList;
import java.util.Queue;

abstract class Service implements IService
{
	private Thread t;
	private boolean started;
	private volatile boolean done;
	protected IService downStream;
	protected Queue<Data> queue;

	Service()
	{
		started = false;
		done = false;
		queue = new LinkedList<Data>();
	}

	abstract void process(Data d);

	public void run()
	{
		while (!done)
		{
			
			Data d;
			synchronized(queue)
			{

				if(!queue.isEmpty())
				{
					d = queue.poll();
					process(d);				
				}
			}
			// Put sleep
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
		synchronized(queue)
		{
			queue.add(d);			
		}
	}

}