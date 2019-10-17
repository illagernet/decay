package net.illager.decay;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

class ChunkRecord {
    
    File file;
    
    public ChunkRecord(JavaPlugin plugin, String path) {
        this.file = new File(this.plugin.getDataFolder(), path);
    }
    
    
}
