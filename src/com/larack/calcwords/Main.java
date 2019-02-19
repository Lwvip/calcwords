package com.larack.calcwords;

import java.io.IOException;

/**
 * 
 * @author larack
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {

		testCalcWords();
	}

	public static void testCalcWords() throws IOException {

//		String fromFilePath = "/Users/larack/Downloads/tt";

		String fromFilePath = "/Users/larack/Downloads/top100_2";
		String resultFilePath = "result.txt";
		String fromFileFormat = ".wxss";

		long start = System.currentTimeMillis();
		WordsManager wm = new WordsManager(fromFilePath, fromFileFormat, resultFilePath,
				PartenUtils.PARTEN_WXSS_PROPERTY, null);
		wm.calc();

		long end = System.currentTimeMillis();

		System.out.println("统计字符花费时间：" + (end - start) / 1000.0 + "秒");

	}

}
