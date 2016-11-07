package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import connect.DBConnect;
import model.Users;

public class UsersDao {
	public Users login(String username, String password){
		Connection con = DBConnect.getConnection();
		String sql = "select * from user where UserName ='" +username + "' and Password ='" +password+ "'";
		PreparedStatement ps;
		
		try{
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				Users users = new Users();
				users.setUsername(rs.getString("UserName"));
				users.setPassword(rs.getString("Password"));
				con.close();
				return users;
			}
		}
		
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return null;
	}
}
