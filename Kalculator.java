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
if(ind==-1)return "is not a mathematical example";
   }//a
try{


String str1=s.substring(0,ind);
String str2=s.substring( ind+1,s.length());

if(str1.charAt(0)=='I'||str1.charAt(0)=='V'){ 
if(str2.charAt(0)!='I'&&str2.charAt(0)!='V')return "both numbers must belong to the same number system!";else {str1=RimToNum(str1);str2=RimToNum(str2);  } }

int i1=Integer.parseInt(str1);
int i2=Integer.parseInt(str2);
if(i1<1||i1>9||i2<1||i2>9)return "only a positive number from 1 to 9!";
switch(znak){
case 0:
return ""+(isRim?NumToRim(i1+i2):(i1+i2));
case 1:
 return ""+ (isRim?NumToRim(i1-i2):(i1-i2)); 
case 2:
return ""+(isRim?NumToRim(i1*i2):(i1*i2)); 
case 3:
return ""+(isRim?NumToRim(i1/i2):(i1/i2));}
} catch(Exception ex){return "not correct format"; } 
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


 public String NumToRim(int n){
 String str="";
if(n<=0)return "error! there is no zero is no negative in Roman numbers!";
 while(n>0)
if(n>=50){ str+="L";n-=50;}
else if(n>=40){ str+="XL";n-=40;}
else if(n>=10){str+="X";n-=10;}
 else if(n>=9){str+="IX";n-=9;}
 else if(n>=5){str+="V";n-=5;}
 else if(n>=4){str+="IV";n-=4;}
 else  {str+="I";n--;}
 return str;
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