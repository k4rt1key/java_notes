package codes.practicals;
import java.io.File;
public class Q16 {

    public static void list(String path){
        File dir = new File(path);

        File[] files = dir.listFiles();
        for(int i = 0; i < files.length; i++){
            if(files[i].isDirectory()){
               list(files[i].getPath());
            }
            if(files[i].getName().endsWith(".txt")){
                System.out.println(files[i].getName());
            }
        }
    }
    public static void main(String[] args) {
        list(".");
    }
}
