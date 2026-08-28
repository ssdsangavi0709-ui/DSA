class Solution {
    public int myAtoi(String s) {
        
        
        long num=0;
        int i=0;
        int n=s.length();
        // if the value is space
        while(i<n && s.charAt(i)==' ')
        {
            i++;
        }
        // if the value is minus
        // in default have sign value as positive
        int sign=1;
        if(i<n && s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }

        // if the sign is positive
        else if(i<n && s.charAt(i)=='+')
        {
            // just i++

            i++;
        }

        // if the value is digit.. we r just using one of the logic in reverse the number
        while(i<n && Character.isDigit(s.charAt(i)))
        {

            num=num*10+(s.charAt(i)-'0');

        if(sign==-1 && -num<Integer.MIN_VALUE )
            {
                return Integer.MIN_VALUE;
            }
        if(sign==1 && num<Integer.MAX_VALUE )
            {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        

        //-1 × 42 = -42

        return (int)(sign * num);




        
        
    }
}