abstract class Hero(
    health: Int,
    damage: Int,
    name: String,
    val ability: SuperAbility
) : GameEntity(health, damage, name), HavingSuperAbility {

    abstract val RPG_Game: Any

    fun attack(boss: Boss) {
        boss.health -= this.damage
    }
}