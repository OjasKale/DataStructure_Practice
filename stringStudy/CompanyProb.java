package stringStudy;

import java.io.File;
import java.nio.file.Files;

public class CompanyProb {
	
	public static void main(String[] args) throws Exception {
		tryIt();
	}
	public static void tryIt() throws Exception {
		File file = new File("/etc/ssl/cert.pem");

		byte[] fileArr = Files.readAllBytes(file.toPath());
		System.out.println(fileArr);
		String s = "ojaskale";
		
	}
	

}
