package com.personal;

interface IService extends Runnable
{
	public void run();
	public void start();
	public void stop();
	public void join();
	public boolean isRunning();
	public boolean isStopped();
	public void notifyListeners(Data d);
	public void register(IService is);
	public void callBack(Data d);

}