// 실습 7-10
import java.util.*;
abstract class Shape {
    public abstract String toString();
}

class Line extends Shape {
    public String toString(){
        return "Line";
    }
}

class Rect extends Shape {
    public String toString(){
        return "Rect";
    }
}

class Circle extends Shape {
    public String toString(){
        return "Circle";
    }
}

public class Practice_7_10 {
    private String name;
    private Scanner sc = new Scanner(System.in);

    Vector<Shape> sh = new Vector<Shape>();

    public Practice_7_10(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("그래픽 에디터 " + name + "을 실행합니다.");
        int choice = 0;
        while (choice != 4) {
            int type, index;
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    type = sc.nextInt();
                    if (type < 1 || type > 3) {
                        System.out.println("잘못 선택하셨습니다.");
                        break;
                    }
                    insert(type);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    index = sc.nextInt();
                    if (index < sh.size() && index >= 0){
                        sh.remove(index);
                        break;
                    } else {
                        System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                    }
                    break;
                case 3:
                    for(int i =0; i< sh.size(); i++){
                        Shape n = sh.get(i);
                        System.out.println(n);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
        System.out.println(name + "을 종료합니다.");
    }

    private void insert(int choice) {
        switch (choice) {
            case 1: // Line
                sh.add(new Line());
                break;
            case 2: // Rect
                sh.add(new Rect());
                break;
            case 3: // Circle
                sh.add(new Circle());
        }
    }

    public static void main(String [] args) {
        Practice_7_10 ge = new Practice_7_10("beauty");
        ge.run();
    }
}

