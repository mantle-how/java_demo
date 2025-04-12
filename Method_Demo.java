//方法是什麼？ : 就像 Python 的 def 一樣，Java 也可以自訂「一段會執行的功能」，我們叫它 方法（method）

public class Method_Demo {
    
    //自訂方法:　接收兩數並且加總回傳總和
    public static int add(int a, int b) {
        int result = a+b;
        
        return result;
        
    }
    public static void say_hello(String name){
        System.out.println("Hello"+ " "+name);
    }
    public static void main(String[] args) {
        
        int sum = add(2,3);
        System.out.println("總和是:"+ sum);
        say_hello("Mantle");
    }

    
}
