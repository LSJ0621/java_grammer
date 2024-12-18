package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BoardService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        1.회원가입 : 이름, 이메일, 비밀번호 id값(auto_increment)
//        2.회원 전체 목록 조회 : id, email
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글 수
//        4.게시글 작성 : 제목, 내용, 작성자email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
//        5.게시물 목록 조회 : id, title
//        6.게시물 상세 조회 : id(post), title, contents, 작성자email
//        7.서비스 종료

        while(true){
            System.out.println("원하시는 서비스를 입력해주세요.");
            int service = Integer.parseInt(br.readLine());
            if(service==1){
                System.out.println("회원가입을 도와드리겠습니다.");
                String[] str = br.readLine().split(" ");
                Author author = new Author(str[0],str[1],str[2]);
            } else if (service==2) {
                System.out.println("회원 목록을 조회합니다");
                for(Author a: Author.authors){
                    System.out.print("id: "+a.getId());
                    System.out.print(", 이름: "+a.getName());
                    System.out.print(", 이메일: "+a.getEmail());
                    System.out.println(", 비밀번호: "+a.getPassword());
                }
            } else if (service==3) {
                System.out.println("회원 상세 조회(id로 조회) : id, email, name, password, 작성글 수");
                int input = Integer.parseInt(br.readLine());
                int count = 0;
                for(Author a : Author.authors){
                    if(a.getId()==input){
                        System.out.print("id: "+a.getId());
                        System.out.print(", 이름: "+a.getName());
                        System.out.print(", 이메일: "+a.getEmail());
                        System.out.print(", 비밀번호: "+a.getPassword());
                    }
                }
                for(Post b : Post.posts){
                    if(b.getAuthor_id() == input){
                        count++;
                    }
                }
                System.out.println(", 작성글 수: "+count);
            } else if (service==4) {
                System.out.println("게시글 작성 : 제목, 내용, 작성자email");
                String[] str = br.readLine().split(" ");
                String title = str[0];
                String content = str[1];
                String author_email = str[2];
                int author_id = Post.findAuthorId(author_email);
                Post myPost = new Post(title,content,author_id);
            } else if (service==5) {
                System.out.println("게시물 목록 조회 : id, title");
                for(Post a: Post.posts ){
                    System.out.print("id: "+ a.getId());
                    System.out.println(", title: "+a.getTitle());
                }
            } else if (service==6) {
                System.out.println("게시물 상세 조회 : id(post), title, contents, 작성자email");
                int postId = Integer.parseInt(br.readLine());
                for(Post a : Post.posts){
                    if(a.getId()==postId){
                        System.out.print("id: "+a.getId());
                        System.out.print(", title: "+a.getTitle());
                        System.out.print(", contents: "+a.getContent());
                        for(Author b : Author.authors){
                            if(a.getAuthor_id()==b.getId()){
                                System.out.println(", author_email : "+ b.getEmail());
                            }
                        }
                    }
                }
            } else if (service==0) {
                System.out.println("서비스 종료");
                break;
            }else{
                System.out.println("잘못된 입력입니다.다시 입력해주세요");
            }
        }
    }
}

class Author{
    private String name;
    private String email;
    private String password;
    private int id;
    static int static_id=0;
    static public List<Author> authors = new ArrayList<>();


    public Author(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        static_id++;
        this.id = static_id;
        authors.add(this);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}

class Post{
//    4.게시글 작성 : 제목, 내용, 작성자email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
    private String title;
    private String content;
    private int id;
    private String author_email;
    private int author_id;
    static int findAuthorId;
    static int static_id = 0;
    static public List<Post> posts = new ArrayList<>();

    public Post(String title, String contents, int author_id){
        this.title = title;
        this.content = contents;
        this.author_id = author_id;
        static_id++;
        this.id = static_id;
        posts.add(this);
    }

    static int findAuthorId(String author_email){
        for(Author a: Author.authors){
            if(author_email.equals(a.getEmail())){
                findAuthorId = a.getId();
            }
        }
        return findAuthorId;
    }

    public int getId() {
        return id;
    }



    public int getAuthor_id() {
        return author_id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


}
