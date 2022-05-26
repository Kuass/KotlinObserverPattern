class TopicSubscriber(
    private val name: String,
    private val topic: Subject
) : Observer {

    override fun update() {
        val msg = topic.getUpdate(this)
        println("$name got notified about $msg")
    }
}