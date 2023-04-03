package Exercice.Basic.Lab2.IF_Else;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        int S = 17;
        int[] dp = new int[S+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i <= S; i++) {
            if (i >= 3 && dp[i-3] != -1) {
                dp[i] = dp[i-3] + 1;
            }
            if (i >= 5 && dp[i-5] != -1) {
                if (dp[i] == -1) {
                    dp[i] = dp[i-5] + 1;
                } else {
                    dp[i] = Math.min(dp[i], dp[i-5] + 1);
                }
            }
        }
        if (dp[S] != -1) {
            System.out.println("Suma " + S + " poate fi platita cu " + dp[S] + " monede.");
        } else {
            System.out.println("Suma " + S + " nu poate fi platita cu monede de 3 si 5 lei.");
        }
    }
}
