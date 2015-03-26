import javax.swing.JOptionPane;


public class EnumDemo {
	 public enum MonthSelect1 {January,February, March, April, May, June,July,Auguest, September,October,November, December};
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    MonthSelect1 choice []= {MonthSelect1.January,MonthSelect1.February,MonthSelect1.March,MonthSelect1.April,MonthSelect1.May,
    		MonthSelect1.June,MonthSelect1.July,MonthSelect1.Auguest,MonthSelect1.September,MonthSelect1.October,
    
    		MonthSelect1.November,MonthSelect1.December};
    MonthSelect1 result;
    result= (MonthSelect1)JOptionPane.showInputDialog(null,"Select a month","Month Select",JOptionPane.INFORMATION_MESSAGE,null,choice,choice[2]);
    if(result!=null){
    do{ 
    
   
    	
    	
        switch(result){
        case December: case January: case February:
        JOptionPane.showMessageDialog(null,"Do you want to build a snow man?");
        break;
        case March: case April: case May:
        	JOptionPane.showMessageDialog(null,"Happy Spring days!");
        	break;
        case June: case July: case Auguest:
        	JOptionPane.showMessageDialog(null,"It’s a summer time.");
        	break;
        case September: case October: case November:
        	JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");

	
        	}
        result= (MonthSelect1)JOptionPane.showInputDialog(null,"Select a month","Month Select",JOptionPane.INFORMATION_MESSAGE,null,choice,choice[2]);
        } while(result!=null);
    } 
    System.out.println("Goodbye!");
    }
    
}

