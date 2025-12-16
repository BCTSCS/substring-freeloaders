import java.util.ArrayList;

public class SocialMedia {
    public ArrayList<String> posts;

    /**
     * Initialize posts from file using FileOperator.readStringData(filename)
     */
    public SocialMedia(String filename) {
        posts = FileOperator.readStringData(filename);
        if (posts == null) posts = new ArrayList<>();
    }

    /**
     * Count hashtags across all posts whose hashtag text length is at least minLength.
     * Example: '#MachineLearning' counts as length 15 (excluding '#').
     */
    public int postsWithLength(int minLength) {
        int total = 0;
        for (String post : posts) {
            if (post == null) continue;
            String[] tokens = post.split("\\s+");
            for (String t : tokens) {
                if (t.startsWith("#") && t.length() > 1) {
                    String tag = t.replaceAll("[^#A-Za-z0-9_]", "");
                    String tagText = tag.substring(1);
                    if (tagText.length() >= minLength) {
                        total++;
                    }
                }
            }
        }
        return total;
    }

    /**
     * Return all posts that contain the given hashtag. Accepts hashtag with or
     * without the leading '#'. Matching is a simple contains check.
     */
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
        SocialMedia sm = new SocialMedia("sample1.txt");
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