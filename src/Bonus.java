/*   1:    */ import java.io.BufferedReader;
/*   2:    */ import java.io.FileInputStream;
/*   3:    */ import java.io.FileOutputStream;
/*   4:    */ import java.io.FileReader;
/*   5:    */ import java.io.IOException;
/*   6:    */ import java.text.SimpleDateFormat;
/*   7:    */ import java.util.ArrayList;
/*   8:    */ import java.util.Iterator;
/*   9:    */ import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/*  10:    */ import org.apache.poi.ss.usermodel.Cell;
/*  11:    */ import org.apache.poi.ss.usermodel.Row;
/*  12:    */ import org.apache.poi.ss.usermodel.Sheet;
/*  13:    */ import org.apache.poi.ss.usermodel.Workbook;
/*  14:    */ 
/*  15:    */ public class Bonus
/*  16:    */ {
/*  17:    */   int size_arr_bonus;
/*  18: 24 */   String numb_term_bonus = "101483";
/*  19:    */   Row row;
/*  20:    */   Cell cell0;
/*  21:    */   static Sheet bpt_sheet;
/*  22:    */   Workbook bonus_book;
/*  23:    */   Sheet bonus_sheet;
/*  24:    */   static int rows_in_bonus;
/*  25:    */   public ArrayList<String> number_term_bonus_arr;
/*  26:    */   
/*  27:    */   public void open_csv_bonus()
/*  28:    */     throws IOException
/*  29:    */   {
/*  30: 37 */     BufferedReader br = new BufferedReader(new FileReader(JExcel.directory_res + "bonus.csv"));
/*  31:    */     
/*  32: 39 */     String ln = "";
/*  33:    */     
/*  34:    */ 
/*  35: 42 */     this.number_term_bonus_arr = new ArrayList();
/*  36:    */     
/*  37: 44 */     Bonus bonus = new Bonus();
/*  38:    */     
/*  39: 46 */     bonus.read_bonus(br);
/*  40: 50 */     while ((ln = bonus.numb_term_bonus) != null)
/*  41:    */     {
/*  42: 53 */       this.number_term_bonus_arr.add(bonus.numb_term_bonus);
/*  43:    */       
/*  44:    */ 
/*  45:    */ 
/*  46: 57 */       bonus.read_bonus(br);
/*  47:    */     }
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void read_bonus(BufferedReader br)
/*  51:    */     throws IOException
/*  52:    */   {
/*  53: 66 */     this.numb_term_bonus = br.readLine();
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void open_bonus()
/*  57:    */     throws IOException
/*  58:    */   {
/*  59: 80 */     rows_in_bonus = 0;
/*  60:    */     
/*  61: 82 */     FileInputStream bonus_file = new FileInputStream(JExcel.directory_res + "bonus.xls");
/*  62: 83 */     this.bonus_book = new HSSFWorkbook(bonus_file);
/*  63: 84 */     this.bonus_sheet = this.bonus_book.getSheetAt(0);
/*  64:    */     
/*  65:    */ 
/*  66: 87 */     Iterator<Row> iterator_bonus = this.bonus_sheet.iterator();
/*  67: 88 */     while (iterator_bonus.hasNext())
/*  68:    */     {
/*  69: 89 */       Row row_bonus = (Row)iterator_bonus.next();
/*  70: 90 */       rows_in_bonus += 1;
/*  71:    */     }
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void write_bonus(String bonus_number_terminal)
/*  75:    */   {
/*  76: 99 */     SimpleDateFormat format1 = new SimpleDateFormat();
/*  77:100 */     long curTime = System.currentTimeMillis();
/*  78:101 */     String curStringDate = new SimpleDateFormat("dd.MM HH:mm").format(Long.valueOf(curTime - 864000000L));
/*  79:    */     
/*  80:    */ 
/*  81:104 */     this.row = this.bonus_sheet.createRow(rows_in_bonus);
/*  82:    */     
/*  83:    */ 
/*  84:107 */     this.cell0 = this.row.createCell(0);
/*  85:108 */     this.cell0.setCellValue(bonus_number_terminal);
/*  86:109 */     this.cell0 = this.row.createCell(1);
/*  87:110 */     this.cell0.setCellValue(curStringDate);
/*  88:111 */     this.cell0 = this.row.createCell(2);
/*  89:112 */     this.cell0.setCellValue(curStringDate);
/*  90:113 */     this.cell0 = this.row.createCell(3);
/*  91:114 */     this.cell0.setCellValue("OK");
/*  92:115 */     this.cell0 = this.row.createCell(4);
/*  93:116 */     this.cell0.setCellValue("OK");
/*  94:117 */     this.cell0 = this.row.createCell(5);
/*  95:118 */     this.cell0.setCellValue("OK");
/*  96:    */     
/*  97:120 */     Gui1 gui1 = new Gui1();
/*  98:121 */     String txt = "<html><center>Терминал " + bonus_number_terminal + " добавлен</html>";
/*  99:122 */     gui1.Gui0(txt);
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void close_bonus()
/* 103:    */     throws IOException
/* 104:    */   {
/* 105:131 */     FileOutputStream fos = new FileOutputStream(JExcel.directory_res + "bonus.xls");
/* 106:132 */     this.bonus_book.write(fos);
/* 107:133 */     fos.close();
/* 108:    */   }
/* 109:    */ }


/* Location:           C:\Users\ывожпл\Downloads\ExpoErrold\ExpoErrold\EXport\
 * Qualified Name:     Bonus
 * JD-Core Version:    0.7.0.1
 */