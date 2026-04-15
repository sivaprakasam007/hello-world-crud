public class Main {
    public static void main(String[] args) throws InterruptedException {

        MessageManager manager = new MessageManager();
        manager.create(new Message(1, "wallet balance updated"));

        System.out.println("STATUS:FINISHED");
        System.out.println(manager.readAll().get(0).getText());

        // Keep container alive for Kubernetes
        while (true) {
            Thread.sleep(10000); // sleep 10 seconds
        }
    }
}