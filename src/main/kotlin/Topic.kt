class Topic : Subject {

    private val observers: MutableSet<Observer> = mutableSetOf()
    private var message: String = ""

    override fun register(obj: Observer) {
        observers.add(obj)
    }

    override fun unregister(obj: Observer) {
        observers.remove(obj)
    }

    override fun notifyObservers() {
        observers.forEach(Observer::update)
    }

    override fun getUpdate(obj: Observer): String {
        return message
    }

    fun postMessage(message: String) {
        println("Enter the message: $message")
        this.message = message
        notifyObservers()
    }

}