/*  1:   */ import java.io.File;
/*  2:   */ import java.io.FileInputStream;
/*  3:   */ import java.io.FileNotFoundException;
/*  4:   */ 
/*  5:   */ public class JExcel
/*  6:   */ {
/*  7:22 */   public static String path = new File("").getAbsolutePath();
/*  8:   */   public static String directory_res;
/*  9:26 */   static int unical_number = 0;
/* 10:   */   
/* 11:   */   public static void main(String[] args)
/* 12:   */     throws Exception
/* 13:   */   {
/* 14:32 */     directory_res = path + "//res//";
/* 15:   */     try
/* 16:   */     {
/* 17:34 */       FileInputStream localFileInputStream = new FileInputStream(directory_res + "bonus.csv");
/* 18:   */     }
				catch (FileNotFoundException e)
/* 20:   */     {
/* 21:36 */       directory_res = path + "//ExpoErr//res//";
/* 22:   */     }
/* 23:53 */     Gui1 gui1 = new Gui1();
/* 24:54 */     gui1.Gui2();//qqqqqqqqq
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Users\ывожпл\Downloads\ExpoErrold\ExpoErrold\EXport\
 * Qualified Name:     JExcel
 * JD-Core Version:    0.7.0.1
*/