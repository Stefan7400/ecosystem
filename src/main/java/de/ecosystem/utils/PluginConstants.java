package de.ecosystem.utils;

/**
 * Constants which are used in this plugin
 */
public final class PluginConstants {

    private PluginConstants(){
        //Storage-Class
    }

    //Permission-Prefixes
    private static final String GENERIC_PERMISSION_PREFIX = "economy.";
    public static final String MONEY_PERMISSION = GENERIC_PERMISSION_PREFIX + "money";
    public static final String MONEY_OTHERS_PERMISSION = GENERIC_PERMISSION_PREFIX + "money.other";
    public static final String PAY_PERMISSION = GENERIC_PERMISSION_PREFIX + "pay";
    public static final String ECO_TOP_PERMISSION = GENERIC_PERMISSION_PREFIX + "top";
    public static final String ECO_SET_PERMISSION = GENERIC_PERMISSION_PREFIX + "set";
    public static final String ECO_ADD_PERMISSION = GENERIC_PERMISSION_PREFIX + "eco.add";
    public static final String ECO_REMOVE_PERMISSION = GENERIC_PERMISSION_PREFIX + "eco.remove";
    public static final String ECO_RESET_PERMISSION = GENERIC_PERMISSION_PREFIX + "eco.reset";


}
