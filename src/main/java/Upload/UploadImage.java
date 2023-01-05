package Upload;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import javax.xml.bind.DatatypeConverter;

public class UploadImage

{
    public static String uploadFile(String base64, String pathName, String name)
    {
        String base64String = base64;
        String[] strings = base64String.split(",");
        String extension;
        switch (strings[0]) {//check image's extension
            case "data:image/jpeg;base64":
                extension = ".jpeg";
                break;
            case "data:image/png;base64":
                extension = ".png";
                break;
            default://should write cases for more images types
                extension = ".jpg";
                break;
        }
        //convert base64 string to binary data
        byte[] data = DatatypeConverter.parseBase64Binary(strings[1]);
        String pathServer =pathName+"Img/User/"+name + extension;
        String rs="/Img/User/"+name+extension;
        File fileServer = new File(pathServer);
        System.out.println(fileServer);
        try (OutputStream outputStreamSystem = new BufferedOutputStream(new FileOutputStream(fileServer))) {
            outputStreamSystem.write(data);
            outputStreamSystem.close();
            return rs;
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
    public static ArrayList<String> uploadAllFile(String listImg, String pathName,String name){
        ArrayList<String> list=new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(listImg,"||");
        while (st.hasMoreTokens()){
            String path=uploadFile(st.nextToken(), pathName, name);
            list.add(path);
        }
        return list;
    }

}