/*  1:   */ import java.io.FileInputStream;
/*  2:   */ import java.io.IOException;
/*  3:   */ import java.util.Iterator;
/*  4:   */ import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/*  5:   */ import org.apache.poi.ss.usermodel.Cell;
/*  6:   */ import org.apache.poi.ss.usermodel.Row;
/*  7:   */ import org.apache.poi.ss.usermodel.Sheet;
/*  8:   */ import org.apache.poi.ss.usermodel.Workbook;
/*  9:   */ 
/* 10:   */ public class TextFild
/* 11:   */ {
/* 12:   */   static Sheet bpt_sheet;
/* 13:   */   String number_term_in_bpt;
/* 14:20 */   String find_number = "Не найден";
/* 15:21 */   String name_term_in_bpt = "Не найден";
/* 16:   */   
/* 17:   */   public void read(String find_number_terminal)
/* 18:   */     throws IOException
/* 19:   */   {
/* 20:27 */     Gui1 gui1 = new Gui1();
/* 21:   */     
/* 22:29 */     int rows_in_bpt = 0;
/* 23:   */     
/* 24:   */ 
/* 25:32 */     int f_nt = 0;
/* 26:   */     try
/* 27:   */     {
/* 28:36 */       f_nt = Integer.parseInt(find_number_terminal);
/* 29:   */     }
/* 30:   */     catch (NumberFormatException e)
/* 31:   */     {
/* 32:38 */       String txt = "<html><center>Недопустимый ввод</html>";
/* 33:39 */       gui1.Gui0(txt);
/* 34:   */     }
/* 35:47 */     FileInputStream bpt_file = new FileInputStream(JExcel.directory_res + "bpt.xls");
/* 36:48 */     Workbook bpt_book = new HSSFWorkbook(bpt_file);
/* 37:49 */     bpt_sheet = bpt_book.getSheetAt(0);
/* 38:   */     
/* 39:   */ 
/* 40:   */ 
/* 41:   */ 
/* 42:   */ 
/* 43:   */ 
/* 44:56 */     Iterator<Row> iterator_bpt = bpt_sheet.iterator();
/* 45:57 */     while (iterator_bpt.hasNext())
/* 46:   */     {
/* 47:58 */       Row row_bpt = (Row)iterator_bpt.next();
/* 48:59 */       rows_in_bpt++;
/* 49:   */     }
/* 50:62 */     for (int i = 0; i < rows_in_bpt; i++)
/* 51:   */     {
/* 52:64 */       Row row = bpt_sheet.getRow(i);
/* 53:   */       
/* 54:66 */       this.number_term_in_bpt = row.getCell(0).getStringCellValue();
/* 55:67 */       int nt_bpt = Integer.parseInt(this.number_term_in_bpt);
/* 56:71 */       if (nt_bpt == f_nt)
/* 57:   */       {
/* 58:74 */         this.name_term_in_bpt = row.getCell(1).getStringCellValue();
/* 59:75 */         this.find_number = row.getCell(2).getStringCellValue();
/* 60:   */       }
/* 61:   */     }
/* 62:   */   }
/* 63:   */ }


/* Location:           C:\Users\ывожпл\Downloads\ExpoErrold\ExpoErrold\EXport\
 * Qualified Name:     TextFild
 * JD-Core Version:    0.7.0.1
 */