/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.digihealth.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;

/**
 * 
     * Title: DateUtils.java    
     * Description: ���ڹ�����, �̳�org.apache.commons.lang.time.DateUtils��
     * @author chengwang       
     * @created 2015-10-8 ����1:59:07
 */
public class DateUtils extends org.apache.commons.lang.time.DateUtils {
	
	private static String[] parsePatterns = {
		"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM", 
		"yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
		"yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

	/**
	 * �õ���ǰ�����ַ��� ��ʽ��yyyy-MM-dd��
	 */
	public static String getDate() {
		return getDate("yyyy-MM-dd");
	}
	
	public static String getDate(Date d){
		SimpleDateFormat sim = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return sim.format(d);
	}
	
	public static String DateToString(Date d){
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		return sim.format(d);
	}
	
	public static String getDateToString(){
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM");
		return sim.format(new Date());
	}
	
	public static String getDateToString(String date) throws ParseException{
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM");
		return sim.format(sim.parse(date));
	}
	
	
	/**
	 * �õ���ǰ�����ַ��� ��ʽ��yyyy-MM-dd�� pattern����Ϊ��"yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String getDate(String pattern) {
		return DateFormatUtils.format(new Date(), pattern);
	}
	
	/**
	 * �õ������ַ��� Ĭ�ϸ�ʽ��yyyy-MM-dd�� pattern����Ϊ��"yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String formatDate(Date date, Object... pattern) {
		String formatDate = null;
		if (pattern != null && pattern.length > 0) {
			formatDate = DateFormatUtils.format(date, pattern[0].toString());
		} else {
			formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
		}
		return formatDate;
	}
	
	/**
	 * ʱ���ַ�����ʽת��Ϊ����һ��ʱ���ַ�����ʽ
	 * @param str               Ҫת�����ַ���
	 * @param fromFormat        Ҫת�����ַ�����ʽ
	 * @param toFormat          Ŀ���ַ����ĸ�ʽ
	 * @return                  Ŀ���ַ���
	 */
	public static String strToStr(String str,String fromFormat,String toFormat){
		if(str == null || str.trim().equals(""))
			return str;
		DateFormat fromTime = new SimpleDateFormat(fromFormat);
		DateFormat toTime = new SimpleDateFormat(toFormat);
		try{
			Date date = fromTime.parse(str);
			return toTime.format(date);
		}catch(ParseException e){
			return null;
		}
	}
	
	/**
	 * �õ�����ʱ���ַ�����ת����ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	public static String formatDateTime(Date date) {
		return formatDate(date, "yyyy-MM-dd HH:mm:ss");
	}
	
	
	public static String formatLongTime(Long time) {
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sim.format(time);
	}

	/**
	 * �õ���ǰʱ���ַ��� ��ʽ��HH:mm:ss��
	 */
	public static String getTime() {
		return formatDate(new Date(), "HH:mm:ss");
	}

	/**
	 * �õ���ǰ���ں�ʱ���ַ��� ��ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	public static String getDateTime() {
		return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * �õ���ǰ���ں�ʱ���ַ��� ��ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	public static String getDateStringTime() {
		return formatDate(new Date(), "yyyy-MM-dd HH:mm");
	}

	/**
	 * �õ���ǰ����ַ��� ��ʽ��yyyy��
	 */
	public static String getYear() {
		return formatDate(new Date(), "yyyy");
	}

	/**
	 * �õ���ǰ�·��ַ��� ��ʽ��MM��
	 */
	public static String getMonth() {
		return formatDate(new Date(), "MM");
	}

	/**
	 * �õ������ַ��� ��ʽ��dd��
	 */
	public static String getDay() {
		return formatDate(new Date(), "dd");
	}

	/**
	 * �õ���ǰ�����ַ��� ��ʽ��E�����ڼ�
	 */
	public static String getWeek() {
		return formatDate(new Date(), "E");
	}
	
	/**
	 * �������ַ���ת��Ϊ���� ��ʽ
	 * { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", 
	 *   "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm",
	 *   "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm" }
	 */
	public static Date parseDate(Object str) {
		if (str == null){
			return null;
		}
		try {
			return parseDate(str.toString(), parsePatterns);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * ��ȡ��ȥ������
	 * @param date
	 * @return
	 */
	public static long pastDays(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(24*60*60*1000);
	}

	/**
	 * ��ȡ��ȥ��Сʱ
	 * @param date
	 * @return
	 */
	public static long pastHour(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(60*60*1000);
	}
	
	/**
	 * ��ȡ��ȥ�ķ���
	 * @param date
	 * @return
	 */
	public static long pastMinutes(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(60*1000);
	}
	
	/**
	 * ת��Ϊʱ�䣨��,ʱ:��:��.���룩
	 * @param timeMillis
	 * @return
	 */
    public static String formatDateTime(long timeMillis){
		long day = timeMillis/(24*60*60*1000);
		long hour = (timeMillis/(60*60*1000)-day*24);
		long min = ((timeMillis/(60*1000))-day*24*60-hour*60);
		long s = (timeMillis/1000-day*24*60*60-hour*60*60-min*60);
		long sss = (timeMillis-day*24*60*60*1000-hour*60*60*1000-min*60*1000-s*1000);
		return (day>0?day+",":"")+hour+":"+min+":"+s+"."+sss;
    }
	
	/**
	 * ��ȡ��������֮�������
	 * 
	 * @param before
	 * @param after
	 * @return
	 */
	public static double getDistanceOfTwoDate(Date before, Date after) {
		long beforeTime = before.getTime();
		long afterTime = after.getTime();
		return (afterTime - beforeTime) / (1000 * 60 * 60 * 24);
	}
	
	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
//		System.out.println(formatDate(parseDate("2010/3/6")));
//		System.out.println(getDate("yyyy��MM��dd�� E"));
//		long time = new Date().getTime()-parseDate("2012-11-19").getTime();
//		System.out.println(time/(24*60*60*1000));
		
		//System.out.println(getDate(new Date()));
		
		//String formatDate = DateUtils.formatDate(new Date(), "yyyy-MM-dd");
		System.out.println(plusDay("2018-04-20", 20));
	}
	
	public static Date getCurrDate(){
		Date d = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			return sim.parse(sim.format(d));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static Date getParseTime(String time){
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sim.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getParseNYRTime(String time){
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sim.format(sim.parse(time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getParseSFMTime(String time){
		SimpleDateFormat sim = new SimpleDateFormat("HH:mm:ss");
		try {
			return sim.format(sim.parse(time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	/**
     * ����ָ�����ڵļ��ĵ�һ��
     * 
     * @param year
     * @param quarter
     * @return
     */
    public static Date getFirstDayOfQuarter(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getFirstDayOfQuarter(calendar.get(Calendar.YEAR), getQuarterOfYear(date));
    }
    
    /**
     * ����ָ�����ڵļ������һ��
     * 
     * @param year
     * @param quarter
     * @return
     */
    public static Date getLastDayOfQuarter(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getLastDayOfQuarter(calendar.get(Calendar.YEAR), getQuarterOfYear(date));
    }
    
    /**
     * ����ָ�����ڵļ���
     * 
     * @param date
     * @return
     */
    public static int getQuarterOfYear(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) / 3 + 1;
    }
	
    /**
     * ����ָ���꼾�ļ��ĵ�һ��
     * 
     * @param year
     * @param quarter
     * @return
     */
    public static Date getFirstDayOfQuarter(Integer year, Integer quarter)
    {
        Calendar calendar = Calendar.getInstance();
        Integer month = new Integer(0);
        if (quarter == 1)
        {
            month = 1 - 1;
        }
        else if (quarter == 2)
        {
            month = 4 - 1;
        }
        else if (quarter == 3)
        {
            month = 7 - 1;
        }
        else if (quarter == 4)
        {
            month = 10 - 1;
        }
        else
        {
            month = calendar.get(Calendar.MONTH);
        }
        return getFirstDayOfMonth(year, month);
    }
    
    /**
     * ����ָ���꼾�ļ������һ��
     * 
     * @param year
     * @param quarter
     * @return
     */
    public static Date getLastDayOfQuarter(Integer year, Integer quarter)
    {
        Calendar calendar = Calendar.getInstance();
        Integer month = new Integer(0);
        if (quarter == 1)
        {
            month = 3 - 1;
        }
        else if (quarter == 2)
        {
            month = 6 - 1;
        }
        else if (quarter == 3)
        {
            month = 9 - 1;
        }
        else if (quarter == 4)
        {
            month = 12 - 1;
        }
        else
        {
            month = calendar.get(Calendar.MONTH);
        }
        return getLastDayOfMonth(year, month);
    }
	
    /**
     * ����ָ�����µ��µĵ�һ��
     * 
     * @param year
     * @param month
     * @return
     */
    public static Date getFirstDayOfMonth(Integer year, Integer month)
    {
        Calendar calendar = Calendar.getInstance();
        if (year == null)
        {
            year = calendar.get(Calendar.YEAR);
        }
        if (month == null)
        {
            month = calendar.get(Calendar.MONTH);
        }
        calendar.set(year, month, 1);
        return calendar.getTime();
    }
    
    /**
     * ����ָ�����µ��µ����һ��
     * 
     * @param year
     * @param month
     * @return
     */
    public static Date getLastDayOfMonth(Integer year, Integer month)
    {
        Calendar calendar = Calendar.getInstance();
        if (year == null)
        {
            year = calendar.get(Calendar.YEAR);
        }
        if (month == null)
        {
            month = calendar.get(Calendar.MONTH);
        }
        calendar.set(year, month, 1);
        calendar.roll(Calendar.DATE, -1);
        return calendar.getTime();
    }
	
    /**
     * ����ָ�����ڵ��µĵ�һ��
     * 
     * @param year
     * @param month
     * @return
     */
    public static Date getFirstDayOfMonth(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
        return calendar.getTime();
    }
    
    /**
     * ����ָ�����ڵ��µ����һ��
     * 
     * @param year
     * @param month
     * @return
     */
    public static Date getLastDayOfMonth(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
        calendar.roll(Calendar.DATE, -1);
        return calendar.getTime();
    }
    
    /**
     * ����ָ����ĵ�һ��
     * 
     * @param year
     * @param month
     * @return
     */
    public static Date getFirstDayOfYear(int year)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        return calendar.getTime();
    }
    
    /**
     * ����ָ��������һ��
     * @param year ���
     * @return Date
     */
    public static Date getLastDayOfYear(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date currYearLast = calendar.getTime();
         
        return currYearLast;
    }
    
    public static java.sql.Date stringToDate(String s){
    	SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
    	try {
			return new java.sql.Date(sim.parse(s).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    /** 
     * ������������֮��������Ȼ�ꡢ�¡���
     * <������ϸ����>
     * @param beginDate
     * @param endDate
     * @return
     * @see [�ࡢ��#��������#��Ա]
     */
    public static int[] getNaturalAge(String beginDate, String endDate)
    {
        Calendar calendarBegin = Calendar.getInstance();
        Calendar calendarEnd = Calendar.getInstance();
        
        calendarBegin.setTime(stringToDate(beginDate));
        calendarEnd.setTime(stringToDate(endDate));
        
        int diffYears = 0;
        int diffMonths = 0;
        int diffDays = 0;
        int dayOfBirth = calendarBegin.get(Calendar.DAY_OF_MONTH);
        int dayOfNow = calendarEnd.get(Calendar.DAY_OF_MONTH);
        if (dayOfBirth <= dayOfNow)
        {
            diffMonths = getMonthsOfAge(calendarBegin, calendarEnd);
            diffDays = dayOfNow - dayOfBirth;
            if (diffMonths == 0)
                diffDays++;
        }
        else
        {
            if (isEndOfMonth(calendarBegin))
            {
                if (isEndOfMonth(calendarEnd))
                {
                    diffMonths = getMonthsOfAge(calendarBegin, calendarEnd);
                    diffDays = 0;
                }
                else
                {
                    calendarEnd.add(Calendar.MONTH, -1);
                    diffMonths = getMonthsOfAge(calendarBegin, calendarEnd);
                    diffDays = dayOfNow + 1;
                }
            }
            else
            {
                if (isEndOfMonth(calendarEnd))
                {
                    diffMonths = getMonthsOfAge(calendarBegin, calendarEnd);
                    diffDays = 0;
                }
                else
                {
                    calendarEnd.add(Calendar.MONTH, -1);// �ϸ���
                    diffMonths = getMonthsOfAge(calendarBegin, calendarEnd);
                    // ��ȡ�ϸ�������һ��
                    int maxDayOfLastMonth = calendarEnd.getActualMaximum(Calendar.DAY_OF_MONTH);
                    if (maxDayOfLastMonth > dayOfBirth)
                    {
                        diffDays = maxDayOfLastMonth - dayOfBirth + dayOfNow;
                    }
                    else
                    {
                        diffDays = dayOfNow;
                    }
                }
            }
        }
        // �����·�ʱ��û�п�����
        diffYears = diffMonths / 12;
        diffMonths = diffMonths % 12;
        return new int[] {diffYears, diffMonths, diffDays};
    } 
    
    /**
     * �ж���һ���Ƿ����µ�
     * 
     * @param calendar
     * @return
     */
    public static boolean isEndOfMonth(Calendar calendar)
    {
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        if (dayOfMonth == calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
            return true;
        return false;
    } 
    
    /**
     * ��ȡ�����������·�֮��
     * 
     * @param calendarBirth
     * @param calendarNow
     * @return
     */
    public static int getMonthsOfAge(Calendar calendarBirth, Calendar calendarNow)
    {
        return (calendarNow.get(Calendar.YEAR) - calendarBirth.get(Calendar.YEAR)) * 12
            + calendarNow.get(Calendar.MONTH) - calendarBirth.get(Calendar.MONTH);
    } 
    
    /**
     * ָ�����ڼ��������������
     * @param num Ϊ���ӵ�����
     * @param newDate ����ʱ��
     * @return
     * @throws ParseException 
     */
    public static String plusDay(String s, int num)
    {
        try
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // ���ڸ�ʽ
            Date date = dateFormat.parse(s); // ָ������
            long time = date.getTime(); // �õ�ָ�����ڵĺ�����
            long day = num*24*60*60*1000; // Ҫ���ϵ�����ת���ɺ�����
            time+=day; // ��ӵõ��µĺ�����
            return DateToString(new Date(time)); // ��������ת��������
        }
        catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
	
}
