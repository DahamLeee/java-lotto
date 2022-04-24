package lotto;

import java.util.Collections;
import java.util.List;

public class ResultView {

    public void printBoughtLottoList(List<Lotto> lottoList) {
        System.out.println(lottoList.size() + "개를 구매했습니다.");

        for (Lotto lotto : lottoList) {
            System.out.println(lotto);
        }
    }

    public void printTotalRanks(List<Rank> ranks) {
        for (Rank rank : Rank.values()) {
            int frequency = Collections.frequency(ranks, rank);
            printEachRank(rank, frequency);
        }
    }

    private void printEachRank(Rank rank, int frequency) {
        System.out.println(rank + " - " + frequency + "개");
    }

    public void printTotalRate(double totalRate) {
        System.out.println("총 수익률은 " + totalRate + "입니다.");
    }
}
