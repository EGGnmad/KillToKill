package io.github.eggnmad.killtokill.callEvent;

import io.github.eggnmad.killtokill.event.PlayerKilledPlayerEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class callEventPlayerKilledPlayerEvent implements Listener {

    @EventHandler
    public void onPlayerKilledPlayer(PlayerDeathEvent e){
        if(e.getEntity().getKiller() instanceof Player){
            Bukkit.getServer().getPluginManager().callEvent( new PlayerKilledPlayerEvent(e.getEntity().getKiller(), e.getEntity(), e.getEntity().getLastDamageCause().getCause()) );
        }
    }
}
