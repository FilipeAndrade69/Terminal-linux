package Terminal.factory;

import Terminal.command.Command;
import Terminal.command.verbose.*;
import Terminal.manager.DirectoryManager;

public class VerboseCommandFactory implements CommandFactory {

    @Override
    public Command createPwd(DirectoryManager dm) { return new VerbosePwdCommand(dm); }

    @Override
    public Command createLs(DirectoryManager dm) { return new VerboseLsCommand(dm); }

    @Override
    public Command createCd(DirectoryManager dm) { return new VerboseCdCommand(dm); }

    @Override
    public Command createMkdir(DirectoryManager dm) { return new VerboseMkdirCommand(dm); }

    @Override
    public Command createTouch(DirectoryManager dm) { return new VerboseTouchCommand(dm); }

    @Override
    public Command createRm(DirectoryManager dm) { return new VerboseRmCommand(dm); }

    @Override
    public Command createCat(DirectoryManager dm) { return new VerboseCatCommand(dm); }

    @Override
    public Command createEcho(DirectoryManager dm) { return new VerboseEchoCommand(dm); }

    @Override
    public Command createHistory() { return new VerboseHistoryCommand(); }

    @Override
    public Command createExit() { return new VerboseExitCommand(); }
}
