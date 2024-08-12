import java.util.Arrays;
import java.util.Scanner;
// Class representing a user on Instagram
public class User {
    public String username;
    public String email;
    private Post[] posts;
    private int postCount;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.posts = new Post[10]; // Initial capacity for posts
        this.postCount = 0;
    }

    public void createPost(String caption) {
        if(postCount < posts.length) {
            posts[postCount++] = new Post(this, caption);
        } else {
            // Resize the array if needed
            posts = Arrays.copyOf(posts, posts.length * 2);
            posts[postCount++] = new Post(this, caption);
        }
    }

    public void commentOnPost(Post post, String comment) {
        post.addComment(new Comment(this, comment));
    }

    public Post[] getPosts() {
        return Arrays.copyOf(posts, postCount);
    }
}

