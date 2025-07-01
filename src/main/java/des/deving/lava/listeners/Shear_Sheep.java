package des.deving.lava.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class Shear_Sheep implements Listener {

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent e){
        Player player = e.getPlayer();
        Entity entity = e.getEntity();
        if (entity.getType() == EntityType.SHEEP){
            e.setCancelled(true);
        }else{
            player.sendMessage("This ain't no sheep dude, whatchu tryna do here????!!!?!?!!!?!??!");
            player.giveExpLevels(1);
        }

    }
}
