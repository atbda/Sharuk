/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vikram
 */
public class StandardOutMessageRenderer implements MessageRenderer{
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
            //write message to standard output device.
            System.out.println(provider.getMessage());
        }
    }    
}
