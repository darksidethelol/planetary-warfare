package mildustry.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.annotations.Annotations.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;


public class MDUnitTypes{
    public static unitType
       baron;

}

public static void load(){
    baron = new UnitType("baron"){{
        float unitRange = 32 * tilesize;
        speed = 2f;
        hitSize = 15f;
        health = 100;
        armor = 10f;
        ammoType = new itemAmmoType(Items.blast-compound);
        range = unitRange;

        treadRects = new Rect[]{
                				// 0
                				new Rect(8 - 96 / 2f, 33 - 144 / 2f, 16, 66)
        };
        weapons.addAll(
        				// Main Gun
        				new Weapon("100mm-cannon") {{
        					layerOffset = 0.1f;
        					mirror = false;

        					x = 0f;
        					y = 0f;

        					rotate = true;
        					rotateSpeed = 3;
        					reload = 6f * tick;
        					recoil = 0.5f;
        					shootY = 68f * px;
        					shake = 6f;

        					soundPitchMin = 1.2f;
        					soundPitchMax = soundPitchMin + 0.4f;
        					shootSound = Sfx.wp_k_gunShoot_6;


        					bullet = new TrailBulletType(5f, 140) {{
        					    damage = 300f;
        					    sprite = "missile-large";
        						splashDamage = damage;
        						splashDamageRadius = 2f * tilesize;
        						frontColor = Pal.missileYellow;
        						trailColor = backColor = Pal.missileYellowBack;
        						height = 25f;
        						width = 8f;
        						lifetime = unitRange / speed;
        						knockback = 4f;
        						despawnHit = true;
        						shootEffect = new MultiEffect(
        							Fx.shootPyraFlame,
        							Fx.shootSmallSmoke
        						);
        						hitEffect = new MultiEffect(
        							Fx.blastExplosion,
        							Fx.fireHit,
        							Fx.blastsmoke
        						);
        						trailInterval = 1.6f;
        						trailChance = 0.3f;
        						trailEffect = new MultiEffect(
        							Fx.hitBulletColor,
        							Fx.hitFlameSmall
        						);
        						hitSound = Sounds.explosion;
        						fragBullets = 8;
        						collidesAir = false;
        						fragBullet = fragGlassFrag;
        						status = StatusEffects.burning;
        					}};

        					parts.add(
        						new RegionPart("-gun") {{
        							progress = PartProgress.recoil;
        							under = true;
        							moveY = -9 * px;
        						}}
        					);
        				}};

        }}
    }}