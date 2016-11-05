package com.personal;

class ExecService extends Service
{
	public void process(Data d)
	{
		if (d.dataType == DataType.INT)
		{
			d.idata = d.idata * 2;
		}
		else if (d.dataType == DataType.DOUBLE)
		{
			d.ddata = d.ddata * 2;
		}
		else if (d.dataType == DataType.STRING)
		{
			d.sdata = "\"" + d.sdata + "\"";
		}
		else if (d.dataType == DataType.NONE)
		{
			//LOG ERROR
			System.out.println("ERROR. Invalid/Corrupted Data");
			return;
		}

		downStream.callBack(d);
	}
}