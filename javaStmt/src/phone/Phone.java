package phone;

/**
 *@file : phone.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 16.
 *@Story 폰의 확장을 통해 상속의 개념을 이해해 보자 
 */
public class Phone {
   private String company, call;

   public String getCompany() {
      return company;
   }

   public void setCompany(String company) {
      this.company = company;
   }

   public String getCall() {
      return call;
   }

   public void setCall(String call) {
      this.call = call + "에게 전화를 겁니다.";
   } 
   
}