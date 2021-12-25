package io.github.eggnmad.killtokill.listener;

import io.github.eggnmad.killtokill.event.PlayerKilledPlayerEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerKilledPlayerListener implements Listener {

    @EventHandler
    public void onPlayerKilledPlayer(PlayerKilledPlayerEvent e){
        Bukkit.getLogger().info( e.getAttacker().toString() + "killed" + e.getVictim().toString() );
    }
}
