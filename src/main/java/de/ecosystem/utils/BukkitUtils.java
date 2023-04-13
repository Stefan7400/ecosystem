package de.ecosystem.utils;

import de.ecosystem.Ecosystem;

public final class BukkitUtils {

    private BukkitUtils(){
        // Utils-Class
    }


    public static void runSync(final Runnable runnable){
        Ecosystem.getInstance().getServer().getScheduler().runTask(Ecosystem.getInstance(),runnable);
    }

    public static void runAsync(final Runnable runnable){
        Ecosystem.getInstance().getServer().getScheduler().runTaskAsynchronously(Ecosystem.getInstance(),runnable);
    }

}
