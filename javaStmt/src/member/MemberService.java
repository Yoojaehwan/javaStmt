package member;

import java.util.HashMap;

public interface MemberService {
	public void join(MemberBean member);
	public MemberBean login(String id, String password);
	public MemberBean detail(String id);
	public MemberBean update(MemberBean member,String password, String Addr, int Birth);
	public MemberBean remove(String id);
}
