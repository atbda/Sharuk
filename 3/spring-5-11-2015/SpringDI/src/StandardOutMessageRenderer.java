/**
 *
 * @author Vikram
 */
public class StandardOutMessageRenderer implements MessageRenderer{
    MessageProvider provider;
    @Override
    public void setMessageProvider(MessageProvider provider) {
        System.out.println("---------setMessageProvider----------");
        this.provider=provider;
    }
    @Override
    public void render() {
        if(provider==null){
            throw new RuntimeException("No MessageProvider configured");
        }else{
            //write message to standard output device.
            System.out.println(provider.getMessage());
        }
    }    
}
