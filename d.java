package 实验4;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d {
	private static Scanner in;
	private static Scanner x;
    public static void main(String[] args) {
    	try {
        StringBuffer sb = new StringBuffer();
        String sourcePath = "C:\\Users\\xmz\\Desktop\\文本文件B.txt";//源文件路径(*.*)
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(sourcePath));
            String str;
            while((str = br.readLine()) != null) {//逐行读取
                sb.append(str);
                for (int i = 7; i < sb.length(); i = i + 15) {
    				sb.insert(i, ",");
    			}
    			for (int i = 15; i < sb.length() + 1; i = i + 16) {
    				sb.insert(i, "。");
    			}
    			for (int i = 16; i < sb.length(); i = i + 17) {
    				sb.insert(i, "\n");
    			}
    			System.out.println(sb);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
     
        //写入文件
        String targetPath = "C:\\Users\\xmz\\Desktop\\文本文件A.txt";//目标文件路径
        File f = new File(targetPath);//新建文件
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(sb.toString());
            bw.flush();
            bw.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        in = new Scanner(System.in);
     		System.out.println("请输入文字查找在古诗中出现几次:");
     		String wenzi = in.nextLine();
     		String a=sb.toString();
     		int indexStart = 0;
     		int count = 0;
     		while(true) {
     			int tm=a.indexOf(wenzi, indexStart);
     			if(tm>=0) {
     				count++;
     				indexStart=tm+wenzi.length();
     			}else {
     				break;
     			}
     		}
     		if(count==0) {System.out.println("这个字在文中没有出现");}
     		else{System.out.println("这个文字共出现了"+count+"次");}
     		
     		Scanner scanner;
     		 Student student = new Student();
             while (true) {
                 try {
                     System.out.println("姓名");
                     scanner = new Scanner(System.in);
                     String S = scanner.nextLine();
                     if (S.matches("[0-9a-zA-Z]"))
                         throw new AException();
                     else
                         student.setName(S);
                     break;
                 } catch (AException e) {
                     System.out.println("您输入的姓名有误，请重新输入");
                 }
             }
             System.out.println("班级");
             student.setTeam(scanner.next());
             while (true) {
                 try {
                     System.out.println("学号");
                     scanner = new Scanner(System.in);
                     String S = scanner.next();
                     if (S.matches("[^0-9]"))
                         throw new AException();
                     else
                         student.setNumber(S);
                     break;
                 } catch (AException e) {
                     System.out.println("您输入的学号有误，请重新输入");
                 }
             }
             System.out.println(student);
             sb.append(student);
    	}catch (Exception e) {
		System.err.println("发生异常" + e.toString());
	}
}}