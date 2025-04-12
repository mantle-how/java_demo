public class Student {
    //屬性(欄位)
    String name;
    int age;

    //建構子 (創建學生時該給的資料)
    public Student(String name, int age){
        this.name = name; //this代表這個物件本身
        this.age = age;
    }
    //方法功能
    public void sayhello(){
        System.out.println("大家好!!我是"+name+"! 我今年"+age+"歲");
    }

}
