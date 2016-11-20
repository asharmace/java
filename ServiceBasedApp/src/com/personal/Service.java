package com.personal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Service implements IService
{
	protected Thread t;
	protected boolean started;
	protected volatile boolean done;
	protected IService downStream;
	protected Queue<Data> queue;
	protected ArrayList<IListener> listeners;

	Service()
	{
		started = false;
		done = false;
		queue = new LinkedList<Data>();
		listeners = new ArrayList<IListener>();
	}

	void process(Data d)
	{
		notifyListeners(d);
	}

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
			try
			{
				Thread.sleep(1);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
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

	public void join()
	{
		try
		{
			t.join();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}

	public boolean isRunning()
	{
		return started && !done;
	}

	public boolean isStopped()
	{
		return done;
	}

	public void notifyListeners(Data d)
	{
		for (IListener listener: listeners)
			listener.callBack(d);
	}

	public void callBack(Data d)
	{
		synchronized(queue)
		{
			queue.add(d);			
		}
	}

	public void register(IListener is)
	{
		listeners.add(is);
	}
}