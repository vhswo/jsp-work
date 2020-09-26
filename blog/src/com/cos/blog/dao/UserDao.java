package com.cos.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cos.blog.config.DBConn;
import com.cos.blog.model.User;

public class UserDao {
	
	public User 로그인(User user) {
		String sql = "SELECT id, username, email, address FROM user WHERE username=? AND password=? ";
		Connection conn = DBConn.getInstance();
		try {
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			User userEntity = new User(
					rs.getInt("id"),
					rs.getString("username"),
					rs.getString("email"),
					rs.getString("address")
					);
					return userEntity;
		}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public int 회원가입(User user) {
		// 1. 회원가입 진행(Insert), Model로 이동 
		String sql = "INSERT INTO user(username,password,email,address,createDate) VALUES(?,?,?,?,now())";
		Connection conn = DBConn.getInstance();
		try {
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getEmail());
		pstmt.setString(4, user.getAddress());
		
		return pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int 회원수정(User user) {
		String sql = "UPDATE user SET username=?, password = ?, email = ?, address =?, createDate = now() where id =?";
		Connection conn = DBConn.getInstance();
		try {
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getEmail());
		pstmt.setString(4, user.getAddress());
		pstmt.setInt(5, user.getId());
		
		return pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
}
