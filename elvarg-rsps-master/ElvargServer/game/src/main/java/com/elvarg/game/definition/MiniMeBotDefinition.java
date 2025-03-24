package com.elvarg.game.definition;

import com.elvarg.game.entity.impl.playerbot.fightstyle.FighterPreset;
import com.elvarg.game.model.Location;

public class MiniMeBotDefinition {

    private final String username;

    private final Location spawnLocation;

    private final FighterPreset fighterPreset;

    public MiniMeBotDefinition(String _username, Location _spawnLocation, FighterPreset fighterPreset) {
        this.username = _username;
        this.spawnLocation = _spawnLocation;
        this.fighterPreset = fighterPreset;
    }

    public String getUsername() {
        return this.username;
    }

    public Location getSpawnLocation() {
        return this.spawnLocation;
    }

    public FighterPreset getFighterPreset() {
        return this.fighterPreset;
    }
}
