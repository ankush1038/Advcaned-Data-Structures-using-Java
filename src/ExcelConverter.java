import java.util.Scanner;

public class ExcelConverter {
    public int columnNameToIndex(String columnName) {
        int index = 0;
        for (int i = 0; i < columnName.length(); i++) {
            index = index * 26 + (columnName.charAt(i) - 'A' + 1);
        }
        return index;
    }

    public String indexToColumnName(int index) {
        StringBuilder result = new StringBuilder();
        while (index > 0) {
            index--;
            char ch = (char) (index % 26 + 'A');
            result.append(ch);
            index /= 26;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelConverter converter = new ExcelConverter();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Excel column name: ");
        String columnName = scanner.nextLine();
        int columnIndex = converter.columnNameToIndex(columnName);
        System.out.println("Column '" + columnName + "' has index: " + columnIndex);

        System.out.print("Enter Excel column index: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        String resultColumnName = converter.indexToColumnName(index);
        System.out.println("Index " + index + " corresponds to column: " + resultColumnName);
        scanner.close();
    }
}
