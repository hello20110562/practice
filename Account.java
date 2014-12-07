//封装
public class Account{
	private String user = "hello";// 权限私人设置
	private String passworld ="14526";
	
	public void setPwd(String str){//权限公共设置
		this.passworld= str;
		
	}
	public void setUser(String ss){
		this.user = ss;
	}
	public void info(){
		System.out.println("user="+this.user+"\t"+"passworld"+this.passworld);
	}
}