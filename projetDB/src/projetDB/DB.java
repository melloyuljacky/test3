package projetDB;

import java.sql.*;


public class DB {
	
	
	static void insert(int id, String nom, String prenom) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbahmed", "root", "root");
		Statement st = conn.createStatement();
		String sql = "insert into personnes values(" + id + ",'" + nom + "','" + prenom + "')";
		// System.out.println(sql);
		st.executeUpdate(sql);
		conn.close();
	}
	
	
	//requete parametree / requete prepare
	static void insertv2(int id, String nom, String prenom) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbahmed", "root", "root");
		String sql = "insert into personnes values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, nom);
		ps.setString(3, prenom);
	
		ps.executeUpdate();
		conn.close();
	}

	static String selectAll() throws Exception {
		String reponse = "ID\tNOM\tPRENOM\n";

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbahmed", "root", "root");
		Statement st = conn.createStatement();
		String sql = "select * from personnes";
		ResultSet rs = st.executeQuery(sql);

		while (rs.next() == true) {
			reponse += rs.getInt("id") + "\t";
			reponse += rs.getString("nom") + "\t";
			reponse += rs.getString("prenom") + "\n";

		}

		conn.close();
		return reponse;

	}

}
