package setif.minicurso;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VoarCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lb, String[] args) {

		if (!(s instanceof Player))
			return true;

		if (lb.equalsIgnoreCase("voar")) {

			Player p = (Player) s;
			if (!p.isOp()) {
				p.sendMessage("§c Permissão negada!");
				return true;
			}

			p.setAllowFlight(!p.getAllowFlight());

			p.sendMessage(p.getAllowFlight() ? "Parabens vc conseguiu um Jetpack!" : "Vc perdeu o Jetpack!");

		}

		return false;
	}

}
