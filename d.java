package ʵ��4;
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
        String sourcePath = "C:\\Users\\xmz\\Desktop\\�ı��ļ�B.txt";//Դ�ļ�·��(*.*)
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(sourcePath));
            String str;
            while((str = br.readLine()) != null) {//���ж�ȡ
                sb.append(str);
                for (int i = 7; i < sb.length(); i = i + 15) {
    				sb.insert(i, ",");
    			}
    			for (int i = 15; i < sb.length() + 1; i = i + 16) {
    				sb.insert(i, "��");
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
     
        //д���ļ�
        String targetPath = "C:\\Users\\xmz\\Desktop\\�ı��ļ�A.txt";//Ŀ���ļ�·��
        File f = new File(targetPath);//�½��ļ�
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
     		System.out.println("���������ֲ����ڹ�ʫ�г��ּ���:");
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
     		if(count==0) {System.out.println("�����������û�г���");}
     		else{System.out.println("������ֹ�������"+count+"��");}
     		
     		Scanner scanner;
     		 Student student = new Student();
             while (true) {
                 try {
                     System.out.println("����");
                     scanner = new Scanner(System.in);
                     String S = scanner.nextLine();
                     if (S.matches("[0-9a-zA-Z]"))
                         throw new AException();
                     else
                         student.setName(S);
                     break;
                 } catch (AException e) {
                     System.out.println("�������������������������");
                 }
             }
             System.out.println("�༶");
             student.setTeam(scanner.next());
             while (true) {
                 try {
                     System.out.println("ѧ��");
                     scanner = new Scanner(System.in);
                     String S = scanner.next();
                     if (S.matches("[^0-9]"))
                         throw new AException();
                     else
                         student.setNumber(S);
                     break;
                 } catch (AException e) {
                     System.out.println("�������ѧ����������������");
                 }
             }
             System.out.println(student);
             sb.append(student);
    	}catch (Exception e) {
		System.err.println("�����쳣" + e.toString());
	}
}}