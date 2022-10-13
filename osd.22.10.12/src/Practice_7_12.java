// 실습 7-12
import java.util.*;
class Dic {
    private String e, k;
    public Dic(){

    }
    public Dic(String e, String k){
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
public class Practice_7_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dic [] d = new Dic[4];

        Vector<Dic> v = new Vector<Dic>();
        v.add(new Dic("painting", "그림"));
        v.add(new Dic("bear", "곰"));
        v.add(new Dic("emotion", "감정"));
        v.add(new Dic("baby", "아기"));
        v.add(new Dic("error", "오류"));
        v.add(new Dic("society", "사회"));
        v.add(new Dic("dall", "인형"));
        v.add(new Dic("eye", "눈"));
        v.add(new Dic("example", "보기"));
        v.add(new Dic("deal", "거래"));
        v.add(new Dic("picture", "사진"));
        v.add(new Dic("human", "인간"));
        v.add(new Dic("statue", "조각상"));
        v.add(new Dic("dog", "강아지"));
        v.add(new Dic("cat", "고양이"));
        v.add(new Dic("love", "사랑"));
        v.add(new Dic("animal", "동물"));
        int w_cnt = 17;

        System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");

        while(true) {
            System.out.print("단어 테스트 : 1, 단어 삽입 : 2, 종료 : 3 >> ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1: {
                    System.out.println("현재 " + w_cnt + "개의 단어가 들어 있습니다.");

                    while (true) {
                        int[] num = new int[4];
                        num[0] = (int) (Math.random() * w_cnt);
                        String wo = String.valueOf(v.get(num[0]));
                        String[] ws = wo.split(",");
                        d[0] = new Dic(ws[0], ws[1]);

                        int i = 1, j;
                        d[3] = null;

                        while (d[3] == null) {
                            int cnt = 0;
                            int temp = (int) (Math.random() * w_cnt);
                            for (j = i - 1; j >= 0; j--) {
                                if (temp != num[j]) {
                                    cnt++;
                                }
                            }

                            if (cnt == i) {
                                num[i] = temp;
                                wo = String.valueOf(v.get(num[i]));
                                ws = wo.split(",");
                                d[i] = new Dic(ws[0], ws[1]);
                                i++;
                            } else {
                                i--;
                            }
                        }

                        int q = 0;
                        int ch = 0;

                        while (true) {
                            try {
                                q = (int) (Math.random() * 4);
                                System.out.println(d[q].getE() + "?");
                                for (i = 0; i < 4; i++) {
                                    System.out.print("(" + (i + 1) + ")" + d[i].getK() + " ");
                                }
                                System.out.print(":> ");

                                ch = sc.nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("숫자를 입력하세요!!");
                                sc.nextLine();
                            }
                        }

                        if (ch == -1) {
                            System.out.println();
                            break;
                        } else if (ch == q + 1) {
                            System.out.println("Excellent !!");
                        } else if (ch == 1 || ch == 2 || ch == 3 || ch == 4) {
                            System.out.println("No. !!");
                        } else {
                            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                        }
                    }

                    break;
                }

                case 2: {
                    System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
                    while(true){
                        try {
                            System.out.print("영어 한글 입력 >> ");
                            String n_word = sc.nextLine();
                            if(n_word.equals("그만")){
                                break;
                            }
                            else {
                                String[] ws = n_word.split(" ");
                                v.add(new Dic(ws[0], ws[1]));
                                w_cnt++;
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                        }
                    }
                    break;
                }

                case 3:
                    System.out.println("\"명품영어\"를 종료합니다.");
                    System.exit(0);
            }
        }
    }
}
