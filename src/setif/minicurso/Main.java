package setif.minicurso;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public static Main pl;
	private ConsoleCommandSender cs = Bukkit.getConsoleSender();
	
	@Override
	public void onEnable() {
		cs.sendMessage("Plugin SETIF Ativado!");
		Bukkit.getPluginManager().registerEvents(new Eventos(), this);
		getCommand("voar").setExecutor(new VoarCMD());
		pl = this;
		saveDefaultConfig();
	}
	
	@Override
	public void onDisable() {
		cs.sendMessage("Plugin SETIF Desativado!");
	}
	
}