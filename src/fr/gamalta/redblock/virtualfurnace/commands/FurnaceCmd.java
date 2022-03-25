package fr.gamalta.redblock.virtualfurnace.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.shanebeestudios.vf.api.FurnaceManager;
import com.shanebeestudios.vf.api.VirtualFurnaceAPI;
import com.shanebeestudios.vf.api.machine.Furnace;

import fr.gamalta.redblock.virtualfurnace.VirtualFurnace;

public class FurnaceCmd implements CommandExecutor {

	private VirtualFurnace main;
	private VirtualFurnaceAPI virtualFurnaceAPI;
	private FurnaceManager furnaceManager;

	public FurnaceCmd(VirtualFurnace main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		this.virtualFurnaceAPI = new VirtualFurnaceAPI(main);
		this.furnaceManager = virtualFurnaceAPI.getFurnaceManager();

		Furnace furnace = furnaceManager.createFurnace("&3Virtual Furnace");

		furnace.openInventory((Player) sender);

		return false;
	}

}
