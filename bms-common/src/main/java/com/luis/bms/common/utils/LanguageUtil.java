package com.luis.bms.common.utils;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.util.StringUtils;

public class LanguageUtil {

	static Locale defaultlLocale = Locale.CHINA;
	// static Locale defaultlLocale = Locale.US;

	public static String getValue(String code) {
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		if (null == defaultlLocale) {
			defaultlLocale = LocaleContextHolder.getLocale();
		}
		ResourceBundle bundle = ResourceBundle.getBundle("language.message", defaultlLocale);
		return bundle.getString(code);
	}

	public static void main(String[] args) {
		System.out.println(getValue("00000000"));
	}

}
