// Main class to demonstrate the usage
public class Instagram {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("user1", "user1@example.com");
        User user2 = new User("user2", "user2@example.com");


        // User1 creates a post
        user1.createPost("\nThis is my first post!");

        // User2 comments on User1's post
        user2.commentOnPost(user1.getPosts()[0], "wow so nice!");

        // Print out the post with comments
        Post post = user1.getPosts()[0];
        System.out.println("|Post by: " + post.author.username + "|" + " Email: " + user1.email);
        System.out.println("Caption: " + post.caption);
        System.out.println("Comments:");
        for (int i = 0; i < post.commentCount; i++) {
            Comment comment = post.comments[i];
            System.out.println(comment.commenter.username + ": " + comment.text);
        }
    }
}
