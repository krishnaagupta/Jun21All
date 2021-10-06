package Pagefactory1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;

import Base.BasePage;
import Utils.CommonUtils;

public class PageFactory {
	static CommonUtils common = new CommonUtils();

	static final HashMap<String, String> packageClassMap = new HashMap<String, String>();

	public static String getPackage() throws IOException {
		String packageName= common.getApplicationProperty("page.packages");
		return packageName;
	}




	public BasePage initialize(String pageName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		System.out.println("pagename-"+pageName);
		BasePage page = null;
		
		String packagename1= getPackage();
		String packagename=packagename1.replaceAll("\\s", "");
		System.out.println("package name"+packagename);
		String pageClassFullName = packagename + "."
				+ pageName;
		page = (BasePage) Class.forName(pageClassFullName)
				.newInstance();
		System.out.println("page->"+ page.getClass());
		return page;	
	}
//	static final HashMap<String, String> packageClassMap = new HashMap<String, String>();
//
//	static {
//		try {
//
//			getClassInPackage(new Utils.CommonUtils()
//					.getApplicationProperty("page.packages"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public BasePage initialize(String pageName) {
//		BasePage page = null;
//		String formattedPageName = getRemovedSpaceName(pageName);
//		try {
//			String packageName = packageClassMap.get(formattedPageName);
//			if (packageName != null) {
//				String pageClassFullName = packageName + "."
//						+ formattedPageName;
//				page = (BasePage) Class.forName(pageClassFullName)
//						.newInstance();
//			} else {
//				System.out.println("Page Class with" + formattedPageName
//						+ "doesnt exist .Please provide valid page Name");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return page;
//
//	}
//
//	private String getRemovedSpaceName(String pageName) {
//		return pageName.replaceAll("\\s+", "");
//	}
//
//	private static void getClassInPackage(String packageName) {
//
//		String classPath = packageName.replaceAll("\\.",
//				Matcher.quoteReplacement(File.separator));
//		String srcPath = System.getProperty("user.dir") + "\\src\\test\\java";
//		String[] classPathDirs = srcPath.split(System
//				.getProperty("path.separator"));
//		String name;
//
//		for (String classDir : classPathDirs) {
//			try {
//				File base = new File(classDir + File.separatorChar + classPath);
//				for (File file : base.listFiles()) {
//					if (!(file.getName().equalsIgnoreCase(".svn"))) {
//						if (file.isDirectory()
//								&& !(file.getName().equalsIgnoreCase("factory"))) {
//							getClassInPackage(packageName + "."
//									+ file.getName());
//						} else if (file.getName().contains(".java")) {
//							name = file.getName();
//							name = name.substring(0, name.lastIndexOf("."));
//							packageClassMap.put(name, packageName);
//						}
//					}
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}

}
