package level1_assignment_programs;

public class SocialMediaPost {

	public static void main(String[] args) {
		System.out.println("Main method");
		SocialMediaPost m = new SocialMediaPost();
		m.createPost();
	}
	public void createPost()
	{
		System.out.println("createPost method");
		publishPost();
		generatePostID();
	}
	public void publishPost()
	{
		System.out.println("publishPost method");
	}
	public static void generatePostID()
	{
		System.out.println("generatePostID method");
	}
}