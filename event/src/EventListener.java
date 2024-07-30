
// 监听器接口
public interface EventListener<T> {
    void onEvent(Event<T> event);
}
