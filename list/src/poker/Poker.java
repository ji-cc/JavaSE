package poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker {
    //构建一副牌
    String[] suits = {"♥", "♠", "♣", "♦"};
    List<Card> poker = new ArrayList<>();
    public List<Card> buyPoker(){
        for(int i=0; i < 4; i++){
            for(int j=2; j <= 10; j++) {
                // 字符串和整数相加，整数会被自动转成字符串
                Card card = new Card(suits[i], " "+ j);
                poker.add(card);
            }
            poker.add(new Card(suits[i],"J"));
            poker.add(new Card(suits[i],"Q"));
            poker.add(new Card(suits[i],"K"));
            poker.add(new Card(suits[i],"A"));
        }
        return poker;
    }

    //洗牌
    public void shuffle(List<Card> poker) {
        //从后往前遍历List,每次取到一个牌之后，和前面的一个随机位置的牌进行交换
        Random random = new Random();
        for(int i =poker.size()-1; i>0; i--) {
            //随机产生一个[0,i)的随机数
            int r = random.nextInt(i);
            swap(poker,i,r);
        }
    }

    private static void swap(List<Card> poker, int i, int j) {
        Card tmp = poker.get(i);
        poker.set(i, poker.get(j));
        poker.set(j,tmp);
    }

    //发牌，三个玩家，每个玩家发五张牌
    //通过嵌套List来表示
    //每个玩家手中的牌是一个List，多个玩家的手牌再放到一个List中
    public void sendPoker(List<Card> poker) {
        List<List<Card>> palyers = new ArrayList<>();
        palyers.add(new ArrayList<Card>());
        palyers.add(new ArrayList<Card>());
        palyers.add(new ArrayList<Card>());
        //模拟给每位玩家轮流发牌
        for(int cardIndex = 0; cardIndex <5; cardIndex++) {
            for(int playIndex = 0; playIndex<3; playIndex++) {
                //先获取一位玩家
                List<Card> player= palyers.get(playIndex);
                //发牌；把poker中最前面的元素发给当前玩家
                Card toCard = poker.remove(0);
                player.add(toCard);
            }
        }
        //展示手牌
        for(int i=1; i<4; i++) {
            System.out.println("玩家" + i + "的手牌");
            System.out.println(palyers.get(i-1));
        }
    }

}
