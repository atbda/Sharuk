public interface MessageRenderer {
    void setMessageProvider(MessageProvider provider);//used for DI
    void render();
}
