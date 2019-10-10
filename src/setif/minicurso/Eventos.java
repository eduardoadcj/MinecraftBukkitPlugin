package setif.minicurso;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Eventos implements Listener{
	
	@EventHandler
	public void Entrar(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		e.setJoinMessage("§cBem vindo "+p.getName()+"!");
	}
	
	@EventHandler
	public void Sair(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		e.setQuitMessage("§cFlw "+p.getName()+"!");
	}
	
}
