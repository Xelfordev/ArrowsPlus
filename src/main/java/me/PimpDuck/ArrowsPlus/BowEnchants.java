package me.PimpDuck.ArrowsPlus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class BowEnchants implements Listener, CommandExecutor {
    private ArrowsPlus plugin;

    final FireworkEffectPlayer fplayer = new FireworkEffectPlayer();

    public BowEnchants(ArrowsPlus instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if (sender instanceof Player) {
            if (((Player)sender).getInventory().getItemInMainHand().getType() == Material.BOW) {
                if (command.getName().equalsIgnoreCase("arrowsplus")) {
                    Player player1 = (Player)sender;
                    ItemMeta im = player1.getInventory().getItemInMainHand().getItemMeta();
                    List<String> l = new ArrayList();
                    l.addAll((im.getLore() != null) ? im.getLore() : Collections.EMPTY_LIST);
                    if (args.length == 0) {
                        sender.sendMessage(ChatColor.RED + "=============" + ChatColor.AQUA + " [ ArrowsPlus ] " + ChatColor.RED + "=============");
                        sender.sendMessage(ChatColor.GOLD + "Please specify an enchantment to add to your bow!");
                        sender.sendMessage(ChatColor.AQUA + "Firework, Explosion, Lightning, Potion, and Mob.");
                        sender.sendMessage(ChatColor.RED + "=========================================");
                    }
                    if (args.length > 0)
                        if (args[0].equalsIgnoreCase("firework")) {
                            if (args.length > 1) {
                                if (args[1].equalsIgnoreCase("red")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.red")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("blue")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.blue")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework II");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("green")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.green")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework III");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("aqua")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.aqua")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework IV");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("purple")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.purple")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework V");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("white")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.white")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework VI");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("black")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.black")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework VII");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("yellow")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.yellow")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework VIII");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("orange")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.orange")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework IX");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("pink")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.pink")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework X");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("all")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.firework.all")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework I");
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework II");
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework III");
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework IV");
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework V");
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework VI");
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework VII");
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework VIII");
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework IX");
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Firework X");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else {
                                    sender.sendMessage(ChatColor.RED + "=============" + ChatColor.AQUA + " [ ArrowsPlus ] " + ChatColor.RED + "=============");
                                    sender.sendMessage(ChatColor.DARK_RED + "Can't find that color! " + ChatColor.GOLD + "Here's a list of the colors:");
                                    sender.sendMessage(ChatColor.AQUA + "Yellow, Black, White, Purple, Pink, Aqua, Green,");
                                    sender.sendMessage(ChatColor.AQUA + "Orange, Blue, Red, or All.");
                                    sender.sendMessage(ChatColor.RED + "=========================================");
                                }
                            } else {
                                sender.sendMessage(ChatColor.RED + "=============" + ChatColor.AQUA + " [ ArrowsPlus ] " + ChatColor.RED + "=============");
                                sender.sendMessage(ChatColor.GOLD + "Please specify a firework color to add to your bow!");
                                sender.sendMessage(ChatColor.AQUA + "Yellow, Black, White, Purple, Pink, Aqua, Green,");
                                sender.sendMessage(ChatColor.AQUA + "Orange, Blue, Red, or All.");
                                sender.sendMessage(ChatColor.RED + "=========================================");
                            }
                        } else if (args[0].equalsIgnoreCase("explosion")) {
                            if (args.length > 1) {
                                if (args[1].equalsIgnoreCase("small")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.explosion.small")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Explosion I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("normal")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.explosion.normal")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Explosion II");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("big")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.explosion.big")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Explosion III");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else {
                                    sender.sendMessage(ChatColor.RED + "=============" + ChatColor.AQUA + " [ ArrowsPlus ] " + ChatColor.RED + "=============");
                                    sender.sendMessage(ChatColor.DARK_RED + "Can't find that size! " + ChatColor.GOLD + "Here's a list of the sizes:");
                                    sender.sendMessage(ChatColor.AQUA + "Small, Normal, and Big");
                                    sender.sendMessage(ChatColor.RED + "=========================================");
                                }
                            } else {
                                sender.sendMessage(ChatColor.RED + "=============" + ChatColor.AQUA + " [ ArrowsPlus ] " + ChatColor.RED + "=============");
                                sender.sendMessage(ChatColor.GOLD + "Please specify an explosion size. Here's a list:");
                                sender.sendMessage(ChatColor.AQUA + "Small, Normal, and Big");
                                sender.sendMessage(ChatColor.RED + "=========================================");
                            }
                        } else if (args[0].equalsIgnoreCase("lightning")) {
                            if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.lightning")) {
                                l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Lightning Arrow I");
                                sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                            } else {
                                sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                            }
                        } else if (args[0].equalsIgnoreCase("potion")) {
                            if (args.length > 1) {
                                if (args[1].equalsIgnoreCase("poison")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.potion.poison")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Poison Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("slowness")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.potion.slowness")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Slowness Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("speed")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.potion.speed")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Speed Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("jump")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.potion.jump")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Jump Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("blindness")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.potion.blindness")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Blindness Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("confusion")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.potion.confusion")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Confusion Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("invisibility")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.potion.invisibility")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Invisibility Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("nightvision")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.potion.nightvision")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "NightVision Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("weakness")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.potion.weaknesss")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Weakness Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else {
                                    sender.sendMessage(ChatColor.RED + "=============" + ChatColor.AQUA + " [ ArrowsPlus ] " + ChatColor.RED + "=============");
                                    sender.sendMessage(ChatColor.DARK_RED + "Can't find that potion! " + ChatColor.GOLD + "Here's a list of the potions:");
                                    sender.sendMessage(ChatColor.AQUA + "Poison, Slowness, Speed, Jump, Blindness,");
                                    sender.sendMessage(ChatColor.AQUA + "Confusion, Invisibility, NightVision, and Weakness.");
                                    sender.sendMessage(ChatColor.RED + "=========================================");
                                }
                            } else {
                                sender.sendMessage(ChatColor.RED + "=============" + ChatColor.AQUA + " [ ArrowsPlus ] " + ChatColor.RED + "=============");
                                sender.sendMessage(ChatColor.GOLD + "Please specify a potion type! Here's a list of the potions:");
                                sender.sendMessage(ChatColor.AQUA + "Poison, Slowness, Speed, Jump, Blindness,");
                                sender.sendMessage(ChatColor.AQUA + "Confusion, Invisibility, NightVision, and Weakness.");
                                sender.sendMessage(ChatColor.RED + "=========================================");
                            }
                        } else if (args[0].equalsIgnoreCase("mob")) {
                            if (args.length > 1) {
                                if (args[1].equalsIgnoreCase("cow")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.cow")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Cow Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("chicken")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.chicken")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Chicken Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("mushroomcow")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.mushroomcow")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "MushroomCow Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("pig")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.pig")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Pig Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("slime")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.slime")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Slime Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("snowman")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.snowman")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Snowman Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("squid")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.squid")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Squid Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("villager")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.villager")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Villager Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("zombie")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.zombie")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Zombie Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("pigzombie")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.pigzombie")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "PigZombie Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("skeleton")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.skeleton")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Skeleton Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("blaze")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.blaze")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Blaze Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("cavespider")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.cavespider")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "CaveSpider Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("ghast")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.ghast")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Ghast Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("giant")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.giant")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Giant Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("magmacube")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.magmacube")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "MagmaCube Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("creeper")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.creeper")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Creeper Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("enderman")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.enderman")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Enderman Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("enderdragon")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.enderdragon")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "EnderDragon Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("spider")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.spider")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Spider Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else if (args[1].equalsIgnoreCase("wolf")) {
                                    if (sender.hasPermission("arrowsplus.*") || sender.hasPermission("arrowsplus.mob.wolf")) {
                                        l.add("" + ChatColor.AQUA + ChatColor.BOLD + "Wolf Arrow I");
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Enchantment added to your bow!");
                                    } else {
                                        sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.RED + "You don't have the permission to do this!");
                                    }
                                } else {
                                    sender.sendMessage(ChatColor.RED + "=============" + ChatColor.AQUA + " [ ArrowsPlus ] " + ChatColor.RED + "=============");
                                    sender.sendMessage(ChatColor.DARK_RED + "Can't find that mob! " + ChatColor.GOLD + "Here's a list of mobs:");
                                    sender.sendMessage(ChatColor.AQUA + "Zombie, Skeleton, Blaze, CaveSpider, Ghast,");
                                    sender.sendMessage(ChatColor.AQUA + "Giant, MagmaCube, Creeper, Enderman, EnderDragon,");
                                    sender.sendMessage(ChatColor.AQUA + "Spider, Wolf, PigZombie, Cow, Chicken, MushroomCow,");
                                    sender.sendMessage(ChatColor.AQUA + "Pig, Slime, Snowman, Squid, and Villager.");
                                    sender.sendMessage(ChatColor.RED + "=========================================");
                                }
                            } else {
                                sender.sendMessage(ChatColor.RED + "=============" + ChatColor.AQUA + " [ ArrowsPlus ] " + ChatColor.RED + "=============");
                                sender.sendMessage(ChatColor.GOLD + "Please specify a mob! Here's a list of mobs:");
                                sender.sendMessage(ChatColor.AQUA + "Zombie, Skeleton, Blaze, CaveSpider, Ghast,");
                                sender.sendMessage(ChatColor.AQUA + "Giant, MagmaCube, Creeper, Enderman, Enderdragon,");
                                sender.sendMessage(ChatColor.AQUA + "Spider, Wolf, PigZombie, Cow, Chicken, MushroomCow,");
                                sender.sendMessage(ChatColor.AQUA + "Pig, Slime, Snowman, Squid, and Villager.");
                                sender.sendMessage(ChatColor.RED + "=========================================");
                            }
                        } else {
                            sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Can't find enchantment!");
                        }
                    im.setLore(l);
                    player1.getInventory().getItemInMainHand().setItemMeta(im);
                    return true;
                }
                Player player = (Player)sender;
                ItemMeta itemMeta = player.getInventory().getItemInMainHand().getItemMeta();
            } else {
                sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "You can only bind ArrowsPlus enchantments to a bow!");
            }
        } else {
            sender.sendMessage(ChatColor.AQUA + "[ArrowsPlus] " + ChatColor.GOLD + "Only players can bind ArrowsPlus enchantments to a bow!");
        }
        return true;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void ShootArrow(EntityShootBowEvent event) {
        final LivingEntity player = event.getEntity();
        if (player instanceof Player) {
            Material im = ((Player)player).getInventory().getItemInMainHand().getType();
            if (!(event.getProjectile() instanceof Arrow))
                return;
            final Arrow arrow = (Arrow)event.getProjectile();
            if (((Player)player).getInventory().getItemInMainHand().getItemMeta() != null)
                if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore() != null && !((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().isEmpty()) {
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Firework I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector()))
                                        cancel();
                                    this.oldLocation = newLoc;
                                }
                                if (this.oldLocation != null)
                                    try {
                                        BowEnchants.this.fplayer.playFirework(
                                                arrow.getWorld(),
                                                arrow.getLocation(),
                                                FireworkEffect.builder()
                                                        .with(FireworkEffect.Type.BURST)
                                                        .withColor(Color.RED)
                                                        .withFade(Color.RED)
                                                        .build());
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 2L, 4L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Firework II"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector()))
                                        cancel();
                                    this.oldLocation = newLoc;
                                }
                                if (this.oldLocation != null)
                                    try {
                                        BowEnchants.this.fplayer.playFirework(
                                                arrow.getWorld(),
                                                arrow.getLocation(),
                                                FireworkEffect.builder()
                                                        .with(FireworkEffect.Type.BURST)
                                                        .withColor(Color.BLUE)
                                                        .withFade(Color.BLUE)
                                                        .build());
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 2L, 4L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Firework III"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector()))
                                        cancel();
                                    this.oldLocation = newLoc;
                                }
                                if (this.oldLocation != null)
                                    try {
                                        BowEnchants.this.fplayer.playFirework(
                                                arrow.getWorld(),
                                                arrow.getLocation(),
                                                FireworkEffect.builder()
                                                        .with(FireworkEffect.Type.BURST)
                                                        .withColor(Color.GREEN)
                                                        .withFade(Color.GREEN)
                                                        .build());
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 2L, 4L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Firework IV"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector()))
                                        cancel();
                                    this.oldLocation = newLoc;
                                }
                                if (this.oldLocation != null)
                                    try {
                                        BowEnchants.this.fplayer.playFirework(
                                                arrow.getWorld(),
                                                arrow.getLocation(),
                                                FireworkEffect.builder()
                                                        .with(FireworkEffect.Type.BURST)
                                                        .withColor(Color.AQUA)
                                                        .withFade(Color.AQUA)
                                                        .build());
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 2L, 4L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Firework V"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector()))
                                        cancel();
                                    this.oldLocation = newLoc;
                                }
                                if (this.oldLocation != null)
                                    try {
                                        BowEnchants.this.fplayer.playFirework(
                                                arrow.getWorld(),
                                                arrow.getLocation(),
                                                FireworkEffect.builder()
                                                        .with(FireworkEffect.Type.BURST)
                                                        .withColor(Color.PURPLE)
                                                        .withFade(Color.PURPLE)
                                                        .build());
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 2L, 4L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Firework VI"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector()))
                                        cancel();
                                    this.oldLocation = newLoc;
                                }
                                if (this.oldLocation != null)
                                    try {
                                        BowEnchants.this.fplayer.playFirework(
                                                arrow.getWorld(),
                                                arrow.getLocation(),
                                                FireworkEffect.builder()
                                                        .with(FireworkEffect.Type.BURST)
                                                        .withColor(Color.WHITE)
                                                        .withFade(Color.WHITE)
                                                        .build());
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 2L, 4L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Firework VII"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector()))
                                        cancel();
                                    this.oldLocation = newLoc;
                                }
                                if (this.oldLocation != null)
                                    try {
                                        BowEnchants.this.fplayer.playFirework(
                                                arrow.getWorld(),
                                                arrow.getLocation(),
                                                FireworkEffect.builder()
                                                        .with(FireworkEffect.Type.BURST)
                                                        .withColor(Color.BLACK)
                                                        .withFade(Color.BLACK)
                                                        .build());
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 2L, 4L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Firework VIII"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector()))
                                        cancel();
                                    this.oldLocation = newLoc;
                                }
                                if (this.oldLocation != null)
                                    try {
                                        BowEnchants.this.fplayer.playFirework(
                                                arrow.getWorld(),
                                                arrow.getLocation(),
                                                FireworkEffect.builder()
                                                        .with(FireworkEffect.Type.BURST)
                                                        .withColor(Color.YELLOW)
                                                        .withFade(Color.YELLOW)
                                                        .build());
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 2L, 4L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Firework IX"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector()))
                                        cancel();
                                    this.oldLocation = newLoc;
                                }
                                if (this.oldLocation != null)
                                    try {
                                        BowEnchants.this.fplayer.playFirework(
                                                arrow.getWorld(),
                                                arrow.getLocation(),
                                                FireworkEffect.builder()
                                                        .with(FireworkEffect.Type.BURST)
                                                        .withColor(Color.ORANGE)
                                                        .withFade(Color.ORANGE)
                                                        .build());
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 2L, 4L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Firework X"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector()))
                                        cancel();
                                    this.oldLocation = newLoc;
                                }
                                if (this.oldLocation != null)
                                    try {
                                        BowEnchants.this.fplayer.playFirework(
                                                arrow.getWorld(),
                                                arrow.getLocation(),
                                                FireworkEffect.builder()
                                                        .with(FireworkEffect.Type.BURST)
                                                        .withColor(Color.fromRGB(255, 0, 192))
                                                        .withFade(Color.fromRGB(255, 0, 192))
                                                        .build());
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 2L, 4L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Zombie Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.ZOMBIE.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.ZOMBIE.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Skeleton Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.SKELETON.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.SKELETON.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Blaze Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.BLAZE.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.BLAZE.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "CaveSpider Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.CAVE_SPIDER.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.CAVE_SPIDER.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Ghast Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.GHAST.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.GHAST.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Giant Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.GIANT.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.GIANT.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "MagmaCube Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.MAGMA_CUBE.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.MAGMA_CUBE.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Creeper Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.CREEPER.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.CREEPER.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Enderman Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.ENDERMAN.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.ENDERMAN.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "EnderDragon Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.ENDER_DRAGON.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.ENDER_DRAGON.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Spider Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.SPIDER.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.SPIDER.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Wolf Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.WOLF.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.WOLF.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "PigZombie Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.ZOMBIFIED_PIGLIN.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.ZOMBIFIED_PIGLIN.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Cow Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.COW.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.COW.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Chicken Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.CHICKEN.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.CHICKEN.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "MushroomCow Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.MOOSHROOM.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.MOOSHROOM.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Pig Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.PIG.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.PIG.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Slime Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.SLIME.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.SLIME.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Snowman Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.SNOW_GOLEM.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.SNOW_GOLEM.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Squid Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.SQUID.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.SQUID.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Villager Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().spawn(this.oldLocation, EntityType.VILLAGER.getEntityClass());
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().spawn(this.oldLocation, EntityType.VILLAGER.getEntityClass());
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Explosion I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().createExplosion(arrow.getLocation(), 2.0F);
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().createExplosion(arrow.getLocation(), 2.0F);
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Explosion II"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().createExplosion(arrow.getLocation(), 4.0F);
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().createExplosion(arrow.getLocation(), 4.0F);
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Explosion III"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().createExplosion(arrow.getLocation(), 8.0F);
                                    arrow.remove();
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().createExplosion(arrow.getLocation(), 8.0F);
                                        arrow.remove();
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Slowness Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    Location loc = arrow.getLocation();
                                    ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                    proj.getEffects().add(new PotionEffect(PotionEffectType.SLOWNESS, 100, 50));
                                    ItemStack item = proj.getItem();
                                    proj.setShooter(player);
                                    proj.setItem(item);
                                    proj.setVelocity(new Vector(0, -10, 0));
                                    Location location = arrow.getLocation();
                                    for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                        if (e instanceof LivingEntity)
                                            ((LivingEntity)e)
                                                    .addPotionEffect(new PotionEffect(
                                                            PotionEffectType.SLOWNESS, 150, 50));
                                    }
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        Location loc = arrow.getLocation();
                                        ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                        proj.getEffects().add(new PotionEffect(PotionEffectType.SLOWNESS, 150, 50));
                                        ItemStack item = proj.getItem();
                                        proj.setShooter(player);
                                        proj.setItem(item);
                                        proj.setVelocity(new Vector(0, -10, 0));
                                        Location location = arrow.getLocation();
                                        for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                            if (e instanceof LivingEntity)
                                                ((LivingEntity)e)
                                                        .addPotionEffect(new PotionEffect(
                                                                PotionEffectType.SLOWNESS, 150, 50));
                                        }
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Poison Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    Location loc = arrow.getLocation();
                                    ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                    proj.getEffects().add(new PotionEffect(PotionEffectType.POISON, 200, 2));
                                    ItemStack item = proj.getItem();
                                    proj.setShooter(player);
                                    proj.setItem(item);
                                    proj.setVelocity(new Vector(0, -10, 0));
                                    Location location = arrow.getLocation();
                                    for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                        if (e instanceof LivingEntity)
                                            ((LivingEntity)e)
                                                    .addPotionEffect(new PotionEffect(
                                                            PotionEffectType.POISON, 200, 2));
                                    }
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        Location loc = arrow.getLocation();
                                        ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                        proj.getEffects().add(new PotionEffect(PotionEffectType.POISON, 200, 2));
                                        ItemStack item = proj.getItem();
                                        proj.setShooter(player);
                                        proj.setItem(item);
                                        proj.setVelocity(new Vector(0, -10, 0));
                                        Location location = arrow.getLocation();
                                        for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                            if (e instanceof LivingEntity)
                                                ((LivingEntity)e)
                                                        .addPotionEffect(new PotionEffect(
                                                                PotionEffectType.POISON, 200, 2));
                                        }
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Speed Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    Location loc = arrow.getLocation();
                                    ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                    proj.getEffects().add(new PotionEffect(PotionEffectType.SPEED, 400, 2));
                                    ItemStack item = proj.getItem();
                                    proj.setShooter(player);
                                    proj.setItem(item);
                                    proj.setVelocity(new Vector(0, -10, 0));
                                    Location location = arrow.getLocation();
                                    for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                        if (e instanceof LivingEntity)
                                            ((LivingEntity)e)
                                                    .addPotionEffect(new PotionEffect(
                                                            PotionEffectType.SPEED, 400, 2));
                                    }
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        Location loc = arrow.getLocation();
                                        ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                        proj.getEffects().add(new PotionEffect(PotionEffectType.SPEED, 400, 2));
                                        ItemStack item = proj.getItem();
                                        proj.setShooter(player);
                                        proj.setItem(item);
                                        proj.setVelocity(new Vector(0, -10, 0));
                                        Location location = arrow.getLocation();
                                        for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                            if (e instanceof LivingEntity)
                                                ((LivingEntity)e)
                                                        .addPotionEffect(new PotionEffect(
                                                                PotionEffectType.SPEED, 400, 2));
                                        }
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Jump Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    Location loc = arrow.getLocation();
                                    ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                    proj.getEffects().add(new PotionEffect(PotionEffectType.JUMP_BOOST, 400, 2));
                                    ItemStack item = proj.getItem();
                                    proj.setShooter(player);
                                    proj.setItem(item);
                                    proj.setVelocity(new Vector(0, -10, 0));
                                    Location location = arrow.getLocation();
                                    for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                        if (e instanceof LivingEntity)
                                            ((LivingEntity)e)
                                                    .addPotionEffect(new PotionEffect(
                                                            PotionEffectType.JUMP_BOOST, 400, 2));
                                    }
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        Location loc = arrow.getLocation();
                                        ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                        proj.getEffects().add(new PotionEffect(PotionEffectType.JUMP_BOOST, 400, 2));
                                        ItemStack item = proj.getItem();
                                        proj.setShooter(player);
                                        proj.setItem(item);
                                        proj.setVelocity(new Vector(0, -10, 0));
                                        Location location = arrow.getLocation();
                                        for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                            if (e instanceof LivingEntity)
                                                ((LivingEntity)e)
                                                        .addPotionEffect(new PotionEffect(
                                                                PotionEffectType.JUMP_BOOST, 400, 2));
                                        }
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Blindness Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    Location loc = arrow.getLocation();
                                    ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                    proj.getEffects().add(new PotionEffect(PotionEffectType.BLINDNESS, 200, 2));
                                    ItemStack item = proj.getItem();
                                    proj.setShooter(player);
                                    proj.setItem(item);
                                    proj.setVelocity(new Vector(0, -10, 0));
                                    Location location = arrow.getLocation();
                                    for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                        if (e instanceof LivingEntity)
                                            ((LivingEntity)e)
                                                    .addPotionEffect(new PotionEffect(
                                                            PotionEffectType.BLINDNESS, 200, 2));
                                    }
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        Location loc = arrow.getLocation();
                                        ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                        proj.getEffects().add(new PotionEffect(PotionEffectType.BLINDNESS, 200, 2));
                                        ItemStack item = proj.getItem();
                                        proj.setShooter(player);
                                        proj.setItem(item);
                                        proj.setVelocity(new Vector(0, -10, 0));
                                        Location location = arrow.getLocation();
                                        for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                            if (e instanceof LivingEntity)
                                                ((LivingEntity)e)
                                                        .addPotionEffect(new PotionEffect(
                                                                PotionEffectType.BLINDNESS, 200, 2));
                                        }
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Confusion Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    Location loc = arrow.getLocation();
                                    ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                    proj.getEffects().add(new PotionEffect(PotionEffectType.NAUSEA, 200, 2));
                                    ItemStack item = proj.getItem();
                                    proj.setShooter(player);
                                    proj.setItem(item);
                                    proj.setVelocity(new Vector(0, -10, 0));
                                    Location location = arrow.getLocation();
                                    for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                        if (e instanceof LivingEntity)
                                            ((LivingEntity)e)
                                                    .addPotionEffect(new PotionEffect(
                                                            PotionEffectType.NAUSEA, 200, 2));
                                    }
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        Location loc = arrow.getLocation();
                                        ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                        proj.getEffects().add(new PotionEffect(PotionEffectType.NAUSEA, 200, 2));
                                        ItemStack item = proj.getItem();
                                        proj.setShooter(player);
                                        proj.setItem(item);
                                        proj.setVelocity(new Vector(0, -10, 0));
                                        Location location = arrow.getLocation();
                                        for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                            if (e instanceof LivingEntity)
                                                ((LivingEntity)e)
                                                        .addPotionEffect(new PotionEffect(
                                                                PotionEffectType.NAUSEA, 200, 2));
                                        }
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Invisibility Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    Location loc = arrow.getLocation();
                                    ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                    proj.getEffects().add(new PotionEffect(PotionEffectType.INVISIBILITY, 400, 2));
                                    ItemStack item = proj.getItem();
                                    proj.setShooter(player);
                                    proj.setItem(item);
                                    proj.setVelocity(new Vector(0, -10, 0));
                                    Location location = arrow.getLocation();
                                    for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                        if (e instanceof LivingEntity)
                                            ((LivingEntity)e)
                                                    .addPotionEffect(new PotionEffect(
                                                            PotionEffectType.INVISIBILITY, 400, 2));
                                    }
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        Location loc = arrow.getLocation();
                                        ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                        proj.getEffects().add(new PotionEffect(PotionEffectType.INVISIBILITY, 400, 2));
                                        ItemStack item = proj.getItem();
                                        proj.setShooter(player);
                                        proj.setItem(item);
                                        proj.setVelocity(new Vector(0, -10, 0));
                                        Location location = arrow.getLocation();
                                        for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                            if (e instanceof LivingEntity)
                                                ((LivingEntity)e)
                                                        .addPotionEffect(new PotionEffect(
                                                                PotionEffectType.INVISIBILITY, 400, 2));
                                        }
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "NightVision Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    Location loc = arrow.getLocation();
                                    ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                    proj.getEffects().add(new PotionEffect(PotionEffectType.NIGHT_VISION, 400, 2));
                                    ItemStack item = proj.getItem();
                                    proj.setShooter(player);
                                    proj.setItem(item);
                                    proj.setVelocity(new Vector(0, -10, 0));
                                    Location location = arrow.getLocation();
                                    for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                        if (e instanceof LivingEntity)
                                            ((LivingEntity)e)
                                                    .addPotionEffect(new PotionEffect(
                                                            PotionEffectType.NIGHT_VISION, 400, 2));
                                    }
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        Location loc = arrow.getLocation();
                                        ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                        proj.getEffects().add(new PotionEffect(PotionEffectType.NIGHT_VISION, 400, 2));
                                        ItemStack item = proj.getItem();
                                        proj.setShooter(player);
                                        proj.setItem(item);
                                        proj.setVelocity(new Vector(0, -10, 0));
                                        Location location = arrow.getLocation();
                                        for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                            if (e instanceof LivingEntity)
                                                ((LivingEntity)e)
                                                        .addPotionEffect(new PotionEffect(
                                                                PotionEffectType.NIGHT_VISION, 400, 2));
                                        }
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Weakness Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    Location loc = arrow.getLocation();
                                    ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                    proj.getEffects().add(new PotionEffect(PotionEffectType.WEAKNESS, 200, 2));
                                    ItemStack item = proj.getItem();
                                    proj.setShooter(player);
                                    proj.setItem(item);
                                    proj.setVelocity(new Vector(0, -10, 0));
                                    Location location = arrow.getLocation();
                                    for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                        if (e instanceof LivingEntity)
                                            ((LivingEntity)e)
                                                    .addPotionEffect(new PotionEffect(
                                                            PotionEffectType.WEAKNESS, 200, 2));
                                    }
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        Location loc = arrow.getLocation();
                                        ThrownPotion proj = (ThrownPotion)loc.getWorld().spawn(loc, ThrownPotion.class);
                                        proj.getEffects().add(new PotionEffect(PotionEffectType.WEAKNESS, 200, 2));
                                        ItemStack item = proj.getItem();
                                        proj.setShooter(player);
                                        proj.setItem(item);
                                        proj.setVelocity(new Vector(0, -10, 0));
                                        Location location = arrow.getLocation();
                                        for (Entity e : BowEnchants.this.getEntitiesNearLocation(location, 2)) {
                                            if (e instanceof LivingEntity)
                                                ((LivingEntity)e)
                                                        .addPotionEffect(new PotionEffect(
                                                                PotionEffectType.WEAKNESS, 200, 2));
                                        }
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                    if (((Player)player).getInventory().getItemInMainHand().getItemMeta().getLore().contains("" + ChatColor.AQUA + ChatColor.BOLD + "Lightning Arrow I"))
                        (new BukkitRunnable() {
                            private Location oldLocation;

                            private int timer = 100;

                            public final void run() {
                                if (this.timer-- <= 0 || !arrow.isValid()) {
                                    arrow.getWorld().strikeLightning(arrow.getLocation());
                                    cancel();
                                } else if (this.oldLocation == null) {
                                    this.oldLocation = arrow.getLocation();
                                } else {
                                    Location newLoc = arrow.getLocation();
                                    if (this.oldLocation.toVector().equals(
                                            newLoc.toVector())) {
                                        arrow.getWorld().strikeLightning(arrow.getLocation());
                                        cancel();
                                    }
                                    this.oldLocation = newLoc;
                                }
                            }
                        }).runTaskTimer((Plugin)this.plugin, 0L, 1L);
                }
        }
    }

    public List<Entity> getEntitiesNearLocation(Location loc, int radius) {
        List<Entity> r = new ArrayList();
        int rs = radius * radius;
        Location tmp = new Location(loc.getWorld(), 0.0D, 0.0D, 0.0D);
        for (Entity e : loc.getWorld().getEntities()) {
            if (e.getLocation(tmp).distanceSquared(loc) < rs)
                r.add(e);
        }
        return r;
    }
}
