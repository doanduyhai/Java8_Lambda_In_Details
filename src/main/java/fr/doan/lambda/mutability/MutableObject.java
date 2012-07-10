package fr.doan.lambda.mutability;

public class MutableObject
{
	private String content = "default_content";

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

}
