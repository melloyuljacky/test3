package projetDB;

import java.sql.*;

public class Test {

	public static void main(String[] args) throws Exception {
		testSelectAll();
		System.out.println("v1");
		System.out.println("v2");
		System.out.println("v3");
	}

	static void testSelectAll() throws Exception {
		System.out.println(DB.selectAll());
	}

	static void testInsert() throws Exception {
		DB.insert(15, "Dupond", "a");
		DB.insert(16, "Dupond", "b");
	}

	

	


}
