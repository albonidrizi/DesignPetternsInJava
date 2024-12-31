package BridgeDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *  *   @author Albon Idrizi https://www.linkedin.com/in/albonidrizi/
 *
 * @Bridge Pattern është një Structural Design Pattern që përdoret për të ndarë abstraksionin nga implementimi i saj,
 * duke i lejuar që të dyja të evoluojnë në mënyrë të pavarur. Ky model është i dobishëm kur duam të shmangim një
 * shpërthim të klasave si rezultat i shumë kombinimeve të abstraksionit dhe implementimit.
 *
 * Komponentët kryesorë të Bridge Pattern:
 * @1. Abstraction: Definon ndërfaqen e lartë që përdorin klientët dhe ruan një referencë për një implementim.
 * @2. Refined Abstraction: Zgjeron ndërfaqen bazë të abstraksionit.
 * @3. Implementor: Definon ndërfaqen për të gjitha klasat konkrete të implementimit.
 * @4. Concrete Implementor: Jep një implementim specifik të ndërfaqes së implementimit.
 * @5. Client: Përdor objektin e Abstraction për të bashkëvepruar me sistemin.
 * */

public class BridgeEverydayDemo {

	public static void main(String [] args) {
		try {
			//JDBC is an API
			Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/bridge", "sa", "");

			Statement sta = conn.createStatement(); 
			
			//This client is an abstraction and can work with any database that has a driver
			sta.executeUpdate("CREATE TABLE Address (ID INT, STREET_NAME VARCHAR(20), CITY VARCHAR(20))");
			
			System.out.println("Table created");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
