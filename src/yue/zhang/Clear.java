package yue.zhang;

import java.io.File;

public class Clear {

//	public static void main(String[] args) {
//		String path = "E:\\maven\\mavenRepository";
//		loop(path);
//	}
	public static String loop(String path) {
		try {
			File file = new File(path);
			File[] files = file.listFiles();
			for(File f:files) {
				if(f.isDirectory()) {
					loop(f.getPath());
				}
				else if(f.isFile()){
					if(f.getName().substring(f.getName().lastIndexOf("."),f.getName().length()).equals(".lastUpdated")) {
//						System.out.println(f.getName()+"正在删除！");
						f.delete();
//						System.out.println("此项删除成功！");
					}
				}
			}
			return "路径内的LastUpdate文件删除完成！";
			
		}catch (Exception e) {
			return "路径可能不正确！请重新检测！";
		}
	}
	
}
