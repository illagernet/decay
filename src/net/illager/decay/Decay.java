package net.illager.decay;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.ChunkUnloadEvent;

public class Decay extends JavaPlugin implements Listener {
    
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new ChunkUnloadListener(), this);
    }
    
    @Override
    public void onDisable() {
        // not used
    }
    
    /**
     *
     */
    @EventHandler
    void onChunkUnload(ChunkUnloadEvent event) {
        if(event.isSaveChunk())
            recordUnload(event.getChunk());
    }
    
    void recordUnload() {
        
    }
}
