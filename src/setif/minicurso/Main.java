package setif.minicurso;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public static ConsoleCommandSender cs = Bukkit.getConsoleSender();
	
	@Override
	public void onEnable() {
		cs.sendMessage("Vai Brasilian!");
	}
	
	@Override
	public void onDisable() {
		cs.sendMessage("Não vai brasilian!");
	}
	
}