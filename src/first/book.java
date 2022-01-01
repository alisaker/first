package first;

public class book {
    public String name;
    public String author;
    public int pub_Date;
    public int last_page_number;
    public int current_page;
    public boolean is_open;

    public book(String a , String b, int l_page, int p_Date){
        this.name = a;
        this.author= b;
        this.pub_Date=p_Date;
        this.last_page_number=l_page;
        this.is_open= false ;

    }
    void open_book(){
        if(is_open)
            System.out.println("is open");
        else
            is_open=true;
    }
    void close_book(){
        if(is_open)
            is_open=false;
        else
            System.out.println("is close");
    }

    public boolean MoveToPage(int page) {
        if (!is_open)
            return false;
        if ((page >this.last_page_number) || (page < 1))
            return false;
            this.current_page=page;
            return true;

    }
    public void PrintBookInfo(){
        System.out.println("BOOK NAME: "+ "  "+this.name);
        System.out.println("BOOK AUTHOR: "+ "  " +this.author);
        System.out.println("BOOK PUBLISHING DATE: "+ "  " +this.pub_Date);
    }

}
