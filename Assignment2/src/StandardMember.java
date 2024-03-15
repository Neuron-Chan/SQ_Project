/**
   *
   * @author Rolf-Jaden Sibal
   *
*/

public class StandardMember extends Member{        
   public StandardMember(String name, String address) {
        super(name, address);
   }

   /**
    * @return 	gets the value of the fee
    */
   public double getFee() {
        return (100 * 1.13);
   }

}