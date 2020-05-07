package poker;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Poker pokers = new Poker();
        // 1.先买一副牌
        List<Card> poker = pokers.buyPoker();
        //2.洗牌
        pokers.shuffle(poker);
        //3.发牌
        pokers.sendPoker(poker);
    }
}
