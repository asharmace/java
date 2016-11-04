package com.personal;

class TestExecService
{
	public static void testExecService()
	{
		Service exec = new ExecService();

		System.out.println("Testing Execution Service:- ");
		System.out.println("Is Service Running " + exec.isRunning() + "\tIs Service Stopped " + exec.isStopped());
		exec.stop();
		System.out.println("Is Service Running " + exec.isRunning() + "\tIs Service Stopped " + exec.isStopped());
	}
}