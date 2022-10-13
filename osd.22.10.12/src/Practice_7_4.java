// 실습 7-4
import java.util.*;

public class Practice_7_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> r = new Vector<Integer>();
        while(true) {
            int sum = 0;
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int rain = sc.nextInt();
            if(rain == 0){
                break;
            }
            r.add(rain);
            for(int i = 0; i < r.size(); i++){
                System.out.print(r.get(i) + " ");
                sum += r.get(i);
            }
            System.out.println();
            int avr = sum / r.size();
            System.out.println("현재 평균 " + avr);
        }
    }
}
