package io.github.eggnmad.killtokill.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.jetbrains.annotations.NotNull;

public class PlayerKilledPlayerEvent extends Event {
    private Player attacker;
    private Player victim;
    private DamageCause damageCause;
    public static final HandlerList HANDLER_LIST = new HandlerList();

    public PlayerKilledPlayerEvent(@NotNull Player attacker, @NotNull Player victim, DamageCause damageCause) {
        this.attacker = attacker;
        this.victim = victim;
        this.damageCause = damageCause;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList(){
        return HANDLER_LIST;
    }

    public Player getAttacker(){
        return this.attacker;
    }

    public Player getVictim(){
        return this.victim;
    }

    public DamageCause getDamageCause() {
        return damageCause;
    }
}
