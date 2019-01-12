package aa.shangji1;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{

	private User user=new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("Ö´ÐÐ");
		if(info(user)){
			return Action.SUCCESS;
		}else{
			return Action.ERROR;
		}
	}
	
	public boolean info(User user){
		boolean flag=false;
		if(user.getUsername().equals("admin")&&user.getPassword().equals("123456")){
			flag=true;
		}else if(user.getUsername().equals("aaa")&&user.getPassword().equals("123456")){
			flag=true;
		}else if(user.getUsername().equals("bbb")&&user.getPassword().equals("123456")){
			flag=true;
		}else{
			flag=false;
		}
		return flag;
		
	}
}
