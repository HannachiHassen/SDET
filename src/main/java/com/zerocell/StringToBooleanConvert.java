package com.zerocell;

import com.creditdatamw.zerocell.converter.Converter;

public class StringToBooleanConvert implements Converter<Boolean>{

	@Override
	public Boolean convert(String value, String columnName, int rownumber) {
		// TODO Auto-generated method stub
		return value.equalsIgnoreCase("true");
	}

}
