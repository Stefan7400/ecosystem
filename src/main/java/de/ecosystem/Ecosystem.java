package de.ecosystem;

import de.ecosystem.commands.EcoCommand;
import de.ecosystem.commands.MoneyCommand;
import de.ecosystem.commands.PayCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class Ecosystem extends JavaPlugin {


    private static JavaPlugin instance;

    @Override
    public void onEnable() {
        instance = this;


        registerListener();
        registerCommands();
    }

    private void registerListener(){
        final PluginManager pluginManager = Bukkit.getPluginManager();
        final List<Listener> listenerList = List.of();

        listenerList.forEach(listener -> pluginManager.registerEvents(listener,this));
    }

    private void registerCommands(){
        final Map<String, CommandExecutor> executorMap = new HashMap<>();

        executorMap.put("money",new MoneyCommand());
        executorMap.put("pay",new PayCommand());
        executorMap.put("eco", new EcoCommand());

        executorMap.forEach((identifier,executor) -> {

            final PluginCommand command = getCommand(identifier);
            Objects.requireNonNull(command);

            command.setExecutor(executor);
            if(executor instanceof TabCompleter tabCompleter){
                command.setTabCompleter(tabCompleter);
            }
        });

    }

    public static JavaPlugin getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
