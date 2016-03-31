package phone;

public class IPhone extends CelPhone {
	private String data;
	public static String BRAND = "IPhone";
	public static boolean TURE = true;
	// 아이폰은 집전화기는 생산하지 않는다.

	public IPhone() {
		this.setPortalble(true);
	}

	public String getData() {
		return data;
	}

	// 오버로딩
	public void setData(String name, String data) {

		super.setCompany(BRAND);
		super.setPortalble(TURE);
		super.setCall(name);
		this.data = super.getCompany() + "\t" + super.isPortalble() + "\t" + super.getCall() + "\t" + data
			 + " : 메세지 전달";
	}
}
