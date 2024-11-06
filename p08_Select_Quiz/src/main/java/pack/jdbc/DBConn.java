package pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConn { // DAO
	
	private String url= "jdbc:mysql://localhost:3306/sampleData?"
					 + "useSSL=false&"
					 + "useUnicode=true&"
					 + "characterEncoding=UTF8&"
					 + 	"serverTimezone=UTC&"
					 + "allowPublicKeyRetrieval=true";
	//DB 접속 설정
	
	private String uid = "root";
	private String pwd = "1234";
	
	public List<DataBean> getGoodslist(){
		List<DataBean> goodsList = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,uid,pwd);
		stmt = conn.createStatement();
		
		String sql ="select num, goodsCode, goodsName, price,  cnt ";
			   sql += "from goodsList ";
			   sql += "order by num desc";
			   rs = stmt.executeQuery(sql);
			 
	   while(rs.next()) {
				DataBean data = new DataBean();
				data.setNum(rs.getInt("num"));
				data.setGoodsCode(rs.getString("goodsCode"));
				data.setGoodsName(rs.getString("goodsName"));
				data.setPrice(rs.getInt("price"));
				data.setCount(rs.getInt("cnt"));
				goodsList.add(data);
			   } 
	}catch(ClassNotFoundException e) {
					System.out.print(e.getMessage());
			   } catch(SQLException e) {
			   	System.out.print(e.getMessage());
			   } 
		        
				
		return goodsList;
}
}