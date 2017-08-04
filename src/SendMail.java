/*  1:   */ public class SendMail
/*  2:   */ {
/*  3:   */   Sender sender;
/*  4:   */   
/*  5:   */   public void open_socket()
/*  6:   */   {
/*  7: 8 */     this.sender = new Sender("192.168.8.100", 
/*  8: 9 */       "25", 
/*  9:10 */       "", 
/* 10:11 */       "");
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void resiv_mail(String body, String mailto)
/* 14:   */   {
/* 15:19 */     this.sender.send("Список ошибок", 
/* 16:20 */       body, 
/* 17:21 */       "it_ss@td-mobile.ru", 
/* 18:22 */       mailto);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void engin_mail(String worker)
/* 22:   */   {
/* 23:27 */     SendMail sendmail = new SendMail();
/* 24:28 */     String adress = worker + "@td-mobile.ru";
/* 25:29 */     String stroka1 = "Привет";
/* 26:30 */     String stroka2 = "Это строки";
/* 27:31 */     String body = stroka1 + "\n" + stroka2;
/* 28:   */     
/* 29:   */ 
/* 30:   */ 
/* 31:   */ 
/* 32:   */ 
/* 33:   */ 
/* 34:   */ 
/* 35:   */ 
/* 36:   */ 
/* 37:   */ 
/* 38:   */ 
/* 39:   */ 
/* 40:   */ 
/* 41:   */ 
/* 42:   */ 
/* 43:47 */     sendmail.open_socket();
/* 44:48 */     sendmail.resiv_mail(body, adress);
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void workers()
/* 48:   */   {
/* 49:55 */     String id1 = "akinshine";
/* 50:56 */     String id2 = "borygins";
/* 51:57 */     String id3 = "brezhneve";
/* 52:58 */     String id4 = "kulikova";
/* 53:59 */     String id5 = "chemurzievr";
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Users\ывожпл\Downloads\ExpoErrold\ExpoErrold\EXport\
 * Qualified Name:     SendMail
 * JD-Core Version:    0.7.0.1
 */