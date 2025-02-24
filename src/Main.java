import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String input = "Jack,John,Nick,John";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String names) {
        if (names==null){
            return "";
        }
        String [] nameArray = names.split(",");   // разбиваем строку по запятой
        Set<String> uniqueNames = new LinkedHashSet<>();   // LinkedHashSet - сохраняет порядок добавления элементов и автоматически удаляет дубликаты
        for (String name : nameArray){
            uniqueNames.add(name);
        }
        return String.join(",", uniqueNames);  // String.join - создаёт новую строку с ","

    }
}