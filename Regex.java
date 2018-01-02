package cn.com.yimoyidao.net.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
public static List<List<String>> extract(String regex,CharSequence input){
	Pattern pattern=Pattern.compile(regex);
	Matcher m=pattern.matcher(input);
	List<List<String>> result=new ArrayList<>();
	while (m.find()) {
		List<String> x=new ArrayList<>();
	for (int i = 0; i <= m.groupCount(); i++) {
		x.add(m.group(i));
	}
	result.add(x);
	}
	return result;
}
public static String extractOne(String regex,CharSequence input){
	return extractOne(regex, input,0);
}
public static String extractOne(String regex,CharSequence input,int group){
	Pattern pattern=Pattern.compile(regex);
	Matcher m=pattern.matcher(input);
	if (m.find()) {
		return m.group(group);
	}
	return "";
}

}
