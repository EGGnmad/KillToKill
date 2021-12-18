package io.github.eggnmad.killtokill;

import io.github.eggnmad.killtokill.listener.PlayerKilledPlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class KillToKill extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerKilledPlayerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
