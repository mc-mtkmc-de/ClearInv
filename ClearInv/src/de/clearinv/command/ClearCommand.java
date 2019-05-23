package de.clearinv.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission("inventory.clear")) {
				if(args.length == 0) {
				
					player.getInventory().clear();
				
					player.sendMessage("§cDein Inventar wurde geleert!");
				
				} else if(args.length == 1) {
					Player target = Bukkit.getPlayer(args[0]);
					if(target !=null) {
						
						target.getInventory().clear();
						
						target.sendMessage("§cDein Ineventar wurde geleert!");
						player.sendMessage("§cDu hast das Inventar von §6" + target.getName() + "§c geleert!");
					} else
						player.sendMessage("§cDer Spieler §6" + args[0] + "§c ist nicht auf dem Server.");
				}
				
			} else
				player.sendMessage("§cDazu hast du keine Rechte!");
		}
		
		return false;
	}

}
