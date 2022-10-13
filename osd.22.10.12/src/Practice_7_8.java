// 실습 7-8
import java.util.*;

class SPoint {
    private int point;
    public SPoint(int point) {
        this.point = point;
    }
    public String toString(){
        return "" + this.point;
    }
}

public class Practice_7_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, SPoint> score = new HashMap<String, SPoint>();
        System.out.println("** 포인트 관리 프로그램입니다 **");
        while(true){
            System.out.print("이름과 포인트 입력 >> ");
            String name = sc.next();
            if(name.equals("그만")){
                break;
            }
            int p = sc.nextInt();
            if(score.get(name) == null){
                score.put(name, new SPoint(p));
            } else {
                String re = String.valueOf(score.get(name));
                score.put(name, new SPoint(Integer.parseInt(re) + p));
            }

            Set<String> keys = score.keySet();
            Iterator<String> it = keys.iterator();

            while(it.hasNext()){
                String n = it.next();
                System.out.print("(" + n + "," + score.get(n) + ")");
            }
            System.out.println();
        }
    }
}