fun main() {
    val topic = Topic()
    val a = TopicSubscriber("a", topic)
    val b = TopicSubscriber("b", topic)
    val c = TopicSubscriber("c", topic)
    topic.register(a)
    topic.register(b)
    topic.register(c)

    topic.postMessage("hello world!")
}