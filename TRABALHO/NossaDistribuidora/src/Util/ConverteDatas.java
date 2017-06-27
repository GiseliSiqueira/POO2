
package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Giseli
 */
/*
*Classe que realiza a conversao de uma data do tipo String para o tipo Date
*/
public class ConverteDatas {
    
    public Date converteData(String data) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(data);
        return date;
    }
}
