//��װ
public class Account{
	private String user = "hello";// Ȩ��˽������
	private String passworld ="14526";
	
	public void setPwd(String str){//Ȩ�޹�������
		this.passworld= str;
		
	}
	public void setUser(String ss){
		this.user = ss;
	}
	public void info(){
		System.out.println("user="+this.user+"\t"+"passworld"+this.passworld);
	}
}