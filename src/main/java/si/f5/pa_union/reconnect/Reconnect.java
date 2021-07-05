package si.f5.pa_union.reconnect;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ConnectingScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.multiplayer.ServerData;

public class Reconnect {
    public static String serverIP;
    public static Screen lastScreen;
    public static boolean isLan;

    public static void reconnect() {
        Minecraft.getInstance().displayGuiScreen(new ConnectingScreen(lastScreen, Minecraft.getInstance(), new ServerData("Reconnect", serverIP, isLan)));
    }
}
