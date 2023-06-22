package com.zerocell;

import com.creditdatamw.zerocell.converter.Converter;

public class StringToIntegerConvert implements Converter<Integer>{

	@Override
	public Integer convert(String value, String s1, int i) {
		// TODO Auto-generated method stub
		return Integer.parseInt(value);
	}

}
