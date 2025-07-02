package des.deving.lava;

import des.deving.lava.listeners.JoinLeaveListener;
import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lava extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Successfully Loaded!");

        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this );
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin Successfully Unloaded!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // /die - kills the player
        if (command.getName().equalsIgnoreCase("die")){

            if (sender instanceof Player p) {
                p.setHealth(0.0);
                p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Why would you want to die? Alright, your wish is my command.");
                return true;
            }else if (sender instanceof ConsoleCommandSender){
                System.out.println("This command can only be run by players!");
            }else if(sender instanceof BlockCommandSender){
                System.out.println("This command can only be run by players!");
            }

        }
        return super.onCommand(sender, command, label, args);
    }
}

