package net.teramod.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

public class BeamEntity extends Entity {

    private Entity target;

    public BeamEntity(EntityType<?> type, Level level) {
        super(type, level);
    }

    public void setTarget(Entity target) {
        this.target = target;
    }

    public Entity getTarget() {
        return target;
    }

    @Override
    protected void defineSynchedData() {
    }

    @Override
    public void tick() {
        super.tick();

        if(tickCount > 2) {
            discard();
        }
    }

    @Override
    protected void readAdditionalSaveData(net.minecraft.nbt.CompoundTag tag) {
    }

    @Override
    protected void addAdditionalSaveData(net.minecraft.nbt.CompoundTag tag) {
    }
    @Override
    public boolean shouldRenderAtSqrDistance(
            double distance) {
        return true;
    }
    @Override
    public AABB getBoundingBoxForCulling() {
        return new AABB(
                getX() - 100,
                getY() - 100,
                getZ() - 100,
                getX() + 100,
                getY() + 100,
                getZ() + 100
        );
    }
}