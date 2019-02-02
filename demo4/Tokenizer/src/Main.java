import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class Main
{
    public static void main(String[] args) throws IOException, URISyntaxException
    {
        // Get absolute path to the .micro file
        URL res = null;
        String filePath = "C:\\Users\\alexm\\Desktop\\Programs\\MSU_Classes\\2019\\Spring\\Compilers_CSCI_468_001\\labs\\STEP1\\Tokenizer\\grammar\\demo.micro";
        res = Paths.get(filePath).toUri().toURL();

        // Initialize stream of chars from .micro file
        CharStream inp = null;

        // Loop via .micro file and get its text using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(res.openStream()));
        String inputString;

        while ((inputString = br.readLine()) != null){

            // get char steam from the input line
            inp = CharStreams.fromString(inputString);

            littleLexer lexer = new littleLexer(inp);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            littleParser parser = new littleParser(tokens);

            // Get token text which is token name
            String tokenName = parser.getCurrentToken().getText();
            int tokenTypeNum = parser.getCurrentToken().getType();
            System.out.printf("%s: %d\n",tokenName, tokenTypeNum);

        }
    }
}
