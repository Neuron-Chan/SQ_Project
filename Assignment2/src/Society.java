import java.util.ArrayList;

/**
*
* @author Rolf-Jaden Sibal
*
*/

public class Society {
   private String name;      
   private ArrayList<Member> members= new ArrayList<Member>();
   private ManagementCttee managementCttee;

   public Society(String name) {		
		this.name = name;
	}

   public double getFeeTotal() {
      return 100;
   }


   public void setManagementCttee(ManagementCttee managementCttee) {
      this.managementCttee = managementCttee;
   }

   public void addMember (Member member) {      
      members.add(member);
   }


   public void listAllMembers() {
      for(int i = 0; i < members.size(); i++) {
         System.out.print(members.get(i));
         System.out.print(", ");
      }
   }
  
}