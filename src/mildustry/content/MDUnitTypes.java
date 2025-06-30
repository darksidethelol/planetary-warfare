package mildustry.content;

import arc.graphics.*;
import arc.math.geom.Rect;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.ammo.ItemAmmoType;
import mindustry.entities.bullet.*;
/*import mindustry.entities.effect.*;
import mindustry.entities.part.RegionPart;
import mindustry.type.StatusEffect;*/
import mindustry.content.Items;
/*import mindustry.content.Bullets;
import mindustry.graphics.Pal;
import mindustry.type.weapons.*;*/
import mindustry.content.Fx;

import static mindustry.Vars.*;


public class MDUnitTypes{
	public static UnitType
			baron;

	public static void load(){

		baron = new UnitType("baron"){{
				speed = 2f;
				hitSize = 15f;
				health = 100;
				armor = 10f;
				ammoType = new ItemAmmoType(Items.blastCompound);
				range = 30 * tilesize;
				ammoCapacity = 25;
				treadRects = new Rect[]{
						// 0
						new Rect(8 - 96 / 2f, 33 - 144 / 2f, 16, 66)
				};
				weapons.add(new Weapon("100mm Cannon"){{
					mirror = false;
					//ejectEffect to be changed
					ejectEffect = Fx.casing1;
					shootCone = 0;
					heatColor = Color.valueOf("ffbf00");
					recoil = 5f;
					shake = 2f;
					reload = 5f * 60f;
					cooldownTime = 2f * 60f;
					bullet = new BasicBulletType(16f, 300){{
						sprite = "missile-large";
						smokeEffect = Fx.shootBigSmoke;
						shootEffect = Fx.shootBigColor;
						width = 5f;
						height = 7f;
						lifetime = 40f;
						hitSize = 4f;
						hitColor = backColor = trailColor = Color.valueOf("feb380");
						frontColor = Color.white;
						trailWidth = 1.7f;
						trailLength = 5;
						despawnEffect = hitEffect = Fx.hitBulletColor;
					}};
				}});
		}};
	}
}