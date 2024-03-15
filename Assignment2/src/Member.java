/**
   *
   * @author Rolf-Jaden Sibal
   *
*/

public abstract class Member {  
	/**
	    * Defines a member to the class.
	    * 
	    * @param name A name of a person in the class.
	    * @param address The address of a person in the class.
	    */
	   
   private String name;
   private String address;
   
   /**
    * Defines a member to the class.
    * 
    * @param name A name of a person in this.
    * @param address The address of a person in this.
    */
   
   
   public Member(String name, String address) {
      this.name = name;
      this.address = address;      
   }

   /**
    * Returns the value of the name to the class.
    * 
    * @return name The value of the name.
    */
   
    public String getName() {
      return name;
   }
 
    /**
     * Returns the value of the address to the class.
     * 
     * @return address The value of the address.
     */
    
   public String getAddress() {
      return address;
   }
   
   /**
    * Defines a member to the class.
    * 
    * @return getFee defines a body getFee.
    */
      
   
   public abstract double getFee();

}