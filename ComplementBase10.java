package ComplementBase10;

import java.util.ArrayList;

public class ComplementBase10 {
    public static void main(String[] args) {
        int n = 7;
        int res = new ComplementBase10().bitwiseComplement(n);
        System.out.println(res);
    }

    public int bitwiseComplement(int N) {
        if (N == 0)
            return 1;
        int res = 0, r = 0, counter = 0;
        
        while (N > 0)
        {
            r  = N%2 == 0 ? 1: 0;
            if (r == 1)
                res += Math.pow(2, counter);
            
            counter += 1;
            N /= 2;
        }
        return res;
    }
}
