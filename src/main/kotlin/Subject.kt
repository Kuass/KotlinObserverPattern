interface Subject {
    fun register(obj: Observer)
    fun unregister(obj: Observer)
    fun notifyObservers()
    fun getUpdate(obj: Observer): String
}