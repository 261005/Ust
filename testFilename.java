package webdrivertest;

import utils.fileNameMaker;

public class testFilename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		fileNameMaker fn = new fileNameMaker();
		String currfilename = fn.fileNameForLogin("abc", "def");
		
		System.out.println(currfilename);
		

	}


}
