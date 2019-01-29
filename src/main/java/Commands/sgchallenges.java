package Commands;

import me.physicsprodigy.skygridchallenges.Skygridchallenges;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sgchallenges implements CommandExecutor {

    Skygridchallenges plugin;

    public sgchallenges(Skygridchallenges plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player)sender;
            plugin.openchallengesmenu(p);
        }

        return true;
    }



}
