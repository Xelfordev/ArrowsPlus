package me.PimpDuck.ArrowsPlus;

import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireworkEffectPlayer {

    public void playFirework(World world, Location loc, FireworkEffect fe) {
        Firework fw = world.spawn(loc, Firework.class);
        FireworkMeta meta = fw.getFireworkMeta();
        meta.clearEffects();
        meta.setPower(1);
        meta.addEffect(fe);
        fw.setFireworkMeta(meta);
        fw.detonate();
    }
}
