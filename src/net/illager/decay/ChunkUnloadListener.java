package net.illager.decay;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.ChunkUnloadEvent;

public class ChunkUnloadListener implements Listener {
    
    Decay plugin;
    
    public ChunkUnloadListener(Decay plugin) {
        this.plugin = plugin;
    }
        
    @EventHandler
    public void onChunkUnload(ChunkUnloadEvent event) {
        if(event.isSaveChunk()) {
            this.plugin.recordUnload(event.getChunk());
        }
    }
}
