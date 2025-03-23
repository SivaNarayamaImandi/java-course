package level2_assignment_programs;

public class MainClass3 {

	public static void main(String[] args) {
		Book.holdStory();
		Book.navigatePage();
	}

}
class Author {
	public static void writeStory()
	{
		System.out.println("writeStory");
	}
	public static void reviewStory()
	{
		System.out.println("reviewStory");
	}
}
class Book {
	public static void holdStory()
	{
		System.out.println("holdStory");
		Author.writeStory();
	}
	public static void navigatePage()
	{
		System.out.println("navigatePage");
		Author.reviewStory();
	}
}