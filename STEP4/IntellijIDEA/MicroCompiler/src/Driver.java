/**
 * Montana State University
 * Class: Compilers - CSCI 468
 * @author Olexandr Matveyev, Mandy Hawkins, Abdulrahman Alhitm, Michael Seeley
 */

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Driver
{
    /**
     * mmain function should accept one argument witch is file name of .micro
     * @param args: String
     */
    public static void main(String[] args)
    {
        String fileName = null;
        String path = null;
        String filePath = null;

        // Get absolute path of the running Driver.class
        Path currentDir = Paths.get(".");
        path = currentDir.toAbsolutePath().toString();

        // Initialize URL
        URL res = null;

        if(args[0] != null)
        {
            // Combine "absolute path of the running Driver.class" and "file name"
            fileName = args[0];
            filePath = path + "/" + fileName;

            try
            {
                // Get resource from the file path
                res = Paths.get(filePath).toUri().toURL();


                // Run Tokenizer
                // IT IS STEP 1
                //===========================================================================================//
                //MicroTokenizer microTokenizer = new MicroTokenizer(res);
                //microTokenizer.run();
                //===========================================================================================//


                // Initialize and run parser
                // IT IS STEP 2
                //===========================================================================================//
                //MicroParser microParser = new MicroParser(res);
                //microParser.run();
                //===========================================================================================//


                // Building symbol table
                // IT IS STEP 3
                //===========================================================================================//
                DriverSymbolTable driverSymbolTable = new DriverSymbolTable(res);
                driverSymbolTable.run();
                //===========================================================================================//


                // Building symbol table
                // IT IS STEP 4
                //===========================================================================================//


                //===========================================================================================//

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.printf("You did not provide complete file name!\n");
        }
    }
}
