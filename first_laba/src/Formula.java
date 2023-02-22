public class Formula {
    public static float fun(short n, short m) throws IllegalAccessException {
       if (m < 0 || n < 0){
           throw new IllegalAccessException("You must enter a positive number");
       }else {
           final short C = 2;
           float ans = 0;
           // summation expression
           for (short i = 0; i <= n; i++) {
               for (short j = 0; j <= m; j++) {
                   ans += (((float)i - j) / (i + C));
               }
           }
           return ans;
       }
    }
}
