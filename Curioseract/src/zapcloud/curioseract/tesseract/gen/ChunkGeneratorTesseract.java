package zapcloud.curioseract.tesseract.gen;

import java.util.Random;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class ChunkGeneratorTesseract extends ChunkGenerator
{
	public byte[][] generateBlockSections(World world, Random random, int x, int z, BiomeGrid biomes)
	{
		return new byte[16][];
	}
}
