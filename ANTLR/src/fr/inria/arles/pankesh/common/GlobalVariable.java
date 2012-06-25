package fr.inria.arles.pankesh.common;

public class GlobalVariable {

	public static String vocArchSpec;
	public static String networkSpec;
	public static String frameworkDirPath = "/framework";
	public static String outputDirPath = "./gen";
	public static String logicDirPath = "/logic";
	public static String deviceDirPath = "/sim/device";
	public static String utilDirPath = "/util";
	public static String stringTemplatePath;

	
	
	
	/*
	 * public static String convertPathTopackage(String pathName) {
	 * 
	 * return pathName.substring(pathName.lastIndexOf("/") + 1); }
	 */

	public static String convertPathTopackage(String pathName) {

		String modifiedPathName;

		if (pathName.substring(0, 1).equals(".")
				|| pathName.substring(0, 1).equals(".")) {
			modifiedPathName = pathName.substring(2).replace("/", ".");
		} else {
			modifiedPathName = pathName.replace("/", ".").substring(1);
		}

		return modifiedPathName;
	}

}
