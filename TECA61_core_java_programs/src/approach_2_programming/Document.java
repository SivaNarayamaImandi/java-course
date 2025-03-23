package approach_2_programming;

public class Document 
{
	//private String filename;
	private int filesize;
	private String filetype;
	
	public void initialize(String filename,int filesize,String filetype)
	{
		if(filesize>=10&&filesize<=99)
		{
			this.filesize=filesize;
		}
		else
		{
			System.err.println("INAVLID DATA");
		}
		if(filetype.equals("PDF") || filetype.equals("TXT") || filetype.equals("DOC"))
		{
			this.filetype=filetype;
		}
		else
		{
			System.err.println("INAVID DATA");
		}
	}
	
	public void display()
	{
		System.out.println(filetype+" : is a document type \n"+filesize+" : is document size");
	}
}
