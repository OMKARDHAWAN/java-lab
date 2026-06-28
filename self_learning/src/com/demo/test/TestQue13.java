package com.demo.test;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.time.temporal.ChronoUnit;
	public class TestQue13 
	{
	    public LocalDate stringToDate(String dateString, String format)
	    {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
	        return LocalDate.parse(dateString, formatter);
	    }
	    public String dateToString(LocalDate date, String format) 
	    {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
	        return date.format(formatter);
	    }
	    public long daysBetween(LocalDate startDate, LocalDate endDate) 
	    {
	        return ChronoUnit.DAYS.between(startDate, endDate);
	    }
	    public static void main(String[] args) {
	    	TestQue13 dm = new TestQue13();
	        String pattern = "dd-MM-yyyy";
	        String dateStr1 = "05-02-2026";
	        String dateStr2 = "16-05-2026";
	        LocalDate d1 = dm.stringToDate(dateStr1, pattern);
	        LocalDate d2 = dm.stringToDate(dateStr2, pattern);
	        System.out.println("Parsed Date 1: " + d1);
	        System.out.println("Formatted Date 2: " + dm.dateToString(d2, "MMMM dd, yyyy"));
	        long diff = dm.daysBetween(d1, d2);
	        System.out.println("Days between " + dateStr1 + " and " + dateStr2 + ": " + diff);
	    }
	}

