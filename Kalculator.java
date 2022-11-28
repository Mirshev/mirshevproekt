import java.util.Scanner;
public class Kalculator{



  public boolean isRim;





public  Kalculator(String str){


   if(str==null || str.length()<3){ System.out.println("false format ");return;}
str=str.replaceAll(" ","");   
System.out.println(Resultat(str));
}

  





      public String Resultat(String s){

 


int znak=-1;
int ind=-1;
a:{
ind=s.indexOf('+');
znak=0;
if( ind>0)break a;
ind=s.indexOf('-');
znak=1;
if( ind>0)break a;
ind=s.indexOf('*');
znak=2;
if( ind>0)break a;
ind=s.indexOf('/');
znak=3; 
if(ind==-1)return "íå ÿâëÿåòñÿ ìàòåìàòè÷êåñêèì ïðèìåðîì";
   }//a
try{


String str1=s.substring(0,ind);
String str2=s.substring( ind+1,s.length());

if(str1.charAt(0)=='I'||str1.charAt(0)=='V'){ 
if(str2.charAt(0)!='I'&&str2.charAt(0)!='V')return "îáà ÷èñëà äîëæíû ïðèíàäëåæàòü îäíîé ñèñòåìå ÷èñåë!";else {str1=RimToNum(str1);str2=RimToNum(str2);  } }

int i1=Integer.parseInt(str1);
int i2=Integer.parseInt(str2);
switch(znak){
case 0:
return ""+(i1+i2);
case 1:
return ""+(i1-i2<0&&isRim?" â ðèìñêîé ñèñòåìå íåò îòðèöàòåëüíûõ ÷èñåë":i1-i2); 
case 2:
return ""+(i1*i2); 
case 3:
return ""+(i1/i2<0&&isRim?" â ðèìñêîé ñèñòåìå íåò îòðèöàòåëüíûõ ÷èñåë":i1/i2); }
} catch(Exception ex){return "неверные данные!"; } 
return "not correct format"; 
  }


   public String RimToNum(String str){

int n=0;

for(int i=0;i<str.length();i++)
switch(str.charAt(i)){
case 'I': n++;
break;
case 'V': n+=5;
if(i>0)n-=2;
break;
   }

isRim=true;

return ""+n;


} 

           public static void main(String arg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("VVEDITYE PRIMER DLA RESHENIYA:  ");
String s=null;
while(true){
s=scanner.nextLine();

new Kalculator(s);   }
   } 
  }
