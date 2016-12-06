
package mychatbot;
import java.util.Scanner;
import bitoflife.chatterbean.AliceBotMother;
import bitoflife.chatterbean.AliceBot;
public class MyChatBot {
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean statusBit = true;
        while(statusBit) {
             try {
            AliceBotMother mother = new AliceBotMother();
            AliceBot myBot = mother.newInstance();
            //Try to get question from User
            System.out.println("Go Ahead ask a question!");
            String ask = input.nextLine();
            if(ask=="Bye"||
                    ask=="bye") 
                statusBit = false;
            if(statusBit) {
                String answer = myBot.respond(ask);
            System.out.println(answer);
            }
        } 
        catch(Exception ex) {
            System.err.println(ex.toString());
        }
        }
   }
}
