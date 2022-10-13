// 실습 7장 Open Challenge
import java.util.*;
class Word {
    private String e, k;
    public Word(){

    }
    public Word(String e, String k){
        this.e = e;
        this.k = k;
    }

    public String getE() {
        return this.e;
    }

    public String getK() {
        return this.k;
    }

    public String toString(){
        return this.e + ", " + this.k;
    }
}
public class WordQuiz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Word [] w = new Word[4];

        Vector<Word> v = new Vector<Word>();
        v.add(new Word("painting", "그림"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("emotion", "감정"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("error", "오류"));
        v.add(new Word("society", "사회"));
        v.add(new Word("dall", "인형"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("example", "보기"));
        v.add(new Word("deal", "거래"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("human", "인간"));
        v.add(new Word("statue", "조각상"));
        v.add(new Word("dog", "강아지"));
        v.add(new Word("cat", "고양이"));
        v.add(new Word("love", "사랑"));
        v.add(new Word("animal", "동물"));

        System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 17개의 단어가 들어 있습니다.");

        while(true){
            int [] num = new int[4];
            num[0] = (int)(Math.random() * 17);
            String wo = String.valueOf(v.get(num[0]));
            String [] ws = wo.split(",");
            w[0] = new Word(ws[0], ws[1]);

            int i = 1, j;
            w[3] = null;

            while(w[3] == null){
                int cnt = 0;
                int temp = (int)(Math.random() * 17);
                for(j = i - 1; j >= 0; j--){
                    if(temp != num[j]){
                        cnt++;
                    }
                }

                if(cnt == i){
                    num[i] = temp;
                    wo = String.valueOf(v.get(num[i]));
                    ws = wo.split(",");
                    w[i] = new Word(ws[0], ws[1]);
                    i++;
                } else {
                    i--;
                }
            }

            int q = (int)(Math.random() * 4);
            System.out.println(w[q].getE() + "?");
            for(i = 0; i < 4; i++){
                System.out.print("(" + (i + 1) + ")" + w[i].getK() + " ");
            }
            System.out.print(":> ");
            int ch = sc.nextInt();
            if(ch == -1){
                System.out.println("\"명품영어\"를 종료합니다...");
                break;
            } else if (ch == q + 1) {
                System.out.println("Excellent !!");
            } else if (ch == 1 || ch == 2 || ch == 3 || ch == 4) {
                System.out.println("No. !!");
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }
}
