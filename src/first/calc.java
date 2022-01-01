package first;

public class calc {
     public int Sum( int one , int two){
         return one-two;
         }

    public int min( int one , int two){
        return one-two;
    }
    public int mal( int one , int two){
        return one*two;
    }
    public int Div( int one , int two){
         if (two == 0)
             return 0;
        return one/two;
    }
    public void dec (int value) {
        int i = value;
        do {
            System.out.println(i);
            i--;}
            while (i >= 1) ;

    }
    public int [] malArray(int [] a,int b [])
    {

        if (a.length != b.length)
            return null;
        int[] result = new int[b.length];
        for (int i = 0; i < a.length; i++)
            result[i] = a[i] * b[i];
            return result;

    }

    }



