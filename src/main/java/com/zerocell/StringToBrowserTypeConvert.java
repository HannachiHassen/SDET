package com.zerocell;

import com.creditdatamw.zerocell.converter.Converter;

import utils.BrowserType;

public final class StringToBrowserTypeConvert implements Converter<BrowserType>{

	@Override
	public BrowserType convert(String s, String s1, int i) {
		return BrowserType.valueOf(s.toUpperCase());
	}

}
