package DecoratorDesignPattern;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;


/**
 * @author:  Albon Idrizi https://www.linkedin.com/in/albonidrizi/
 * @Decorator: është një Structural Design Pattern që përdoret për të shtuar funksionalitete në mënyrë dinamike pa ndryshuar strukturën ekzistuese.
 *
 * @Struktura:
 * @1. Component: Ndërfaqja bazë.
 * @2. ConcreteComponent: Implementimi bazë.
 * @3. Decorator: Shton funksionalitet.
 * @4. ConcreteDecorator: Implementon funksionalitete specifike.
 * */
public class DecoratorEverydayDemo {

	public static void main(String[] args) throws Exception {
		File file = new File("./output.txt");
		boolean wasCreated = file.createNewFile();
		
		OutputStream oStream = new FileOutputStream(file,true);
		
		DataOutputStream doStream = new DataOutputStream(oStream);
		doStream.writeChars("Some text");
		
		doStream.close();
		oStream.close();
	}
}
