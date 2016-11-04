package com.personal;

class TestExecService
{
	public static void testExecService()
	{
		Service exec = new ExecService();

		System.out.println("Testing Execution Service:- ");
		System.out.println(exec.isRunning() + " " + exec.isStopped());
		exec.stop();
		System.out.println(exec.isRunning() + " " + exec.isStopped());		
	}
}