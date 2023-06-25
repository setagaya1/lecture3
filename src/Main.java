// Shift を 2 回押して 'どこでも検索' ダイアログを開き、`show whitespaces` と入力して
// Enter キーを押します。これでコードに空白文字が表示されます。
/*
世田谷（JAVA.23.05）第３回講義の課題提出
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //List,Mapに格納する要素の作成（自作Employeeクラス）
        Employee employee1 = new Employee("田中",2018,false);
        Employee employee2 = new Employee("鈴木",2020,true);
        Employee employee3 = new Employee("佐藤",2021,false);
        Employee employee4 = new Employee("佐々木",2015,true);
        Employee employee5 = new Employee("轟",2020,false);

        //Listの作成
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        System.out.println(employees.size());

        //Listの要素の取得、表示
        for (Employee employee: employees) {
            System.out.print(employee.getName());
            System.out.print(","+employee.getJoinedYear());
            System.out.print(","+employee.isRetired());
            System.out.println("");
        }

        //Listの要素の取得、判定
        int count = 0;
        for (Employee employee: employees) {
            if (employee.getName().equals("鈴木")) {
                count++;
            }
        }
        System.out.println("わが社に鈴木さんは" + count + "名います！");

        System.out.println("2020年に入社した方は");
        for (Employee employee: employees) {
            if (employee.getJoinedYear() == 2020) {
                System.out.println(employee.getName());
            }
        }
        System.out.println("です！");

        for (Employee employee : employees) {
            if (!employee.isRetired()) {
                System.out.println(employee.getName() + "さんは現在も在籍しています。");
            } else {
                System.out.println(employee.getName() + "さんは辞職しています。");
            }
        }

        //Mapの作成
        Map<String, Employee> employeeMap = new HashMap<>();
        employeeMap.put("ID0001", employee1);
        employeeMap.put("ID0002", employee2);
        employeeMap.put("ID0003", employee3);
        employeeMap.put("ID0004", employee4);
        employeeMap.put("ID0005", employee5);

        //キーによる検索
        System.out.println(employeeMap.get("ID0001").getName());

        if (employeeMap.containsKey("ID0004")){
            System.out.println("存在する");
        } else {
            System.out.println("存在しない");
        }

        //要素の削除
        employeeMap.remove("ID0004");
        if (employeeMap.containsKey("ID0004")){
            System.out.println("存在する");
        } else {
            System.out.println("存在しない");
        }

        //例外処理
        System.out.println("検索したい職員のIDを入力ください。例：ID0001");
        try {
            String idSearch = new java.util.Scanner(System.in).nextLine();
            System.out.println("検索結果");
            System.out.println("氏名：" + employeeMap.get(idSearch).getName());
            System.out.println("入社年度：" + employeeMap.get(idSearch).getJoinedYear());
            if (employeeMap.get(idSearch).isRetired()) {
                System.out.println("在籍状況：辞職済");
            } else {
                System.out.println("在籍状況：在籍中");
            }
        } catch (NullPointerException e) {
            System.out.println("存在しない、もしくは無効の職員IDです。ID（半角大文字）+****（半角数字4桁）にて入力ください。");
        } finally {
            System.out.println("検索は終了しました。");
        }
    }

}

