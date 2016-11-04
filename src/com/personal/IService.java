package com.personal;

interface IService extends Runnable
{
	public void run();
	public void start();
	public void stop();
	public boolean isRunning();
	public boolean isStopped();
	public void callBack(Data d);

}