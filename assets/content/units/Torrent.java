import java.util.List;

public class Vehicle {
    String type;
    String description;
    String name;
    int hitSize;
    boolean omniMovement;
    int health;
    int armor;
    double speed;
    boolean targetAir;
    boolean targetGround;
    double rotateSpeed;
    int range;
    int treadPullOffset;
    List<TreadRect> treadRects;
    int envEnabled;
    int envDisabled;
    String outlineColor;
    int layerOffset;
    List<Weapon> weapons;

    public static class TreadRect {
        int x;
        int y;
        int width;
        int height;
    }

    public static class Weapon {
        String name;
        int x;
        int y;
        double rotateSpeed;
        boolean targetAir;
        boolean targetGround;
        boolean mirror;
        boolean rotate;
        String shootEffect;
        int layerOffset;
        boolean ignoreRotation;
        boolean followRotation;
        boolean rotateShooting;
        int reload;
        double recoil;
        String shootSound;
        Bullet bullet;

        public static class Bullet {
            String type;
            int lifetime;
            double speed;
            int damage;
            String spawnUnit;
        }
    }
}