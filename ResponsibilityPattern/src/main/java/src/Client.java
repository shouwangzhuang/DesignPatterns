package src;

/**
 * @author shou.wangzhuang
 * @date 2023/1/12 23:19
 */
public class Client {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHandler(handlerB);
        handlerA.handleRequest("requestB");
    }
    static abstract class Handler {
        protected Handler nextHandler;
        public void setNextHandler(Handler handler) {
            this.nextHandler = nextHandler;
        }
        public abstract void handleRequest(String request);
    }

    static class ConcreteHandlerA extends Handler {

        public void handleRequest(String request) {
            if ("requestA".equals(request)) {
                System.out.println(this.getClass().getSimpleName() + "deal with request:" + request);
                return;
            }
            if (this.nextHandler != null) {
                this.nextHandler.handleRequest(request);
            }
        }
    }

    static  class ConcreteHandlerB extends Handler {

        public void handleRequest(String request) {
            if ("requestB".equals(request)) {
                System.out.println(this.getClass().getSimpleName()+"deal with request:" + request);
                return;
            }
            if (this.nextHandler != null) {
                this.nextHandler.handleRequest(request);
            }
        }
    }
}
