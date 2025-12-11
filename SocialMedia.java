import java.util.ArrayList;

public class SocialMedia {
    public ArrayList<String> posts;

    public SocialMedia(String filename) {
        posts = FileOperator.readStringData(filename);
        if (posts == null) {
            posts = new ArrayList<>();
        }
    }

    public int postsWithLength(int minLength) {
        int total = 0;
        for (String post : posts) {
            if (post == null) continue;
            String[] tokens = post.split("\\s+");
            for (String t : tokens) {
                if (t.startsWith("#") && t.length() > 1) {
                    // strip trailing punctuation
                    String tag = t.replaceAll("[^#A-Za-z0-9_]", "");
                    String tagText = tag.substring(1); // without '#'
                    if (tagText.length() >= minLength) {
                        total++;
                    }
                }
            }
        }
        return total;
    }

    public ArrayList<String> postsWithHashtag(String hashtag) {
        ArrayList<String> result = new ArrayList<>();
        if (hashtag == null || hashtag.isEmpty()) return result;
        String search = hashtag.startsWith("#") ? hashtag : "#" + hashtag;
        for (String post : posts) {
            if (post != null && post.contains(search)) {
                result.add(post);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String filename = "sample1.txt";
        SocialMedia sm = new SocialMedia(filename);
        System.out.println("Loaded posts: " + sm.posts.size());

        int minLen = 6;
        System.out.println("Hashtags with length >= " + minLen + ": " + sm.postsWithLength(minLen));

        String tag = "Java";
        System.out.println("Posts containing #" + tag + ":");
        for (String p : sm.postsWithHashtag(tag)) {
            System.out.println(" - " + p);
        }
    }
}
