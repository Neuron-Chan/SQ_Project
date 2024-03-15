import java.util.ArrayList;

/**
*
* @author Rolf-Jaden Sibal
*
*/

public class ManagementCttee {       
   private ArrayList<SeniorMember> ctteeMembers= new ArrayList<SeniorMember>();
   
   /**
    * Adds a member to the class.
    * 
    * @param member	A name of a person in the class.
    */
   public void addMember (SeniorMember member) {      
      ctteeMembers.add(member);
   }

   /**
    * Removes a member of the class.
    * 
    * @param name A name of a person in the class.
    */
   public void removeCtteeMember (String name) {      
	   ctteeMembers.remove(name);
   }

}