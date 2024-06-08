import java.util.ArrayList;

public class Animal {
    private String name;
    private ArrayList<String> commands = new ArrayList<String>();
    private String birth;

    public Animal(String name, String date){
        setName(name);
        setBirth(date);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getCommands() {
        return commands.toString();
    }

    public int getCommandsLength(){
        return commands.size();
    }

    protected void setCommands(String command) {
        this.commands.add(command);
    }

    public String getBirth() {
        return birth;
    }

    private void setBirth(String birth) {
        this.birth = birth;
    }

    public void printInfo(){
        System.out.println("имя = '" + name + '\'' +
                ", команды = " + commands.toString() +
                ", дата рождения = '" + birth + '\'');
    }

    @Override
    public String toString() {
        return "Имя = " + name;
    }
}