/*   1:    */ import java.awt.Color;
/*   2:    */ import java.awt.Container;
/*   3:    */ import java.awt.Font;
/*   4:    */ import java.awt.Toolkit;
/*   5:    */ import java.awt.event.ActionEvent;
/*   6:    */ import java.awt.event.ActionListener;
/*   7:    */ import java.io.IOException;
/*   8:    */ import javax.swing.ImageIcon;
/*   9:    */ import javax.swing.JButton;
/*  10:    */ import javax.swing.JFrame;
/*  11:    */ import javax.swing.JLabel;
/*  12:    */ import javax.swing.JPanel;
/*  13:    */ import javax.swing.JProgressBar;
/*  14:    */ import javax.swing.JTextField;
/*  15:    */ import javax.swing.border.EmptyBorder;
/*  16:    */ 
/*  17:    */ public class Gui1
/*  18:    */   extends JFrame
/*  19:    */ {
/*  20:    */   public static JPanel contentPane;
/*  21:    */   JProgressBar progressBar;
/*  22:    */   JProgressBar progressBar2;
/*  23:    */   JTextField textField;
/*  24:    */   JTextField textField2;
/*  25:    */   JTextField textField3;
/*  26:    */   JTextField textField4;
/*  27:    */   String find_number_terminal;
/*  28:    */   String bonus_number_terminal;
/*  29: 31 */   Boolean visible = Boolean.valueOf(true);
/*  30:    */   
/*  31:    */   public void creature_prog_bar(int max_value_progressbar)
/*  32:    */   {
/*  33: 40 */     this.progressBar = new JProgressBar();
/*  34: 41 */     this.progressBar.setMaximum(max_value_progressbar);
/*  35: 42 */     this.progressBar.setForeground(new Color(51, 204, 102));
/*  36: 43 */     this.progressBar.setBackground(new Color(153, 153, 153));
/*  37: 44 */     this.progressBar.setBounds(50, 420, 650, 30);
/*  38: 45 */     contentPane.add(this.progressBar);
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void runable_progbar(int value_progressBar)
/*  42:    */   {
/*  43: 50 */     this.progressBar.setValue(value_progressBar);
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void Gui0(String txt)
/*  47:    */   {
/*  48: 62 */     final JFrame frame = new JFrame();
/*  49:    */     
/*  50: 64 */     frame.setIconImage(Toolkit.getDefaultToolkit().getImage(JExcel.directory_res + "Ex5.png"));
/*  51: 65 */     frame.setTitle("Сообщение ЭКСПОРТА");
/*  52: 66 */     frame.setResizable(false);
/*  53:    */     
/*  54: 68 */     frame.setBounds(500, 450, 300, 200);
/*  55:    */     
/*  56:    */ 
/*  57: 71 */     JPanel contentPane = new JPanel();
/*  58:    */     
/*  59: 73 */     contentPane.setBackground(new Color(102, 153, 255));
/*  60: 74 */     contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  61: 75 */     setContentPane(contentPane);
/*  62: 76 */     contentPane.setLayout(null);
/*  63: 77 */     frame.getContentPane().add(contentPane);
/*  64:    */     
/*  65: 79 */     JLabel lblNewLabel = new JLabel(txt);
/*  66: 80 */     lblNewLabel.setHorizontalAlignment(0);
/*  67: 81 */     lblNewLabel.setFont(new Font("Arial Black", 1, 20));
/*  68: 82 */     lblNewLabel.setForeground(new Color(51, 0, 204));
/*  69: 83 */     lblNewLabel.setBounds(10, 10, 280, 105);
/*  70: 84 */     contentPane.add(lblNewLabel);
/*  71:    */     
/*  72: 86 */     JButton btnNewButton = new JButton("О К");
/*  73: 87 */     btnNewButton.setBackground(new Color(204, 204, 204));
/*  74: 88 */     btnNewButton.setFont(new Font("Tahoma", 1, 18));
/*  75: 89 */     btnNewButton.setForeground(new Color(0, 51, 153));
/*  76: 90 */     btnNewButton.setBounds(115, 125, 70, 35);
/*  77: 91 */     contentPane.add(btnNewButton);
/*  78:    */     
/*  79:    */ 
/*  80:    */ 
/*  81: 95 */     frame.setVisible(true);
/*  82: 96 */     contentPane.setVisible(true);
/*  83: 97 */     lblNewLabel.setVisible(true);
/*  84: 98 */     btnNewButton.setVisible(true);
/*  85:    */     
/*  86:100 */     btnNewButton.addActionListener(new ActionListener()
/*  87:    */     {
/*  88:    */       public void actionPerformed(ActionEvent arg0)
/*  89:    */       {
/*  90:103 */         frame.setVisible(false);
/*  91:    */       }
/*  92:    */     });
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void Gui3(String txt)
/*  96:    */   {
/*  97:115 */     final JFrame frame = new JFrame();
/*  98:    */     
/*  99:117 */     frame.setIconImage(Toolkit.getDefaultToolkit().getImage(JExcel.directory_res + "Ex5.png"));
/* 100:118 */     frame.setTitle("Сообщение ЭКСПОРТА");
/* 101:119 */     frame.setResizable(false);
/* 102:    */     
/* 103:121 */     frame.setBounds(500, 450, 300, 200);
/* 104:    */     
/* 105:    */ 
/* 106:124 */     JPanel contentPane = new JPanel();
/* 107:    */     
/* 108:126 */     contentPane.setBackground(new Color(102, 153, 255));
/* 109:127 */     contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/* 110:128 */     setContentPane(contentPane);
/* 111:129 */     contentPane.setLayout(null);
/* 112:130 */     frame.getContentPane().add(contentPane);
/* 113:    */     
/* 114:132 */     JLabel lblNewLabel = new JLabel(txt);
/* 115:133 */     lblNewLabel.setHorizontalAlignment(0);
/* 116:134 */     lblNewLabel.setFont(new Font("Arial Black", 1, 20));
/* 117:135 */     lblNewLabel.setForeground(new Color(51, 0, 204));
/* 118:136 */     lblNewLabel.setBounds(10, 10, 280, 105);
/* 119:137 */     contentPane.add(lblNewLabel);
/* 120:    */     
/* 121:139 */     JButton btnNewButtonYES = new JButton("ДА");
/* 122:140 */     btnNewButtonYES.setBackground(new Color(204, 204, 204));
/* 123:141 */     btnNewButtonYES.setFont(new Font("Tahoma", 1, 18));
/* 124:142 */     btnNewButtonYES.setForeground(new Color(0, 51, 153));
/* 125:143 */     btnNewButtonYES.setBounds(30, 110, 70, 35);
/* 126:144 */     contentPane.add(btnNewButtonYES);
/* 127:    */     
/* 128:146 */     JButton btnNewButtonNO = new JButton("НЕТ");
/* 129:147 */     btnNewButtonNO.setBackground(new Color(204, 204, 204));
/* 130:148 */     btnNewButtonNO.setFont(new Font("Tahoma", 1, 18));
/* 131:149 */     btnNewButtonNO.setForeground(new Color(0, 51, 153));
/* 132:150 */     btnNewButtonNO.setBounds(200, 110, 70, 35);
/* 133:151 */     contentPane.add(btnNewButtonNO);
/* 134:    */     
/* 135:153 */     frame.setVisible(true);
/* 136:154 */     contentPane.setVisible(true);
/* 137:155 */     lblNewLabel.setVisible(true);
/* 138:156 */     btnNewButtonYES.setVisible(true);
/* 139:157 */     btnNewButtonNO.setVisible(true);
/* 140:    */     
/* 141:    */ 
/* 142:160 */     btnNewButtonYES.addActionListener(new ActionListener()
/* 143:    */     {
/* 144:    */       public void actionPerformed(ActionEvent arg0)
/* 145:    */       {
/* 146:163 */         frame.setVisible(false);
/* 147:    */       }
/* 148:168 */     });
/* 149:169 */     btnNewButtonNO.addActionListener(new ActionListener()
/* 150:    */     {
/* 151:    */       public void actionPerformed(ActionEvent arg0)
/* 152:    */       {
/* 153:172 */         System.exit(0);
/* 154:    */       }
/* 155:    */     });
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void wer()
/* 159:    */   {
/* 160:185 */     Gui1 gui1 = new Gui1();
/* 161:    */     
/* 162:    */ 
/* 163:188 */     String term = gui1.textField.getText();
/* 164:189 */     gui1.Gui0(term);
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void Gui2()
/* 168:    */   {
/* 169:282 */     JFrame frame2 = new JFrame();
/* 170:283 */     frame2.setIconImage(Toolkit.getDefaultToolkit().getImage(JExcel.directory_res + "Ex5.png"));
/* 171:284 */     frame2.setTitle("ЭКСПОРТ ошибок в дерьмошку");
/* 172:285 */     frame2.setResizable(false);
/* 173:286 */     frame2.setDefaultCloseOperation(3);
/* 174:287 */     frame2.setBounds(300, 300, 760, 500);
/* 175:    */     
/* 176:    */ 
/* 177:    */ 
/* 178:    */ 
/* 179:292 */     contentPane = new JPanel();
/* 180:293 */     contentPane.setBackground(new Color(142, 153, 255));
/* 181:294 */     contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/* 182:295 */     setContentPane(contentPane);
/* 183:296 */     contentPane.setLayout(null);
/* 184:297 */     frame2.getContentPane().add(contentPane);
/* 185:    */     
/* 186:    */ 
/* 187:    */ 
/* 188:    */ 
/* 189:302 */     JLabel lblNewLabel5 = new JLabel("New label");
/* 190:303 */     lblNewLabel5.setIcon(new ImageIcon(JExcel.directory_res + "Trans.jpg"));
/* 191:304 */     lblNewLabel5.setBounds(330, 50, 100, 100);
/* 192:305 */     contentPane.add(lblNewLabel5);
/* 193:306 */     lblNewLabel5.setVisible(true);
/* 194:    */     
/* 195:    */ 
/* 196:    */ 
/* 197:    */ 
/* 198:    */ 
/* 199:312 */     this.textField = new JTextField(10);
/* 200:313 */     this.textField.setBounds(70, 360, 120, 30);
/* 201:314 */     this.textField.setForeground(new Color(0, 102, 255));
/* 202:315 */     this.textField.setFont(new Font("Tahoma", 1, 15));
/* 203:316 */     contentPane.add(this.textField);
/* 204:317 */     this.textField.setColumns(10);
/* 205:    */     
/* 206:    */ 
/* 207:320 */     JLabel lblNewLabel = new JLabel("Искать номер:");
/* 208:321 */     lblNewLabel.setFont(new Font("Tahoma", 1, 15));
/* 209:322 */     lblNewLabel.setBounds(70, 330, 120, 30);
/* 210:323 */     lblNewLabel.setForeground(new Color(0, 102, 255));
/* 211:324 */     lblNewLabel.setBackground(new Color(204, 204, 204));
/* 212:325 */     lblNewLabel.setHorizontalAlignment(0);
/* 213:326 */     contentPane.add(lblNewLabel);
/* 214:    */     
/* 215:    */ 
/* 216:    */ 
/* 217:    */ 
/* 218:331 */     this.textField2 = new JTextField();
/* 219:332 */     this.textField2.setBounds(70, 300, 620, 30);
/* 220:333 */     this.textField2.setForeground(new Color(0, 102, 255));
/* 221:334 */     this.textField2.setFont(new Font("Tahoma", 1, 15));
/* 222:335 */     contentPane.add(this.textField2);
/* 223:336 */     this.textField2.setColumns(10);
/* 224:    */     
/* 225:    */ 
/* 226:339 */     JLabel lblNewLabel3 = new JLabel("Найденый терминал называется:");
/* 227:340 */     lblNewLabel3.setFont(new Font("Tahoma", 1, 15));
/* 228:341 */     lblNewLabel3.setBounds(70, 270, 620, 30);
/* 229:342 */     lblNewLabel3.setForeground(new Color(0, 102, 255));
/* 230:343 */     lblNewLabel3.setBackground(new Color(204, 204, 204));
/* 231:344 */     lblNewLabel3.setHorizontalAlignment(0);
/* 232:345 */     contentPane.add(lblNewLabel3);
/* 233:    */     
/* 234:    */ 
/* 235:348 */     JLabel lblNewLabel2 = new JLabel("Нашёл номер:");
/* 236:349 */     lblNewLabel2.setFont(new Font("Tahoma", 1, 15));
/* 237:350 */     lblNewLabel2.setBounds(570, 330, 120, 30);
/* 238:351 */     lblNewLabel2.setForeground(new Color(0, 102, 255));
/* 239:352 */     lblNewLabel2.setBackground(new Color(204, 204, 204));
/* 240:353 */     lblNewLabel2.setHorizontalAlignment(0);
/* 241:354 */     contentPane.add(lblNewLabel2);
/* 242:    */     
/* 243:    */ 
/* 244:    */ 
/* 245:358 */     this.textField3 = new JTextField();
/* 246:359 */     this.textField3.setBounds(570, 360, 120, 30);
/* 247:360 */     this.textField3.setForeground(new Color(0, 102, 255));
/* 248:361 */     this.textField3.setFont(new Font("Tahoma", 1, 15));
/* 249:362 */     contentPane.add(this.textField3);
/* 250:363 */     this.textField3.setColumns(10);
/* 251:    */     
/* 252:    */ 
/* 253:    */ 
/* 254:    */ 
/* 255:    */ 
/* 256:369 */     JButton btnNewButton4 = new JButton("ПОИСК");
/* 257:370 */     btnNewButton4.setBackground(new Color(0, 100, 250));
/* 258:371 */     btnNewButton4.setFont(new Font("Tahoma", 0, 14));
/* 259:372 */     btnNewButton4.setForeground(new Color(0, 250, 250));
/* 260:373 */     btnNewButton4.setBounds(335, 360, 90, 30);
/* 261:374 */     contentPane.add(btnNewButton4);
/* 262:    */     
/* 263:376 */     JButton btnNewButton1 = new JButton("<html><center>Запуск ЭКСПОРТА turbo ver.</html>");
/* 264:377 */     btnNewButton1.setBackground(new Color(204, 204, 204));
/* 265:378 */     btnNewButton1.setFont(new Font("Tahoma", 1, 16));
/* 266:379 */     btnNewButton1.setForeground(new Color(0, 102, 255));
/* 267:380 */     btnNewButton1.setBounds(260, 190, 240, 60);
/* 268:381 */     contentPane.add(btnNewButton1);
/* 269:    */     
/* 270:    */ 
/* 271:384 */     JButton btnNewButton2 = new JButton("ВЫХОД");
/* 272:385 */     btnNewButton2.setBackground(new Color(0, 100, 250));
/* 273:386 */     btnNewButton2.setFont(new Font("Tahoma", 0, 14));
/* 274:387 */     btnNewButton2.setForeground(new Color(0, 250, 250));
/* 275:388 */     btnNewButton2.setBounds(630, 20, 90, 30);
/* 276:389 */     contentPane.add(btnNewButton2);
/* 277:    */     
/* 278:    */ 
/* 279:    */ 
/* 280:    */ 
/* 281:    */ 
/* 282:    */ 
/* 283:    */ 
/* 284:    */ 
/* 285:    */ 
/* 286:    */ 
/* 287:400 */     frame2.setVisible(true);
/* 288:401 */     contentPane.setVisible(true);
/* 289:402 */     btnNewButton1.setVisible(true);
/* 290:403 */     btnNewButton2.setVisible(true);
/* 291:    */     
/* 292:    */ 
/* 293:    */ 
/* 294:    */ 
/* 295:    */ 
/* 296:    */ 
/* 297:    */ 
/* 298:    */ 
/* 299:    */ 
/* 300:413 */     btnNewButton4.addActionListener(new ActionListener()
/* 301:    */     {
/* 302:    */       public void actionPerformed(ActionEvent arg0)
/* 303:    */       {
/* 304:421 */         TextFild tf = new TextFild();
/* 305:422 */         Gui1.this.find_number_terminal = Gui1.this.textField.getText();
/* 306:    */         try
/* 307:    */         {
/* 308:425 */           tf.read(Gui1.this.find_number_terminal);
/* 309:    */         }
/* 310:    */         catch (IOException localIOException) {}
/* 311:429 */         Gui1.this.textField3.setText(tf.find_number);
/* 312:430 */         Gui1.this.textField2.setText(tf.name_term_in_bpt);
/* 313:    */       }
/* 314:464 */     });
/* 315:465 */     btnNewButton1.addActionListener(new ActionListener()
/* 316:    */     {
/* 317:    */       public void actionPerformed(ActionEvent arg0)
/* 318:    */       {
/* 319:469 */         Files_check f_c = new Files_check();
/* 320:470 */         f_c.checking();
/* 321:    */       }
/* 322:476 */     });
/* 323:477 */     btnNewButton2.addActionListener(new ActionListener()
/* 324:    */     {
/* 325:    */       public void actionPerformed(ActionEvent arg0)
/* 326:    */       {
/* 327:481 */         Gui1 gui1 = new Gui1();
/* 328:    */         
/* 329:483 */         gui1.Gui3("СЛУЧАЙНО НАЖАЛ ?");
/* 330:    */       }
/* 331:    */     });
/* 332:    */   }
/* 333:    */ }


/* Location:           C:\Users\ывожпл\Downloads\ExpoErrold\ExpoErrold\EXport\
 * Qualified Name:     Gui1
 * JD-Core Version:    0.7.0.1
 */