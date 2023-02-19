import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.regex.Pattern;

/* Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/

public class Students {   

public static void main(String[] args) {

    String sql = "select * from students where ";
    String student = "'name' : 'Ivanov', 'country' : 'Russia', 'city' : 'Moscow', 'age' : 'null'";
    String student2 = student.replace(":", "=");
    
    String [] worlds = student2.split(",");        // "\\s*(\\s|,|'|\\.)\\s*"    
    // for (String world : worlds) {
    //     System.out.println(world);
    // }

    // // Или так:
    // Pattern a = Pattern.compile("\\s*(\\s|,|:|'|\\.)\\s*");
    // String [] worlds = a.split(student);
    // for (String world : worlds) {
    //     System.out.println(world);
    // }
   
    StringBuilder str = new StringBuilder();    
    for (int i = 0; i < worlds.length-1; i++) {
        if (worlds[i] == null){
            i++;
        }
        if (i < worlds.length-2) {
            str.append(worlds[i]+ " and ");
        }
        else {
            str.append(worlds[i]);
        }   
        }
  
    String data = sql + str;
    System.out.println(data);
}
}