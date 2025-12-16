import java.util.ArrayList;

public class SocialMedia {
    private ArrayList<String> posts;

    public SocialMedia (String filename){
        posts = FileOperator.getStringData(filename);
    }

    public int postsWithLength(int minLength){
        int total = 0;
        for (String post:posts){
            if (post.length()>=minLength){
                total++;
            }
        }
        return total;
    }

    public ArrayList<String> postsWithHashtag (String hashtag){
        ArrayList<String> result = new ArrayList<>();
        for (String post: posts) {
            if (post.contains(hashtag)){
                result.add(post);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SocialMedia media1 = new SocialMedia("sample1.txt");
        SocialMedia media2 = new SocialMedia("sample2.txt");
        
        System.out.println("=== TESTING SAMPLE1.TXT ===");
        System.out.println(media1.postsWithLength(50));
        System.out.println(media1.postsWithLength(70));
        System.out.println(media1.postsWithHashtag("Java"));

        System.out.println("=== TESTING SAMPLE2.TXT ===");
        System.out.println(media2.postsWithLength(80));
        System.out.println(media2.postsWithHashtag("Marvel"));
        System.out.println(media2.postsWithHashtag("EndgameHype"));
    }
}
