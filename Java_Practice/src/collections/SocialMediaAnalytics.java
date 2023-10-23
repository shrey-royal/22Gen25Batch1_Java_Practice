import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SocialMediaAnalytics {
    public static void main(String[] args) {
        Map<String, Post> posts = new HashMap<>();
        List<String> trendingHashtags = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Social Media Analytics Menu:");
            System.out.println("1. Create a new post");
            System.out.println("2. Display most popular posts");
            System.out.println("3. Identify top users with highest engagement");
            System.out.println("4. Analyse trending hashtags");
            System.out.println("5. Perform Sentiment analysis on comments");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter post title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter post content: ");
                    String content = sc.nextLine();
                    System.out.println("Enter hashtags (comma-seperated): ");
                    String[] hashtags = sc.nextLine().split(",");
                    Post post = new Post(title, content, hashtags);
                    posts.put(title, post);
                    for (String ht : hashtags) {
                        trendingHashtags.add(ht.trim());
                    }
                    break;

                case 2:
                    //Display most popular posts based on total interactions
                    List<Post> popularPosts = getMostPopularPosts(posts);
                    System.out.println("Most Popular Posts:");
                    for (Post p : popularPosts) {
                        System.out.println(p.getTitle() + " - " + p.getTotalInteractions() + " interactions");
                    }
                    break;

                case 3:
                    //Identify users with highest engagement
                    Map<String, Integer> userEngagement = identifyTopUsers(posts);
                    System.out.println("Top Users with highest engagement:");
                    for(String user : userEngagement.keySet()) {
                        System.out.println(user + " - " + userEngagement.get(user) + " interactions");
                    }
                    break;

                case 4:
                    // Analyze trending hashtags
                    Map<String, Integer> hashtagCounts = analyzeTrendingHashTags(trendingHashtags);
                    System.out.println("Trending Hashtags:");
                    for(String hashtag : hashtagCounts.keySet()) {
                        System.out.println(hashtag + " - " + hashtagCounts.get(hashtag) + " mentions");
                    }
                    break;

                case 5:
                    //Perform Sentiment analysis on comments
                    //psuedo code
                    System.out.println("Enter a comment: ");
                    String comment = sc.nextLine();
                    String sentiment = performSentimentAnalysis(comment);
                    System.out.println("Sentiment analysis result: " + sentiment);
                    break;

                case 6:
                    System.out.println("Exiting the Program.");
                    sc.close();
                    System.exit(0);

                default:
                    break;
            }
        }
    }

    //Helper methods for analytics

    private static List<Post> getMostPopularPosts(Map<String, Post> posts) {
        List<Post> postList = new ArrayList<>(posts.values());
        postList.sort((post1, post2) -> post2.getTotalInteractions() - post1.getTotalInteractions());
        return postList;
    }

    private static Map<String, Integer> identifyTopUsers(Map<String, Post> posts) {
        Map<String, Integer> userEngagement = new HashMap<>();
        for(Post post : posts.values()) {
            String user = post.getUser();
            int interactions = post.getTotalInteractions();
            userEngagement.put(user, userEngagement.getOrDefault(user, 0) + interactions);
        }
        return userEngagement;
    }

    private static Map<String, Integer> analyzeTrendingHashTags(List<String> hashtags) {
        Map<String, Integer> hashtagCounts = new HashMap<>();
        for(String hashtag : hashtags) {
            hashtagCounts.put(hashtag, hashtagCounts.getOrDefault(hashtag, 0) + 1);
        }
        return hashtagCounts;
    }

    //psuedo code.
    private static String performSentimentAnalysis(String comment) {
        if(comment.toLowerCase().contains("happy") || comment.toLowerCase().contains("good")) {
            return "Positive";
        } else if (comment.toLowerCase().contains("bad") || comment.toLowerCase().contains("sad")) {
            return "Negative";
        } else {
            return "Neutral";
        }
    }

}


class Post {
    private String title;
    private String content;
    private String[] hashtags;
    private int likes, comments, shares;

    public Post(String title, String content, String[] hashtags) {
        this.title = title;
        this.content = content;
        this.hashtags = hashtags;
        this.likes = 0;
        this.comments = 0;
        this.shares = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalInteractions() {
        return likes + comments + shares;
    }

    public void addLike() {
        likes++;
    }

    public void addComment() {
        comments++;
    }

    public void addShare() {
        shares++;
    }

    public String getUser() {
        //Extract the user from the title (a simplified approach)
        int indexOfDash =   title.indexOf('-');
        if(indexOfDash != -1) {
            return title.substring(0, indexOfDash).trim();  //ex: "John Doe - My Post" -> "John Doe"
        }

        return "Unknown User";
    }
}
