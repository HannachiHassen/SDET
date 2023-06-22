package com.zerocell;

import java.io.File;
import java.util.List;

import com.creditdatamw.zerocell.Reader;

public class Runner {
	public static void main(String[] args) {
		List<TestData> testdatas = Reader.of(TestData.class)
                .from(new File("testdata.xlsx"))
                .sheet("Sheet1")
                .skipHeaderRow(true)
                .list();

        testdatas.forEach(System.out::println);
	}
}
