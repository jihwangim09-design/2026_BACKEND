package day06;

import java.net.Socket;
import java.util.Scanner;

public class OverallController {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Post[] posts = new Post[100];

        for(;;){
            System.out.println("===My Community===");
            System.out.println("1.게시물 쓰기 2.게시물 출력");
            System.out.println("==================");
            System.out.printf("선택");
            int ch = scan.nextInt();

            if(ch==1){
                scan.nextLine();
                System.out.println("작성자");
                String writer = scan.nextLine();
                System.out.println("내용");
                String content = scan.nextLine();

                Post post = new Post(writer, content);
                boolean result = false;

                for ( int i = 0; i<=posts.length-1 ; i++){
                    if (posts[i]==null){
                        posts[i]=post;
                        result = true;
                        break;
                    }
                }
                
                if(result){
                    System.out.println("[안내] 게시글 쓰기 성공!");
                }else{System.out.println("[안내] 게시글 쓰기 실패");}
            }else if(ch==2){
                for(Post post : posts){
                    if(post!=null){
                        System.out.printf("작성자: 내용: \n" , post.writer , post.content );
                    }
                    
                }
            }
        }

    }// med
} // c ed

class Post{
    String writer;
    String content;

    Post(){}

    Post(String writer, String content){
        this.writer = writer;
        this.content = content;
    }
}
