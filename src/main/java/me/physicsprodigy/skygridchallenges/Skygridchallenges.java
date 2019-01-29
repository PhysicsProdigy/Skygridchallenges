package me.physicsprodigy.skygridchallenges;

import Commands.sgchallenges;
import Commands.sgcustomchallengesimport;
import Events.Clickeventsandmore;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class Skygridchallenges extends JavaPlugin {


    @Override
    public void onEnable() {
        getCommand("sgchallenges").setExecutor(new sgchallenges(this));
        getCommand("sgchallenges").setExecutor(new sgcustomchallengesimport(this));
        getServer().getPluginManager().registerEvents(new Clickeventsandmore(this),this);
    }

    public void openchallengesmenu(Player p){

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
