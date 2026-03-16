package Terminal.factory;

import Terminal.command.Command;
import Terminal.manager.DirectoryManager;

public interface CommandFactory {
    Command createPwd(DirectoryManager dm);
    Command createLs(DirectoryManager dm);
    Command createCd(DirectoryManager dm);
    Command createMkdir(DirectoryManager dm);
    Command createTouch(DirectoryManager dm);
    Command createRm(DirectoryManager dm);
    Command createCat(DirectoryManager dm);
    Command createEcho(DirectoryManager dm);
    Command createHistory();
    Command createExit();
}
