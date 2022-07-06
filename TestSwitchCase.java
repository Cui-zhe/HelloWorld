public class TestSwitchCase {
   public static void main(String args[]){
      char grade = 'E';
 
      switch(grade)
      {
         case 'A' :
            System.out.println("优"); 
            break;
         case 'B' :
         case 'C' :
            System.out.println("良");
            break;
         case 'D' :
            System.out.println("及格");
            break;
         case 'F' :
            System.out.println("啥也不是");
            break;
         default :
            System.out.println("未知领域  你是外星人么？");
      }
      System.out.println("你的等级： " + grade);
   }
}