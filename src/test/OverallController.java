package test;
import java.util.Scanner;
/*
    OverallController : 입력 Scanner/출력Print 담당 하는
    Post: 자료들의 모델/타입/형식

*/

public class OverallController {
    public static void main(String[] args) {
        OverallRepository repository = new OverallRepository();
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("============ My Community ============ ");
            System.out.println("1.게시물쓰기 2.게시물출력");
            System.out.println("====================================== ");
            System.out.print("선택>");
            int ch = scan.nextInt();

            if (ch == 1) {
                scan.nextLine();
                System.out.print("내용 : ");     String content = scan.nextLine();
                System.out.print("작성자 : ");   String writer = scan.nextLine();

                Post post = new Post(content, writer);
                boolean result = repository.save(post);

                if (result) { System.out.println("[안내] 글쓰기 성공");} 
                else { System.out.println("[안내] 글쓰기 실패"); }

            } else if (ch == 2) {
                Post[] posts = repository.findAll();
                for (Post post : posts) {
                    if (post != null) {
                        System.out.printf("작성자 : %s , 내용 : %s \n", post.writer, post.content);
                    }
                }
            }
        }
    }
}
// 데이터 저장 및 반환(조회) 비즈니스 로직 전담 클래스
class OverallRepository {
    // DB 대신에 배열 이용한 여러개 자료 저장 용도
    Post[] posts = new Post[100];

    // 1. 저장

    // 2. 전체출력

    // 게시물 저장
    boolean save(Post post) {
        for (int index = 0; index < posts.length; index++) {
            if (posts[index] == null) {
                posts[index] = post;
                return true;
            }
        }
        return false;
    }
    // 게시물 전체 목록 반환
    Post[] findAll() {
        return posts;
    }
}
class Post {
    // 멤버변수
    String content;
    String writer;
    // 생성자 - 클래스내 오른쪽 클릭 -> 소스작업 
    Post() {}
    Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
}