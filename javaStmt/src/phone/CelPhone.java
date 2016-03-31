package phone;

public class CelPhone  extends Phone{
   private boolean portalble; //이동성 존재
   private String move;

   
   public CelPhone() {
	this.setPortalble(true); // 움직이게 만들기 위해서 
   }
   public boolean isPortalble() {
      return portalble;
   }
   public void setPortalble(boolean portalble) {
      if (portalble) {
         this.setMove("폰을 가지고 다닐 수 있음");
      } else {
         this.setMove("폰을 가지고 다닐 수 없음");
      }
      this.portalble = portalble;
   }
   public String getMove() {
      return move;
   }
   public void setMove(String move) {
      this.move = move;
      
      
      }
   @Override
	public String getCall() {
		return super.getCall()+"동시에 " +this.getMove();
	}
   }

