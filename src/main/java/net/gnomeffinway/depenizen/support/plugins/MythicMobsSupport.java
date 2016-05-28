package net.gnomeffinway.depenizen.support.plugins;

import net.aufdemrand.denizen.objects.dEntity;
import net.gnomeffinway.depenizen.commands.mythicmobs.MythicSpawnCommand;
import net.gnomeffinway.depenizen.events.mythicmobs.MythicMobsDeathEvent;
import net.gnomeffinway.depenizen.extensions.mythicmobs.MythicMobsEntityExtension;
import net.gnomeffinway.depenizen.objects.mythicmobs.MythicMobsMob;
import net.gnomeffinway.depenizen.support.Support;

public class MythicMobsSupport extends Support {

    public MythicMobsSupport() {
        registerObjects(MythicMobsMob.class);
        registerProperty(MythicMobsEntityExtension.class, dEntity.class);
        registerScriptEvents(new MythicMobsDeathEvent());
        new MythicSpawnCommand().activate().as("mythicspawn").withOptions("See Documentation", 2);
    }

}
