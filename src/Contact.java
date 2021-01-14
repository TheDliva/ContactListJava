public class Contact {
    private String Name;
    private int position;
    Contact(String name, int pos){
        Name = name;
        position = pos;
    }
    Contact(){
        Name = "John Smith";
        position = 2;
    }

    public int getPosition(){
        return position;
    }

    public String getName(){
        return Name;
    }

    public String toString(){
        return Name + " This is your position on David's list of friends from best friend to worst friend: " + position;
    }
}
