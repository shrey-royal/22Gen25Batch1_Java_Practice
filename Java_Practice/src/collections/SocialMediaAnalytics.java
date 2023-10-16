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
                    List<Post> popularPosts = getPopularPosts(posts);
                    System.out.println("Most Popular Posts:");
                    for (Post p : popularPosts) {
                        System.out.println(p.getTitle() + " - " + p.getTotalInteractions() + " interactions");
                    }
                    break;
            
                default:
                    break;
            }
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
