package aa;

import com.opensymphony.xwork2.Action;

public class Hello implements Action{

	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String execute() throws Exception {
		content="Hello,world";
		return Action.SUCCESS;
	}

}
