package addon;

import java.io.IOException;

public class AllureOpen
{
    public static void main(String[] args)
    {
        try
        {
            Process proc = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "allure serve D:\\QA\\QANOMICON\\target\\surefire-reports\n"});
            proc.waitFor();
            proc.destroy();
        }
        catch (IOException e)
        {e.printStackTrace();}
        catch (InterruptedException e)
        {e.printStackTrace();}
    }
}