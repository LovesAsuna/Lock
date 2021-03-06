package org.sct.lock.command.sub;

import org.bukkit.command.CommandSender;
import org.sct.easylib.util.function.command.SubCommand;
import org.sct.lock.enumeration.LangType;
import org.sct.lock.file.Lang;

import java.util.List;
import java.util.Map;

public class Help implements SubCommand {

    @Override
    public boolean execute(CommandSender sender, String[] args) {
        List<String> helpList = Lang.getStringList(LangType.LANGUAGE_COMMANDHELP.getPath());

        for (String cmd : helpList) {
            sender.sendMessage(cmd);
        }
        return true;
    }

    @Override
    public Map<Integer, String[]> getParams() {
        return null;
    }

}
