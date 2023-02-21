public class Formula {
    public static float fun(short n, short m) throws NumberFormatException{
        final short C = 2;
        float ans = 0;
        // summation expression
        for (short i = 0; i <= n; i++){
            for (short j = 0; j <= m; j++){
                ans += ((i-j)/(i+C));
            }
        }
        return ans;
    }
}
