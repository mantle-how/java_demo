public class Student_demo {
    public static void main(String[] args) {
        
        //建立一個學生物件
        Student s1 = new Student("Mantle", 21);

        //呼叫方法
        s1.sayhello();//輸出自我介紹
    }
    
}
// Student s1 = new Student("Mantle", 21);語法解釋:

// Student	                類別名稱（class） → 你自己定義的類型
// s1	                    變數名稱（代表這個學生物件）
// =	                    指派運算子
// new	                    關鍵字：用來建立一個新物件
// Student("Mantle", 21)	呼叫建構子（constructor）並給初始值