import java.util.ArrayList;

public class Team {
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> position = new ArrayList<>();

    void newMember(String nameIn, String positionIn){
        name.add(nameIn);
        position.add(positionIn);
    }
    void leaveTeam(String nameOut){
        int x = name.indexOf(nameOut);
        name.remove(x);
        position.remove(x);
    }
    String getMembers(){
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < name.size(); i++){
            out.append(name.get(i));
            out.append(" ");
            out.append(position.get(i));
            if(i != name.size() - 1)
                out.append("\n");
        }


        return out.toString();
    }
}

class PositionChanges extends Team{
    public void promote(String nameIn, String positionNew){
        int x = super.name.indexOf(nameIn);
        super.position.set(x, positionNew);
    }
}
