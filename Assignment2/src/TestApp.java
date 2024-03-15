/**
   *
   * @author Rolf-Jaden Sibal
   *
*/

public class TestApp {
    public static void main(String[] args) {
        //create the members 
        Member jane = new StandardMember("Jane","1 queen st. ");
        Member mike = new SeniorMember("mike","1 king st. ",60);
        Member noah = new SeniorMember("Noah","100 king st. ",40);
        //create the society
        Society ontarioTech = new Society("ontario Tech");
        //add members to the society
        ontarioTech.addMember(mike);
        ontarioTech.addMember(jane);
        ontarioTech.addMember(noah);
        // create the Management committee 
        ManagementCttee managementCttee = new ManagementCttee();
        
      //check if Mike is a senior member in the society  
        if (((SeniorMember) mike).isSeniorMember()) { 
            managementCttee.addMember((SeniorMember) mike); 
        }
        
        //add the management committee to the society 
        ontarioTech.setManagementCttee(managementCttee);
        
        //list all the members in the committee 
        ontarioTech.listAllMembers();
        //list all the members in the committee 
        System.out.println(ontarioTech.getFeeTotal());
      
  }
}