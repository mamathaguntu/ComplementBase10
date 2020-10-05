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
        int res = 0;
        int r = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (N > 0)
        {
            r  = N%2 == 0 ? 1: 0;
            arr.add(r);
            N /= 2;
        }
        int counter = 0;
        for (int i = 0 ; i < arr.size(); i++)
        {
            if (arr.get(i) == 1)
                res += Math.pow(2, counter);
            
                counter += 1;
        }
        return res;
    }
}
