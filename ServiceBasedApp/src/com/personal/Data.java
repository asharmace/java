package com.personal;

enum DataType
{
	NONE,
	INT,
	DOUBLE,
	STRING;
};

class Data
{
	public int idata;
	public double ddata;
	public String sdata;
	public DataType dataType;

	Data()
	{
		idata = -1;
		ddata = -1.0;
		sdata = "default";
		dataType = DataType.NONE;
	}
}