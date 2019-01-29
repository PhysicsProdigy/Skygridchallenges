package Commands;

import me.physicsprodigy.skygridchallenges.Skygridchallenges;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sgcustomchallengesimport implements CommandExecutor {

    Skygridchallenges plugin;

    public sgcustomchallengesimport(Skygridchallenges plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        if (sender instanceof Player && p.hasPermission("Admin")){
            plugin.openchallengesmenu(p);
        }
        return true;
    }
}
