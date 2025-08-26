package com.example.minecraftdeathlogger;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathLogger extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("DeathLogger enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("DeathLogger disabled!");
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        String deathMessage = event.getDeathMessage();
        // とりあえずサーバーコンソールに表示
        Bukkit.getLogger().info("[DeathLogger] " + deathMessage);
        // ★あとでここに「Discord送信処理」を追加します
    }
}
