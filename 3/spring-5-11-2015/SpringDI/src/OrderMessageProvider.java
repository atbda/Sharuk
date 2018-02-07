public class OrderMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        System.out.println("------------OrderMessageProvider.getMessage()------------");
        return "Wake up early morning";
    }    
}
