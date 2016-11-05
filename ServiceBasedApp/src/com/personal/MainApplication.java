package com.personal;

class MainApplication
{
	public static void createApplication()
	{
		IService reader = new ReaderService();
		IService exec = new ExecService();
		IService post = new PostProcService();

		reader.setDownStream(exec);
		exec.setDownStream(post);

		post.start();
		exec.start();
		reader.start();

		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		reader.stop();
		exec.stop();
		post.stop();

		post.join();
		exec.join();
		reader.join();
	}

	public static void main(String []args)
	{
		createApplication();
	}
}