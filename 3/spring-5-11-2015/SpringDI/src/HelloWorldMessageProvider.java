public class HelloWorldMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        System.out.println("------------HelloWorldMessageProvider.getMessage()------------");
        return "Hello World";
    }    
}
