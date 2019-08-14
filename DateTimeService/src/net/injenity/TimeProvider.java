package net.injenity;

import java.util.Date;
import java.util.GregorianCalendar;

public class TimeProvider {

	public Date getDate(Date set)
	{
		if (set == null)
		{
			return new Date();
		}
		
		return set;
	}
	
	public GregorianCalendar getCalendar(GregorianCalendar cal)
	{
		if (cal == null)
		{
			return new GregorianCalendar();
		}
		
		return cal;
	}

}
