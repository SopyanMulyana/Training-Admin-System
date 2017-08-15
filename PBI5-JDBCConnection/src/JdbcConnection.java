import java.sql.* ;
import java.math.* ;

public class JdbcConnection {

	public static void main(String[] args) {
		String connectionUrl = "jdbc:sqlserver://jptrainingsql:1433;" +  
		         "databaseName=TAS_Spiderman;user=spiderman;password=t4rikecaK";
		
		Connection con = null;  
		Statement stmt = null;  
		ResultSet rs = null;  

		try {  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl);  
			
			System.out.println("Connected!");
		}  

		catch (Exception e) {  
			e.printStackTrace();
		}  
		finally {
			if (rs != null) {
				try { 
					rs.close(); 
				} catch(Exception e) {}  
			}
			if (stmt != null) {
				try { 
					stmt.close(); 
				} catch(Exception e) {}  
			}
			if (con != null) {
				try { 
					con.close();
					System.out.println("Connection closed");
				} catch(Exception e) {}  
			}
		}  
	}
	
}