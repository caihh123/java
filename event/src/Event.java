
// 事件类
public class Event<T> {
    private final T source;

    public Event(T source) {
        this.source = source;
    }

    public T getSource() {
        return source;
    }
}



