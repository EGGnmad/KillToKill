package io.github.eggnmad.killtokill;

import io.github.eggnmad.killtokill.callEvent.callEventPlayerKilledPlayerEvent;
import io.github.eggnmad.killtokill.event.PlayerKilledPlayerEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class KillToKill extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getPluginManager().registerEvents(new callEventPlayerKilledPlayerEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
