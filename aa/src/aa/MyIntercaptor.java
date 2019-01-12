package aa;



import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyIntercaptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("我开始拦截");
		String result=invocation.invoke();
		System.out.println("返回信息："+result);
		return result;
	}

}
