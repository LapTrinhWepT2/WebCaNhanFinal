package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import connect.DBConnect;
import model.Users;
public class UsersDAO {
	
	public boolean checkUsername(String username){
		Connection connection=DBConnect.getConnection();
		String sql="select * from user where UserName='"+username+"'";
		PreparedStatement ps;
		try{
			ps=connection.prepareCall(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				connection.close();
				return true;
			}
		} catch(SQLException ex){
			Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return false;
		
	}
	
	public Users login(String username, String password) {
		Connection con = DBConnect.getConnection();
		String sql = "select * from user where UserName='" + username + "' and Password='" + password + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Users u= new Users();
				u.setUsername(rs.getString("UserName"));
				u.setPassword(rs.getString("Password"));
				con.close();
				return u;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
