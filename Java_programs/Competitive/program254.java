import java.io.*;
import java.util.*;

class program254
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FolderName = null;

        System.out.println("Enter directory name :");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists() && fobj.isDirectory())
        {
            FileOutputStream foobj =
                new FileOutputStream("Marvellous.txt");

            File fArr[] = fobj.listFiles();

            byte Buffer[] = new byte[1024];

            int iRet = 0;

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    foobj.write(
                        fArr[i].getName().getBytes()
                    );

                    foobj.write(
                        "\n".getBytes()
                    );

                    FileInputStream fiobj =
                        new FileInputStream(fArr[i]);

                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(
                            Buffer,
                            0,
                            iRet
                        );
                    }

                    fiobj.close();

                    foobj.write(
                        "\n".getBytes()
                    );
                }
            }

            foobj.close();

            System.out.println(
                "File name and data written successfully"
            );
        }
        else
        {
            System.out.println(
                "There is no such directory"
            );
        }

        sobj.close();
    }
}