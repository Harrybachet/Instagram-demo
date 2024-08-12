import java.util.Arrays;

// Class representing a post on Instagram
public class Post {
    public User author;
    public String caption;
    public Comment[] comments;
    public int commentCount;

    public Post(User author, String caption) {
        this.author = author;
        this.caption = caption;
        this.comments = new Comment[10]; // Initial capacity for comments
        this.commentCount = 0;
    }

    public void addComment(Comment comment) {
        if (commentCount < comments.length) {
            comments[commentCount++] = comment;
        } else {
            // Resize the array if needed
            comments = Arrays.copyOf(comments, comments.length * 2);
            comments[commentCount++] = comment;
        }
    }
}
