package PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class StepsToReadPropertyFile {
	public static void main(String[] args) throws IOException {

	//with absolute path
	//String fileLocation="C:\\Users\\priyanka burse\\eclipse-workspace\\PracticeAgainJava\\PropertyFile\\TestData.properties";
	//String relative path=.\\PropertyFile\\TestData.properties;
	
	//create an instance of fileinputstream
	String HomeDir=System.getProperty("user.dir");
	System.out.println(HomeDir);
	String FL=HomeDir+"\\PropertyFile\\TestData.properties";

	FileInputStream fis=new FileInputStream(FL);
	Properties prop=new Properties();
	prop.load(fis);
	System.out.println(prop.getProperty("applicationURL"));
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
int A=Integer.parseInt(prop.getProperty("password"));
System.out.println(A);


	}
}
/**
 
1.find path of the property file.We can find it by3 different methods.
2.Make instance of FileInputStream and pass filelocation(property file location)to its constructor.
3.Now make Properties instance.
4.call load function by Properties instance and pass FileInputStrem instane to its parameter.
5.then use prop.getProperty("key")


*/