package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 연결에 대한 정보를 가진 객체
public class DBConnecter {
   public static Connection getConnect() {
      Connection connection = null;
      
//      연결에 필요한 정보
      String userName = "hr";
      String password = "1234";
      String url = "jdbc:oracle:thin:@localhost:1521:XE";
      
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         connection = DriverManager.getConnection(url, userName, password);
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버 로딩 실패");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("연결 정보 오류");
         e.printStackTrace();
      }
      return connection;
   }
}
