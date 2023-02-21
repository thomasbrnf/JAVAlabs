public class Formula {
    public static float fun(short n, short m) {
        final short C = 2;
        float ans = 0;
        // summation of summation
        for (short i = 0; i <= n; i++){
            // summation expression
            for (short j = 0; j <= m; j++){
                ans += ((i-j)/(i+C));
            }
            ans += ans;
        }
        return ans;
    }
}
