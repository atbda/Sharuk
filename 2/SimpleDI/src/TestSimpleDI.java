/**
 * In this example task 1, 2 and 3 are supportive tasks
 * whereas task 4 is the main business operation.
 * The ideally a project must focus on business operation(task4) and
 * other supportive tasks(1,2,3) should be handled by technology itself(like Personal Assistant, ie : Spring Framework)
 * Note: Next example will discuss on Spring DI
 */
public class TestSimpleDI {
    public static void main(String[] args) {
        //1. Prepare Provider
        MessageProvider mp=new HelloWorldMessageProvider();
        //MessageProvider mp=new OrderMessageProvider();
      
        //2. Prepare Renderer
        //MessageRenderer mr=new StandardOutMessageRenderer();
        MessageRenderer mr=new FileMessageRenderer();
        //3. Dependency Injection for Renderer
        mr.setMessageProvider(mp);//Dependency Injection [Case1: PULL]
       
        //4. main business operation (main objective)
        mr.render();
    }    
}
