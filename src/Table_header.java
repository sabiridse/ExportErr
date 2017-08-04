/*   1:    */ import java.io.FileOutputStream;
/*   2:    */ import java.io.IOException;
/*   3:    */ import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/*   4:    */ import org.apache.poi.ss.usermodel.Cell;
/*   5:    */ import org.apache.poi.ss.usermodel.Row;
/*   6:    */ import org.apache.poi.ss.usermodel.Sheet;
/*   7:    */ import org.apache.poi.ss.usermodel.Workbook;
/*   8:    */ 
/*   9:    */ public class Table_header
/*  10:    */ {
/*  11: 12 */   Workbook export_errors = new HSSFWorkbook();
/*  12: 13 */   Sheet sheet1_export = this.export_errors.createSheet("ОСМП");
/*  13:    */   Row row1;
/*  14:    */   Cell cell;
/*  15:    */   Cell cell2;
/*  16:    */   Cell cell3;
/*  17:    */   Cell cell4;
/*  18:    */   Cell cell6;
/*  19:    */   
/*  20:    */   public Table_header()
/*  21:    */   {
/*  22: 24 */     this.export_errors = new HSSFWorkbook();
/*  23: 25 */     this.sheet1_export = this.export_errors.createSheet("ОСМП");
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void Sheet_OCMP()
/*  27:    */     throws IOException
/*  28:    */   {
/*  29: 33 */     Row row0 = this.sheet1_export.createRow(0);
/*  30:    */     
/*  31: 35 */     Cell cell0 = row0.createCell(0);
/*  32: 36 */     cell0.setCellValue("Номер точки");
/*  33:    */     
/*  34: 38 */     Cell cell1 = row0.createCell(1);
/*  35: 39 */     cell1.setCellValue("Последнее соединение (время)");
/*  36:    */     
/*  37: 41 */     Cell cell2 = row0.createCell(2);
/*  38: 42 */     cell2.setCellValue("Последний платеж (время)");
/*  39:    */     
/*  40: 44 */     Cell cell3 = row0.createCell(3);
/*  41: 45 */     cell3.setCellValue("Статус купюроприемника");
/*  42:    */     
/*  43: 47 */     Cell cell4 = row0.createCell(4);
/*  44: 48 */     cell4.setCellValue("Статус принтера");
/*  45:    */     
/*  46: 50 */     Cell cell5 = row0.createCell(5);
/*  47: 51 */     cell5.setCellValue("Статус тачскрина");
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void Sheet_Pir()
/*  51:    */     throws IOException
/*  52:    */   {
/*  53: 59 */     Sheet sheet2_export = this.export_errors.createSheet("Пир");
/*  54:    */     
/*  55: 61 */     Row row0 = sheet2_export.createRow(0);
/*  56:    */     
/*  57: 63 */     Cell cell0 = row0.createCell(0);
/*  58: 64 */     cell0.setCellValue("Номер точки");
/*  59:    */     
/*  60: 66 */     Cell cell1 = row0.createCell(1);
/*  61: 67 */     cell1.setCellValue("Последнее соединение (время)");
/*  62:    */     
/*  63: 69 */     Cell cell2 = row0.createCell(2);
/*  64: 70 */     cell2.setCellValue("Последний платеж (время)");
/*  65:    */     
/*  66: 72 */     Cell cell3 = row0.createCell(3);
/*  67: 73 */     cell3.setCellValue("Статус купюроприемника");
/*  68:    */     
/*  69: 75 */     Cell cell4 = row0.createCell(4);
/*  70: 76 */     cell4.setCellValue("Статус принтера");
/*  71:    */     
/*  72: 78 */     Cell cell5 = row0.createCell(5);
/*  73: 79 */     cell5.setCellValue("Статус тачскрина");
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void Sheet_Msk()
/*  77:    */     throws IOException
/*  78:    */   {
/*  79: 88 */     Sheet sheet3_export = this.export_errors.createSheet("МСК");
/*  80:    */     
/*  81: 90 */     Row row0 = sheet3_export.createRow(0);
/*  82:    */     
/*  83: 92 */     Cell cell0 = row0.createCell(0);
/*  84: 93 */     cell0.setCellValue("Номер точки");
/*  85:    */     
/*  86: 95 */     Cell cell1 = row0.createCell(1);
/*  87: 96 */     cell1.setCellValue("Последнее соединение (время)");
/*  88:    */     
/*  89: 98 */     Cell cell2 = row0.createCell(2);
/*  90: 99 */     cell2.setCellValue("Последний платеж (время)");
/*  91:    */     
/*  92:101 */     Cell cell3 = row0.createCell(3);
/*  93:102 */     cell3.setCellValue("Статус купюроприемника");
/*  94:    */     
/*  95:104 */     Cell cell4 = row0.createCell(4);
/*  96:105 */     cell4.setCellValue("Статус принтера");
/*  97:    */     
/*  98:107 */     Cell cell5 = row0.createCell(5);
/*  99:108 */     cell5.setCellValue("Статус тачскрина");
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void Osmp_input(int i, int triger, String Number_terminal, String Real_time_signal, String Real_time_payment, String string_info_devices)
/* 103:    */   {
/* 104:119 */     this.row1 = this.sheet1_export.createRow(i);
/* 105:    */     
/* 106:121 */     this.cell = this.row1.createCell(0);
/* 107:122 */     this.cell.setCellValue(Number_terminal);
/* 108:    */     
/* 109:124 */     this.cell2 = this.row1.createCell(1);
/* 110:125 */     this.cell2.setCellValue(Real_time_signal);
/* 111:    */     
/* 112:127 */     this.cell3 = this.row1.createCell(2);
/* 113:128 */     this.cell3.setCellValue(Real_time_payment);
/* 114:131 */     if (triger == 0)
/* 115:    */     {
/* 116:132 */       this.cell4 = this.row1.createCell(3);
/* 117:133 */       this.cell4.setCellValue(string_info_devices);
/* 118:    */       
/* 119:135 */       this.cell4 = this.row1.createCell(4);
/* 120:136 */       this.cell4.setCellValue(string_info_devices);
/* 121:    */     }
/* 122:140 */     if (triger == 1)
/* 123:    */     {
/* 124:141 */       this.cell4 = this.row1.createCell(3);
/* 125:142 */       this.cell4.setCellValue(string_info_devices);
/* 126:    */       
/* 127:144 */       this.cell4 = this.row1.createCell(4);
/* 128:145 */       this.cell4.setCellValue("OK");
/* 129:    */     }
/* 130:148 */     if (triger == 2)
/* 131:    */     {
/* 132:149 */       this.cell4 = this.row1.createCell(3);
/* 133:150 */       this.cell4.setCellValue("OK");
/* 134:    */       
/* 135:152 */       this.cell4 = this.row1.createCell(4);
/* 136:153 */       this.cell4.setCellValue(string_info_devices);
/* 137:    */     }
/* 138:157 */     this.cell6 = this.row1.createCell(5);
/* 139:158 */     this.cell6.setCellValue("OK");
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void Osmp_input_2(int z, String string_info_devices)
/* 143:    */   {
/* 144:166 */     this.row1 = this.sheet1_export.createRow(z);
/* 145:167 */     this.cell4 = this.row1.createCell(3);
/* 146:168 */     this.cell4.setCellValue("БЛу");
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void close(String dir)
/* 150:    */     throws IOException
/* 151:    */   {
/* 152:173 */     FileOutputStream fos = new FileOutputStream(dir + "\\Downloads\\export_errors.xls");
/* 153:174 */     this.export_errors.write(fos);
/* 154:175 */     fos.close();
/* 155:    */   }
/* 156:    */ }


/* Location:           C:\Users\ывожпл\Downloads\ExpoErrold\ExpoErrold\EXport\
 * Qualified Name:     Table_header
 * JD-Core Version:    0.7.0.1
 */