// 실습 7-2
import java.util.*;

public class Practice_7_2 {
    public static void main(String[] args){
        double grade = 0.0;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(int i = 0; i < 6; i++) {
            String s = sc.next();
            a.add(s);
        }

        for(int i = 0; i < a.size(); i++) {
            switch(a.get(i)){
                case "A": grade += 4.0; break;
                case "B": grade += 3.0; break;
                case "C": grade += 2.0; break;
                case "D": grade += 1.0; break;
                case "F": grade += 0.0; break;
                default : break;
            }
        }
        System.out.println(grade / 6);

        sc.close();
    }
}
