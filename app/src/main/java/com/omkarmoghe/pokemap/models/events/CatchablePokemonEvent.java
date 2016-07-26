package com.omkarmoghe.pokemap.models.events;

import com.pokegoapi.api.map.pokemon.CatchablePokemon;

import java.util.List;

/**
 * Created by Jon on 7/23/2016.
 */
public class CatchablePokemonEvent implements IEvent {

    private List<CatchablePokemon> catchablePokemon;
    private boolean forNoti;

    public CatchablePokemonEvent(List<CatchablePokemon> catchablePokemon,boolean forNoti) {
        this.catchablePokemon = catchablePokemon;
        this.forNoti=forNoti;
    }

    public List<CatchablePokemon> getCatchablePokemon() {
        return catchablePokemon;
    }

    public void setCatchablePokemon(List<CatchablePokemon> catchablePokemon) {
        this.catchablePokemon = catchablePokemon;
    }

    public boolean isForNoti() {
        return forNoti;
    }
}
