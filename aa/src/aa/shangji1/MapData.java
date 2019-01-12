package aa.shangji1;

import java.util.HashMap;
import java.util.Map;



public class MapData {

	private Map<String, User> map=new HashMap<String, User>();
	public String errorMsg="";
	{
		map.put("1",new User("admin","123456"));

        map.put("2",new User("aaa","123456"));

        map.put("3",new User("bbb","123456"));
	}
	
	public void addMapData(User user){
		if(!isExitsUser(user)){
			String i=String.valueOf(Math.random()*10+1);
			map.put(i, user);
		}else{
			errorMsg="用户已存在";
		}
	}
	
	
	public boolean isExitsUser(User user){
		boolean flag=false;
		User u=new User();
		for(String key:map.keySet()){
			u=map.get(key);
			if(u.getUsername().equals(user.getUsername())){
				flag=true;
			}
		}
		return flag;
	}
	
	
	
}
