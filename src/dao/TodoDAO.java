package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import dto.TodoDTO;

public class TodoDAO {
	private static String dburl = "jdbc:mysql://localhost:3306/tododb?serverTimezone=UTC";
	private static String dbUser = "connectuser";
	private static String dbPw = "connect123!@#";
	

	public ArrayList<TodoDTO> getTodos() {
		ArrayList<TodoDTO> todos = new ArrayList<TodoDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbPw);
			String sql = "select * from todo where type = 'todo'";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				long id = rs.getLong(1);
				String title = rs.getString(2);
				String name = rs.getString("name");
				int seq = rs.getInt("sequence");
				String type = rs.getString("type");
				Timestamp regDate = rs.getTimestamp("regdate");
				
				todos.add(new TodoDTO(id, title, name, seq, type, regDate));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return todos;
	}
	public ArrayList<TodoDTO> getDoings() {
		ArrayList<TodoDTO> doings = new ArrayList<TodoDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbPw);
			String sql = "select * from todo where type = 'doing'";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				long id = rs.getLong(1);
				String title = rs.getString(2);
				String name = rs.getString("name");
				int seq = rs.getInt("sequence");
				String type = rs.getString("type");
				Timestamp regDate = rs.getTimestamp("regdate");
				
				doings.add(new TodoDTO(id, title, name, seq, type, regDate));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return doings;
	}
	public ArrayList<TodoDTO> getDones() {
		ArrayList<TodoDTO> dones = new ArrayList<TodoDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbPw);
			String sql = "select * from todo where type = 'done'";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				long id = rs.getLong(1);
				String title = rs.getString(2);
				String name = rs.getString("name");
				int seq = rs.getInt("sequence");
				String type = rs.getString("type");
				Timestamp regDate = rs.getTimestamp("regdate");
				
				dones.add(new TodoDTO(id, title, name, seq, type, regDate));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return dones;
	}

	
}
