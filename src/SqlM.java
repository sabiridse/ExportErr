/*  1:   */ import java.io.PrintStream;
/*  2:   */ import java.sql.Connection;
/*  3:   */ import java.sql.DriverManager;
/*  4:   */ import java.sql.ResultSet;
/*  5:   */ import java.sql.SQLException;
/*  6:   */ import java.sql.Statement;
/*  7:   */ 
/*  8:   */ public class SqlM
/*  9:   */ {
/* 10:   */   private static final String url = "jdbc:mysql://mysql.hostinger.ru/u518089419";
/* 11:   */   private static final String user = "u518089419_ribas";
/* 12:   */   private static final String password = "8simvolov";
/* 13:   */   private static Connection con;
/* 14:   */   private static Statement stmt;
/* 15:   */   private static ResultSet rs;
/* 16:   */   
/* 17:   */   public static void main(String[] args)
/* 18:   */   {
/* 19:21 */     String query = "select count(*) from books";
/* 20:   */     try
/* 21:   */     {
/* 22:25 */       con = DriverManager.getConnection("jdbc:mysql://mysql.hostinger.ru/u518089419", "u518089419_ribas", "8simvolov");
/* 23:   */       
/* 24:   */ 
/* 25:28 */       stmt = con.createStatement();
/* 26:   */       
/* 27:   */ 
/* 28:31 */       rs = stmt.executeQuery(query);
/* 29:33 */       while (rs.next())
/* 30:   */       {
/* 31:34 */         int count = rs.getInt(1);
/* 32:35 */         System.out.println("Total number of books in the table : " + count);
/* 33:   */       }
/* 34:   */     }
/* 35:   */     catch (SQLException sqlEx)
/* 36:   */     {
/* 37:39 */       sqlEx.printStackTrace();
/* 38:   */       try
/* 39:   */       {
/* 40:42 */         con.close();
/* 41:   */       }
/* 42:   */       catch (SQLException localSQLException1) {}
/* 43:   */       try
/* 44:   */       {
/* 45:43 */         stmt.close();
/* 46:   */       }
/* 47:   */       catch (SQLException localSQLException2) {}
/* 48:   */       try
/* 49:   */       {
/* 50:44 */         rs.close();
/* 51:   */       }
/* 52:   */       catch (SQLException localSQLException3) {}
/* 53:   */     }
/* 54:   */     finally
/* 55:   */     {
/* 56:   */       try
/* 57:   */       {
/* 58:42 */         con.close();
/* 59:   */       }
/* 60:   */       catch (SQLException localSQLException4) {}
/* 61:   */       try
/* 62:   */       {
/* 63:43 */         stmt.close();
/* 64:   */       }
/* 65:   */       catch (SQLException localSQLException5) {}
/* 66:   */       try
/* 67:   */       {
/* 68:44 */         rs.close();
/* 69:   */       }
/* 70:   */       catch (SQLException localSQLException6) {}
/* 71:   */     }
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Users\ывожпл\Downloads\ExpoErrold\ExpoErrold\EXport\
 * Qualified Name:     SqlM
 * JD-Core Version:    0.7.0.1
 */