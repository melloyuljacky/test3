package projetDB;

import java.sql.*;

public class Test {

	public static void main(String[] args) throws Exception {
		testSelectAll();
	}

	static void testSelectAll() throws Exception {
		System.out.println(DB.selectAll());
	}

	static void testInsert() throws Exception {
		DB.insert(15, "Dupond", "a");
		DB.insert(16, "Dupond", "b");
	}

	

	


}
