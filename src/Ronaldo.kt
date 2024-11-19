class Ronaldo(health: Int, damage: Int, name: String) : Hero(health, damage, name, SuperAbility.SHOOT_BALL) {
    private var roundCounter = 0
    private val ballDamage = 100
    private val chanceToMiss = 30

    override fun applySuperPower(boss: Boss, heroes: Array<Hero>) {
        roundCounter++
        if (roundCounter % 2 == 0) {
            if (RPG_Game.random.nextInt(100) >= chanceToMiss) {
                boss.health -= ballDamage
                println("$name ударил мячом по боссу и нанес $ballDamage урона.")
            } else {
                println("$name промахнулся.")
            }
        }
    }
}package kg.geeks.game.players

class Medic(health: Int, damage: Int, name: String, private val healPoints: Int) : Hero(health, damage, name,
    SuperAbility.HEAL
) {

    override fun applySuperPower(boss: Boss, heroes: Array<Hero>) {
        for (hero in heroes) {
            if (hero.health > 0 && this != hero) {
                hero.health += healPoints
            }
        }
    }
}
