abstract class GameEntity(
    var health: Int,
    private var damage: Int,
    private val name: String
) {

    fun getName(): String = name

    fun getHealth(): Int = health

    fun setHealth(health: Int) {
        this.health = if (health < 0) 0 else health
    }

    fun getDamage(): Int = damage

    fun setDamage(damage: Int) {
        this.damage = damage
    }

    override fun toString(): String {
        return "$name health: $health damage: $damage"
    }
}