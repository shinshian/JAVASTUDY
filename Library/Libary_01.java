//package First.src;
import java.util.*;
public class Libary_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> books = new HashMap<>() ; 
        while (true) {
            System.out.println("1.도서추가 ㅣ 2. 목록 출력 ㅣ 3.검색 ㅣ 0. 종료");
            int sel = sc.nextInt();
            sc.nextLine();
            if(sel == 1){
                System.out. println("책 제목:");
                String title = sc.nextLine();
                System.out.println("저자:");
                String author = sc.nextLine();
                books.put(title, author);
                System.out.println("도서가 추가 되었습니다");
            } else if (sel == 2){
                for(String t: books.keySet()){
                    System.out.println(t +" - "+books.get(t));
                }
            }
        }

        
    }
}
