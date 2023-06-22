package com.zerocell;

import java.time.LocalDate;
import com.creditdatamw.zerocell.annotation.Column;

import lombok.Getter;
import utils.BrowserType;

@Getter
public final class TestData {

	@Column(name = "testcase", index = 0)
	private String testcase;

	@Column(name = "testcase", index = 1, converterClass = StringToBrowserTypeConvert.class)
	private BrowserType browser;

	@Column(name = "firstname", index = 2)
	private String firstname;

	@Column(name = "isFTE", index = 3, converterClass = StringToBooleanConvert.class)
	private boolean isFTE;

	@Column(name = "age", index = 4, converterClass = StringToIntegerConvert.class)
	private int age;

	@Column(name = "date", index = 5, converterClass = StringToLocalDateConvert.class)
	private LocalDate date;

	@Column(name = "phonenumber", index = 6, converterClass = PhoneNumberProcessor.class)
	private String phonenumber;

	@Override
	public String toString() {
		return "TestData ["+ 
				"testcase=" + testcase + 
				", browser=" + browser + 
				", firstname=" + firstname + 
				", isFTE=" + isFTE + 
				", age=" + age + 
				", date=" + date + 
				", phonenumber=" + phonenumber + 
				"]";
	}
}
