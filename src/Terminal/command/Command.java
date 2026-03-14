package Terminal.command;

public interface Command { //oferece herança de tipo (interface)
    void execute(String[] args) throws Exception;
}
