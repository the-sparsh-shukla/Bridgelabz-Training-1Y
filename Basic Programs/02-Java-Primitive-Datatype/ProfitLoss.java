import java.util.*;
public class ProfitLoss{
	public static void main ( String [] args ){
	
	double cp = 129;
	double sp = 191;
	
	double profit = sp - cp ;
	double profitPer = (profit / cp) * 100;
	System.out.println("cost price INR" + cp + "\n" +
		"selling price " + sp + "\n" + 
		"profit INR " + profit + "\n" +
		"profit percentage" + profitPer + "%"
		);
		}
		}