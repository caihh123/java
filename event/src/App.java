public class App {

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        // 定义一个简单事件源类
        class SimpleEventSource {
            private final String name;

            SimpleEventSource(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }

        // 创建监听器
        EventListener<SimpleEventSource> listener = event -> {
            SimpleEventSource source = event.getSource();
            System.out.println("Event received from: " + source.getName());
        };

        // 注册监听器
        eventManager.registerListener(SimpleEventSource.class, listener);

        // 触发事件
        SimpleEventSource source = new SimpleEventSource("Source1");
        Event<SimpleEventSource> event = new Event<>(source);
        eventManager.fireEvent(event);

        // 注销监听器
        eventManager.unregisterListener(SimpleEventSource.class, listener);

        // 触发事件，不会有输出
        eventManager.fireEvent(event);
    }
}
