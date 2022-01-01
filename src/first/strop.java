package first;

public class strop {
    public String value;
    public strop(String s)
    {
        this.value= s ;
    }
    public char[] StrToArray()
    {
      char [] ch=new char[value.length()];
      for (int i=0 ; i< ch.length;i++)
          ch[i]=value.charAt(i);
      return ch;
    }

}
