/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pw.ian.cloudgame.events;

import org.bukkit.event.HandlerList;
import pw.ian.cloudgame.game.Game;

/**
 *
 * @author ian
 */
public class GameStartEvent extends GameEvent {

    private static final HandlerList handlers = new HandlerList();

    GameStartEvent(Game<?> game) {
        super(game);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
