package io.github.eggnmad.killtokill.listener;

import io.github.eggnmad.killtokill.event.PlayerKilledPlayerEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerKilledPlayerListener implements Listener {
    @EventHandler
    public void onPlayerKilledPlayer(PlayerKilledPlayerEvent e){
        Bukkit.getServer().broadcastMessage("Player killed player");
        Bukkit.getServer().broadcastMessage("Attacker" + e.getAttacker().getName());
        Bukkit.getServer().broadcastMessage("Victim" + e.getVictim().getName());
    }
}
