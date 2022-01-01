package first;

public class first {


     public static  void main(String[] args){

         book java_book = new book("java","ali",312,2020);
         strop str = new strop(java_book.author);
         char ch [] = str.StrToArray();
         System.out.println(ch);
         System.out.println(java_book.author+"  "+java_book.pub_Date);

         java_book.open_book();
         java_book.PrintBookInfo();
         boolean result=(java_book.MoveToPage(312));
         if (result)
                System.out.println( result);
         else
         System.out.println(java_book.current_page);
         java_book.close_book();


     }
}
