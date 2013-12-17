package zapcloud.curioseract;

import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import zapcloud.curioseract.listeners.ListenerLogin;
import zapcloud.curioseract.tesseract.gen.ChunkGeneratorTesseract;

public class Curioseract extends JavaPlugin
{
	private static World tesseractWorld;

	@Override
	public void onEnable()
	{
		this.getServer().getPluginManager().registerEvents(new ListenerLogin(), this);
		
		WorldCreator creator = new WorldCreator("tesseract");
		creator.generator(new ChunkGeneratorTesseract());
		tesseractWorld = creator.createWorld();
	}

	@Override
	public void onDisable()
	{

	}

	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id)
	{
		return new ChunkGeneratorTesseract();
	}
	
	public static World getTesseractWorld()
	{
		return tesseractWorld;
	}
}
