package net.injenity;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class DateTimeServiceJar {
	@WebMethod
	public Date getDate(Date set)
	{
		if (set == null)
		{
			return new Date();
		}
		
		return set;
	}
	
	@WebMethod
	public GregorianCalendar getCalendar(GregorianCalendar cal)
	{
		if (cal == null)
		{
			return new GregorianCalendar();
		}
		
		return cal;
	}
}
