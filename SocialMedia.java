import java.util.ArrayList;


public class SocialMedia {
    private ArrayList<String> posts;

    public SocialMedia (String filename){
        posts = FileOperator.getStringData(filename);
    }

    public int postsWithLength(int minLength){
        int total = 0;
        return total;
    }

    public ArrayList<String> postsWithHashtag (String hashtag){
        ArrayList<String> result = new ArrayList<>();
        return result;
    }
}
