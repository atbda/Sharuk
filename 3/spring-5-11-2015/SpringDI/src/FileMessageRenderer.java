
import java.io.FileWriter;

/**
 *
 * @author Vikram
 */
public class FileMessageRenderer implements MessageRenderer{
    MessageProvider provider;
    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.provider=provider;
    }
    @Override
    public void render() {
        if(provider==null){
            throw new RuntimeException("No MessageProvider configured");
        }else{
            try {
                FileWriter fw = new FileWriter("msg.txt");
                fw.write(provider.getMessage());
                fw.close();
            } catch (Exception ex){}
        }
    }    
}
