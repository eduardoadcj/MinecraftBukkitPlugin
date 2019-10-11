package setif.minicurso;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
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
	
	@EventHandler
	public void AntiDV(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		for(Player p2 : Bukkit.getOnlinePlayers()) {
			
			if(p2.isOp())
				return;
			
			for(String redes: Main.pl.getConfig().getStringList("IPs_Bloqueados")) {
				if(e.getMessage().contains(redes)) {
					e.setCancelled(true);
					p.sendMessage("§cNão pode divulgar não cara!!!");
					
					if(p2.isOp()) {
						p.sendMessage("O jogador "+p.getName()+" esta divulgado no servidor");
						p.sendMessage("Mensagem do jogador: "+e.getMessage());
					}	
					
				}
			}
			
		}
	}
	
	
}
