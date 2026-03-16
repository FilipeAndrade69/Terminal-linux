package Terminal.factory;

import Terminal.command.*;
import Terminal.manager.DirectoryManager;

public class StandardCommandFactory implements CommandFactory {

    @Override
    public Command createPwd(DirectoryManager dm) { return new PwdCommand(dm); }

    @Override
    public Command createLs(DirectoryManager dm) { return new LsCommand(dm); }

    @Override
    public Command createCd(DirectoryManager dm) { return new CdCommand(dm); }

    @Override
    public Command createMkdir(DirectoryManager dm) { return new MkdirCommand(dm); }

    @Override
    public Command createTouch(DirectoryManager dm) { return new TouchCommand(dm); }

    @Override
    public Command createRm(DirectoryManager dm) { return new RmCommand(dm); }

    @Override
    public Command createCat(DirectoryManager dm) { return new CatCommand(dm); }

    @Override
    public Command createEcho(DirectoryManager dm) { return new EchoCommand(dm); }

    @Override
    public Command createHistory() { return new HistoryCommand(); }

    @Override
    public Command createExit() { return new ExitCommand(); }
}
