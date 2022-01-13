package Day29_ArrayList;

import java.util.Locale;

public class isError {
    public static void main(String[] args) {


    }
    public static boolean isError(String line){
        boolean iserror=false;
        if(line.startsWith("error")){
            iserror=true;
        }else {
            iserror=false;
        }
        return iserror;
    }
}
