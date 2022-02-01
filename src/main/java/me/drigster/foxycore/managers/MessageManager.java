package me.drigster.foxycore.managers;

import me.drigster.foxycore.FoxyCore;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.List;

public class MessageManager {

    static FileConfiguration localization = FoxyCore.localization;

    public static void sendMessage(Player p, String code){
        String message = createLocalizedString(code);
        message = createLocalizedString("prefix") + message;

        p.sendMessage(message);
    }

    public static void sendMessageWithPlaceholder(Player p, String code, String placeholder, String filler){
        String message = createLocalizedStringWithPlaceholder(code, placeholder, filler);
        message = createLocalizedString("prefix") + message;

        p.sendMessage(message);
    }

    public static void sendMessageWithPlaceholder(Player p, String code, List<String> placeholders, List<String> fillers){
        String message = createLocalizedStringWithPlaceholder(code, placeholders, fillers);
        message = createLocalizedString("prefix") + message;

        p.sendMessage(message);
    }

    public static String createLocalizedString(String code){
        String localizedString = localization.getString(code);
        if(localizedString == null){
            localizedString = localization.getDefaults().getString(code);
            if(localizedString == null){
                localizedString = code;
                return localizedString;
            }
        }

        localizedString = localizedString.replace("&", "§");

        return localizedString;
    }

    public static String createLocalizedStringWithPlaceholder(String code, String placeholder, String filler){
        String string = createLocalizedString(code);
        string = string.replaceAll(placeholder, filler);
        return string;
    }

    public static String createLocalizedStringWithPlaceholder(String code, List<String> placeholders, List<String> fillers){
        String string = createLocalizedString(code);
        for (int i=0; i<placeholders.size(); i++)
        {
            String placeholder = placeholders.get(i);
            String filler = fillers.get(i);
            string = string.replaceAll(placeholder, filler);
        }
        return string;
    }
}
