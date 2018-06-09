package com.zhangp.tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;


/**
 * 
 * @author zhangp
 *
 */
public class SysUtil {

	private final String[] CHARS = new String[] { "a", "b", "c", "d", "e", "f",
			"g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
			"W", "X", "Y", "Z" };
	
	private final String DATEFORMAT_PATTERN_US = "dd-MMM-yyyy";
	
	private final String DATEFORMAT_PATTERN = "yyyy-MM-dd";
	
	private final String DATEFORMAT_PATTERN_TIME = "yyyy-MM-dd HH:mm:ss";
	
	private final DateFormat DATEFORMAT_US = new SimpleDateFormat(DATEFORMAT_PATTERN_US, Locale.US);
	
	private final DateFormat DATEFORMAT = new SimpleDateFormat(DATEFORMAT_PATTERN, Locale.CHINA);
	
	private final DateFormat DATEFORMAT_TIME = new SimpleDateFormat(DATEFORMAT_PATTERN_TIME, Locale.CHINA);

	/**
	 * 生成8位UUID
	 * @return
	 */
	public String generateShortUuid() {

		StringBuffer shortBuffer = new StringBuffer();

		String uuid = UUID.randomUUID().toString().replace("-", "");

		for (int i = 0; i < 8; i++) {

			String str = uuid.substring(i * 4, i * 4 + 4);

			int x = Integer.parseInt(str, 16);

			shortBuffer.append(CHARS[x % 0x3E]);

		}

		return shortBuffer.toString();

	}
	
	/**
	 * 中制时间转long型
	 * @param dateStr "yyyy-MM-dd" example "2015-4-23"
	 * @return 1429718400000
	 * @throws ParseException
	 */
	public Long parseDateStr2Long(String dateStr){
		
		try {
			
			Date date = DATEFORMAT.parse(dateStr);
			
			return date.getTime();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;
		}
		
	}
	
	/**
	 * 中制时间转long型
	 * @param dateStr "yyyy-MM-dd" example "2015-4-23  23:59:59"
	 * @return 1429804799000
	 * @throws ParseException
	 */
	public Long parseTimeStr2Long(String dateStr){
		
		try {
			
			Date date = DATEFORMAT_TIME.parse(dateStr);
			
			return date.getTime();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;
		}
		
	}
	
	
	/**
	 * 中制时间转美制时间
	 * @param dateStr "yyyy-MM-dd" example "2015-4-23"
	 * @return "dd-MMM-yyyy" example "23-Apr-2015"
	 * @throws ParseException
	 */
	public String parseDateStrUS(String dateStr){
		
		try {
			
			return DATEFORMAT_US.format(DATEFORMAT.parse(dateStr));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;
			
		}
		
	}
	
	
	
	public static void main(String[] args) throws ParseException {
		SysUtil sysUtil = new SysUtil();
		
		System.out.println(sysUtil.parseDateStrUS("2015-4-23"));
		
		System.out.println(sysUtil.parseTimeStr2Long("2015-4-23 23:59:59"));
	}

}
