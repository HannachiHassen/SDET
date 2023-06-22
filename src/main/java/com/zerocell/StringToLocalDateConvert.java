package com.zerocell;

import java.time.LocalDate;

import com.creditdatamw.zerocell.converter.Converter;

public class StringToLocalDateConvert implements Converter<LocalDate>{

	@Override
	public LocalDate convert(String value, String s1, int i) {
		return LocalDate.now();
	}

}
