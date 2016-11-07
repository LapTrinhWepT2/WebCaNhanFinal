package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
				users.setEmail(rs.getString("Email"));
				users.setHovaten(rs.getString("HoVaTen"));
				con.close();
				return users;
			}
		}
		
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ArrayList<Users> getListUser() throws SQLException{
		Connection connection = DBConnect.getConnection();
		String sql="select * from user";
		PreparedStatement ps;
		ps = (PreparedStatement) connection.prepareStatement(sql);
		ResultSet rs= ps.executeQuery();
		ArrayList<Users> list = new ArrayList<>();
		while (rs.next()){
			Users users=new Users();
			users.setUsername(rs.getString("UserName"));
			users.setPassword(rs.getString("Password"));
			users.setHovaten(rs.getString("HoVaTen"));
			users.setDiachi(rs.getString("DiaChi"));
			users.setEmail(rs.getString("Email"));
			list.add(users);
		}
		return list;
	}
	
	public static void main(String[] args) throws SQLException{
		UsersDao dao=new UsersDao();
		for(Users ds: dao.getListUser()){
			System.out.println(ds.getUsername()+"-"+ds.getPassword()+"-"+ds.getEmail());
		}
	}
}

