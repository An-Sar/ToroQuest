package net.torocraft.games.chess.pieces.enities;

import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityRook extends EntityChessPiece implements IChessPiece {

	public EntityRook(World worldIn) {
		super(worldIn);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return null;
	}

}