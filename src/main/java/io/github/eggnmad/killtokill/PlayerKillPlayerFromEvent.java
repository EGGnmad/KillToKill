package io.github.eggnmad.killtokill;

import io.github.eggnmad.killtokill.event.PlayerKilledPlayerEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerKillPlayerFromEvent implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        if(e.getEntity() instanceof Player && e.getEntity().getKiller() instanceof Player){
            Bukkit.getServer().getPluginManager().callEvent( new PlayerKilledPlayerEvent( e.getEntity().getKiller(), e.getEntity(), e.getEntity().getLastDamageCause().getCause() ) );
        }
    }
}
