// Class representing a comment on Instagram
public class Comment {
    public User commenter;
    public String text;

    public Comment(User commenter, String text) {
        this.commenter = commenter;
        this.text = text;
    }
}
