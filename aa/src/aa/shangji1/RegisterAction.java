package aa.shangji1;

import com.opensymphony.xwork2.Action;

public class RegisterAction implements Action{

	private User user=new User();
	private String errorMsg="";
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String execute() throws Exception {
		MapData mapdata=new MapData();
		mapdata.addMapData(user);
		if(mapdata.errorMsg==""){
			return Action.SUCCESS;
		}else{
			this.errorMsg=mapdata.errorMsg;
			return Action.ERROR;
		}

	}
	
	
}
