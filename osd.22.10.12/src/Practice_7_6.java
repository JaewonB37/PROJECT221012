// 실습 7-6
import java.util.*;

class Location {
    private String lo, la;
    public Location(String lo, String la) {
        this.lo = lo;
        this.la = la;
    }

    public String toString(){
        return this.lo + "\t" + this. la;
    }
}

public class Practice_7_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Location> location = new HashMap<String, Location>();
        System.out.println("도시, 경도, 위도를 입력하세요.");
        for(int i = 0; i < 4; i++){
            System.out.print(">> ");
            String w = sc.nextLine();
            String [] word = w.split(",");
            location.put(word[0], new Location(word[1], word[2]));
        }
        System.out.println("--------------------");

        Set<String> keys = location.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String city = it.next();
            System.out.println(city + "\t" + location.get(city));
        }


        System.out.println("--------------------");

        while(true) {
            System.out.print("도시 이름 >> ");
            String se_c = sc.nextLine();
            if(se_c.equals("그만")){
                break;
            } else if(location.get(se_c) == null) {
                System.out.println(se_c + "는 없습니다.");
            } else {
                System.out.println(se_c + "\t" + location.get(se_c));
            }
        }
    }
}
