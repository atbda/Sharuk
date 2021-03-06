
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vikram
 */
public class FileMessageRenderer implements 
{
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
