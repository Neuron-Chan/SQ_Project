/**
   *
   * @author Rolf-Jaden Sibal
   *
*/

public class SeniorMember extends Member{    
   private double fee;

   public SeniorMember(String name, String address, double fee) {        
        super(name, address);
        this.fee = fee;
   }

   /**
    * @return 	returns fee
    */
   
   public double getFee() {
        return fee;
   }

   /**
    * @return 	returns true when function is called
    */
   
    public boolean isSeniorMember() {
         return true;
   }
}