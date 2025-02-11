package me.outspending.biomesapi;

import me.outspending.biomesapi.annotations.AsOf;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a functional interface that represents a biome registry in Minecraft.
 * It includes a method to register a custom biome to a Minecraft server.
 * It also includes a static method to create a new BiomeRegistry object, which returns an instance of CustomBiomeRegistry.
 *
 * @version 0.0.1
 */
@AsOf("0.0.1")
@FunctionalInterface
public interface BiomeRegistry {

    /**
     * This static method creates a new BiomeRegistry object.
     * It returns a new instance of CustomBiomeRegistry.
     *
     * @version 0.0.1
     * @return a new CustomBiomeRegistry object.
     */
    @AsOf("0.0.1")
    static BiomeRegistry newRegistry() {
        return new CustomBiomeRegistry();
    }

    /**
     * This method registers a custom biome to a Minecraft server.
     * It takes a DedicatedServer object and a CustomBiome object as arguments.
     *
     * @version 0.0.1
     * @param biome The CustomBiome object that should be registered to the server.
     */
    @AsOf("0.0.1")
    void register(@NotNull CustomBiome biome);

}
