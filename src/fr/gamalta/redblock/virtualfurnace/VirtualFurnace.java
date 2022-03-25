package fr.gamalta.redblock.virtualfurnace;

import org.bukkit.plugin.java.JavaPlugin;

import fr.gamalta.redblock.virtualfurnace.commands.FurnaceCmd;

public class VirtualFurnace extends JavaPlugin {

	@Override
	public void onEnable() {

		initCommand();

	}

	private void initCommand() {

		getCommand("furnace").setExecutor(new FurnaceCmd(this));

	}

	@Override
	public void onDisable() {

	}
}