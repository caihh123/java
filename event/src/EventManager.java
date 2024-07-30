import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final Map<Class<?>, List<EventListener<?>>> listeners = new HashMap<>();

    // 注册监听器
    public <T> void registerListener(Class<T> eventType, EventListener<T> listener) {
        synchronized (listeners) {
            listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
        }
    }

    // 注销监听器
    public <T> void unregisterListener(Class<T> eventType, EventListener<T> listener) {
        synchronized (listeners) {
            List<EventListener<?>> registeredListeners = listeners.get(eventType);
            if (registeredListeners != null) {
                registeredListeners.remove(listener);
            }
        }
    }

    // 通知事件
    @SuppressWarnings("unchecked")
    public <T> void fireEvent(Event<T> event) {
        Class<?> eventType = event.getSource().getClass();
        List<EventListener<?>> registeredListeners;
        synchronized (listeners) {
            registeredListeners = listeners.get(eventType);
        }
        if (registeredListeners != null) {
            for (EventListener<?> listener : registeredListeners) {
                // noinspection unchecked
                ((EventListener<T>) listener).onEvent(event);
            }
        }
    }
}
