package des.deving.lava;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lava extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Successfully Loaded!");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin Successfully Unloaded!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        event.setJoinMessage("Welcome "+event.getPlayer().getName()+" to the server!");

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        event.setQuitMessage("Goodbye "+event.getPlayer().getName()+"!");
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.sendMessage ("Wowwww you got out of the bed? Weirdo");
    }

}

