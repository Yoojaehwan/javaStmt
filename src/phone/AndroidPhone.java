package phone;

public class AndroidPhone extends IPhone{
	public final static String BRAND ="Android"; //오버라이딩
	private String size;
	private String data; // 부모클래스의 프로펄티와 통일하게 선언
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getData() {
		return data;
	}
	
	//오버로딩
	public void setData(String data, String name, String size) {

	      super.setCompany(BRAND); //오버라이딩
	      super.setPortalble(TURE); 
	      super.setCall(name);
	      this.setSize(size);
	      this.data =
	    		  super.getCompany()+"\t"
	    		  +super.isPortalble()+"\t"
	    		  +super.getCall()+"\t"
	    		  +"대화면"+this.getSize()+"로 볼수 있다."
	    		  +data+" : 카톡 메세지 전달";
	      
	      
	}
	@Override
	public void setCall(String call) {
		// TODO Auto-generated method stub
		super.setCall(call);
	}
	@Override
	public String getCall() {
		// TODO Auto-generated method stub
		return super.getCall();
	}
	
	
}
