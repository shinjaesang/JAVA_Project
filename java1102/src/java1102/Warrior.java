package java1102;
import java.util.Random;

public class Warrior implements Character {
    private int hp;
    private int defense;

    public Warrior() {
        this.hp = 50;
        this.defense = 7;
    }

    @Override
    public void attack(Character target) {
        target.takeDamage(getDamage());
        target.counterAttack(this);
    }

    @Override
    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage, 0);
        hp -= actualDamage;
        
    }
    
    @Override
    public void counterAttack(Character target) {
        Random random = new Random();
        int damage = random.nextInt(6) + 5; // 5에서 10 사이의 랜덤한 데미지
        target.takeDamage(damage);
        System.out.println("전사가 몬스터의 반격을 받았습니다.");
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }

	@Override
	public int getDamage() {
		return 1;
	}

	@Override
	public int getHp() {
		return hp;
	}
}