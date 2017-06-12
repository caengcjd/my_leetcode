public class Solution {
    public int reverse(int x) {
        int index=1;
        if(x==0)return 0;
        if(x>0){index=1;}
        if(x<0){index=-1;x=x*-1;}
        String  m=Integer.toString(x,10);
        m=new StringBuffer(m).reverse().toString();
        //if(m<-2147483648||m)
        Integer ans=0;
        try {
            ans=Integer.parseInt(m,10);
        }catch(Exception e){
            return 0;
        }
        return index*ans;
        
    }
}



public int reverse(int x)
{
    int result = 0;

    while (x != 0)
    {
        int tail = x % 10;
        int newResult = result * 10 + tail;
        if ((newResult - tail) / 10 != result) //判断溢出的写法很机智呀!
        { return 0; }
        result = newResult;
        x = x / 10;
    }

    return result;
}
