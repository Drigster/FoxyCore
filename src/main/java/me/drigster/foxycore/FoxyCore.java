package me.drigster.foxycore;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class FoxyCore extends JavaPlugin {

    private static JavaPlugin plugin;
    public static FileConfiguration localization;

    // For other classes in our library
    public static JavaPlugin getPlugin() {
        return plugin;
    }

    // This method must not be used any where in the library!
    public static void setPlugin(final JavaPlugin plugin) {
        FoxyCore.plugin = plugin;
    }

    public static void setLocalization(final FileConfiguration localization) {
        FoxyCore.localization = localization;
        System.out.println("set " + localization);
    }
}
