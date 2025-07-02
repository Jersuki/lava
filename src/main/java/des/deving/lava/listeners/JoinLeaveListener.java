package des.deving.lava.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent leaveEvent){
        //Getting the player
        Player player = leaveEvent.getPlayer();
        //Setting the Quit message
        leaveEvent.setQuitMessage(ChatColor.YELLOW+player.getDisplayName()+" has left, lets hope they never return! >:)");
    }
    @EventHandler
    public void onLeave(PlayerJoinEvent joinEvent){
        Player player = joinEvent.getPlayer();

        if (player.hasPlayedBefore()){
            joinEvent.setJoinMessage(ChatColor.YELLOW+"Awh man, "+player.getDisplayName()+" came back... :(");
        }else{
            joinEvent.setJoinMessage(ChatColor.YELLOW+"Yo? A new player? That's actually really dumb! Don't welcome "+player.getDisplayName()+" to the server.");
        }
    }
}
