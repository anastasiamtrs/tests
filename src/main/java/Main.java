public class Main{
        public static void main(String[] args) {
            BigChungus bugs = new BigChungus("Super dead meme");
            System.out.println("Big Chungus status = " + bugs.getMemeStatus());

            bugs.setMemeStatus("Ok he is a live and well now");

            System.out.println("New Big Chungus status = " + bugs.getMemeStatus());
        }
}
