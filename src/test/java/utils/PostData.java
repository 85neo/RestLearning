package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class PostData {

	
	public static String pName() {
		
		String getName = "john" + RandomStringUtils.randomAlphabetic(3);
		System.out.println(getName);
		return getName;
	}
	
	public static String pJob() {
		
		String getJob = "leader" + RandomStringUtils.randomAlphabetic(3);
		System.out.println(getJob);
		return getJob;
	}
}
