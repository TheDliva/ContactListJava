public class ContactTest {
    public static void main(String[] args){
        Contact davidsContacts[];
        davidsContacts = new Contact[10];

        for(int i = 0; i<davidsContacts.length; i++){
            Contact tempTact = new Contact(("Davids Friend " + (i+1)), i+1);
            davidsContacts[i] = tempTact;
        }

        for (int i = 0; i<davidsContacts.length; i++){
            System.out.println(davidsContacts[i].toString());
        }
    }
}
